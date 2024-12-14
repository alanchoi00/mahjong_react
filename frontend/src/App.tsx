import { useEffect, useState } from "react";
import "./App.css";
import Header from "./components/Header";
import UploadCard from "./components/UploadCard";
import ResultCard from "./components/ResultCard";
import axios from 'axios';
import { v4 as uuidv4 } from "uuid";
import {createClient} from '@supabase/supabase-js';

interface Detection {
  x: number;
  y: number;
  width: number;
  height: number;
  confidence: number;
  class: string;
  class_id: number;
  detection_id: string;
}

export type Results = Detection[];

export const supabase = createClient(import.meta.env.VITE_SUPABASE_URL, import.meta.env.VITE_SUPABASE_ANON_KEY);

function App() {
  const [file, setFile] = useState<File | null>(null);
  const [isUploading, setIsUploading] = useState<boolean>(false);
  const [uploadImagePath, setUploadImagePath] = useState<string>("");
  const [results, setResults] = useState<Results>([]);
  const [loadingPrediction, setLoadingPrediction] = useState<boolean>(false);

  const handleFileChange = (file: File) => {
    setFile(file);
  };

  const uploadFile = async (file: File) => {
    try {
      const fileId = uuidv4();
      const uploadPath = `public/${fileId}.jpg`;
      const { error } = await supabase.storage
        .from('image_uploads')
        .upload(uploadPath, file, {
          cacheControl: '3600',
          upsert: true,
        });

      if (error) throw error;

      // Get the public URL for the file
      const { data: publicUrlData } = supabase.storage.from('image_uploads').getPublicUrl(uploadPath);
      return publicUrlData.publicUrl;
    } catch (error) {
      console.error('Error uploading file:', error);
      return null;
    }
  };

  const handleUpload = async () => {
    if (!file) return;

    const formData = new FormData();
    formData.append("upload_file", file);

    const publicUrl = await uploadFile(file);

    if (publicUrl) {
      setUploadImagePath(publicUrl);
      startPrediction();
    } else {
      console.error('Failed to upload file');
    }
  };

  const getImage = async (file: Blob | null) => {
    const loadImageBase64 = (file: Blob) => {
      return new Promise((resolve, reject) => {
        const reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = () => resolve(reader.result);
        reader.onerror = (error) => reject(error);
      });
    }

    let image;

    if (file && typeof file === "object") {
      // Load base64 from file input
      image = await loadImageBase64(file);
    } else {
      // Read image from file path
      const imagePath = "/image_demo/demo.jpg"; // Use a relative URL

      const response = await fetch(imagePath);
      const blob = await response.blob();

      // Convert Blob to base64
      image = await loadImageBase64(blob);
      setUploadImagePath(imagePath);
    }

    return image;
  }

  const startPrediction = async () => {

    const image = await getImage(file);
    console.log(image)
    setIsUploading(true);

    try {
      const response = await axios({
        method: "POST",
        url: `https://detect.roboflow.com/${import.meta.env.VITE_ROBOFLOW_MODEL}`,
        params: {
          api_key: import.meta.env.VITE_ROBOFLOW_API_KEY,
        },
        data: image,
        headers: {
          "Content-Type": "application/x-www-form-urlencoded",
        },
      });

      const data = response.data;

      // Use response data to update UI or process results
      setResults(data.predictions);
    } catch (error) {
      console.error("Error during Roboflow API call:", error);
      alert("File upload failed");
    } finally {
      setIsUploading(false);
      setLoadingPrediction(false);
    }
  };

  useEffect(() => {
    startPrediction();
  }, []);

  return (
    <div className="App">
      <Header />
      <main>
        <div className="row row-cols-1 row-cols-md-2 g-4">
          <UploadCard
            isUploading={isUploading}
            onFileChange={handleFileChange}
            onUpload={handleUpload}
          />
          <ResultCard
            isUploading={isUploading}
            uploadImagePath={uploadImagePath}
            results={results}
            loadingPrediction={loadingPrediction}
          />
        </div>
      </main>
    </div>
  );
}

export default App;
