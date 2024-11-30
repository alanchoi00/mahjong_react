import React from "react";

interface UploadCardProps {
  isUploading: boolean;
  onFileChange: (file: File) => void;
  onUpload: () => void;
}

function UploadCard({ isUploading, onFileChange, onUpload }: UploadCardProps) {
  const handleFileInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (e.target.files && e.target.files[0]) {
      onFileChange(e.target.files[0]);
    }
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    onUpload();
  };

  return (
    <div id="upload-card" className="col w-25" style={{ minWidth: "15rem" }}>
      <div className="card p-2">
        <form id="uploadForm" onSubmit={handleSubmit}>
          <div className="mb-3">
            <label htmlFor="formFile" className="form-label">
              Upload Image
            </label>
            <input
              className="form-control"
              type="file"
              id="formFile"
              onChange={handleFileInputChange}
              accept="image/*"
              required
            />
            <button
              type="submit"
              className="btn btn-success mt-3"
              disabled={isUploading}
            >
              {isUploading ? "Uploading..." : "Upload"}
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default UploadCard;
