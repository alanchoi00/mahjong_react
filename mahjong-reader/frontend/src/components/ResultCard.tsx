import {useEffect, useRef} from "react";
import { Results } from "../App";

interface ResultCardProps {
  isUploading: boolean;
  uploadImagePath: string;
  results: Results;
  loadingPrediction: boolean;
}

const preditClass: string[] = [
  "1p", "2p", "3p", "4p", "5p", "6p", "7p", "8p", "9p",
  "1s", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s",
  "1m", "2m", "3m", "4m", "5m", "6m", "7m", "8m", "9m",
  "1z", "2z", "3z", "4z", "7z", "6z", "5z",
  "1f", "2f", "3f", "4f",
  "5f", "6f", "7f", "8f",
];

const mahjongTiles = [
  // Dots (Pin/筒)
  "1筒", "2筒", "3筒", "4筒", "5筒", "6筒", "7筒", "8筒", "9筒",

  // Bamboo (Suo/索)
  "1索", "2索", "3索", "4索", "5索", "6索", "7索", "8索", "9索",

  // Characters (Wan/萬)
  "1萬", "2萬", "3萬", "4萬", "5萬", "6萬", "7萬", "8萬", "9萬",

  // Wind Tiles
  "東", "南", "西", "北", // East, South, West, North

  // Dragon Tiles
  "紅中", "發財", "白板", // Red, Green, White

  // Flower Tiles (Optional)
  "梅", "蘭", "菊", "竹", // Plum, Orchid, Chrysanthemum, Bamboo
  "春", "夏", "秋", "冬"  // Spring, Summer, Autumn, Winter
];


const tileOrder = [
  "sd1", "sd2", "sd3", "sd4", "sd5", "sd6", "sd7", "sd8", "sd9",
  "sb1", "sb2", "sb3", "sb4", "sb5", "sb6", "sb7", "sb8", "sb9",
  "sc1", "sc2", "sc3", "sc4", "sc5", "sc6", "sc7", "sc8", "sc9",
  "hwe", "hws", "hww", "hwn", "hdr", "hdg", "hdw",
  "bs1", "bs2", "bs3", "bs4",
  "bf1", "bf2", "bf3", "bf4",
];

const preditClassToMahjongMap = new Map<string, string>();
preditClass.forEach((key, index) => {
  if (index < mahjongTiles.length) {
    preditClassToMahjongMap.set(key, mahjongTiles[index]);
  }
});

const predictClassToTileMap = preditClass.reduce<Record<string, string>>(
  (acc, className, index) => {
    acc[className] = tileOrder[index];
    return acc;
  },
  {}
);


function ResultCard({
  isUploading,
  uploadImagePath,
  results,
  loadingPrediction,
}: ResultCardProps) {
  const canvasRef = useRef<HTMLCanvasElement | null>(null);

  // Function to draw bounding boxes on the canvas
  const drawImage = () => {
    const canvas = canvasRef.current;

    if (isUploading) {
      return <></>;
    }

    if (canvas && uploadImagePath && results.length > 0) {
      const ctx = canvas.getContext("2d");
      if (!ctx) return;

      // Create an image element
      const image = new Image();
      image.src = uploadImagePath;

      // Draw the image and bounding boxes once the image is loaded
      image.onload = () => {
        // Set canvas dimensions to match the image
        canvas.width = image.width;
        canvas.height = image.height;

        // Draw the image onto the canvas
        ctx.drawImage(image, 0, 0, image.width, image.height);

        // Draw bounding boxes
        results.forEach((boundingBox) => {
          const tile = preditClassToMahjongMap.get(boundingBox.class);
          if (!tile) {
            console.error(`No Mahjong tile found for class: ${boundingBox.class}`);
            return;
          }
          const x1 = boundingBox.x - boundingBox.width / 2;
          const x2 = boundingBox.x + boundingBox.width / 2;
          const y1 = boundingBox.y - boundingBox.height / 2;
          const y2 = boundingBox.y + boundingBox.height / 2;

          const width = x2 - x1;
          const height = y2 - y1;

          // unique color
          const hue = (preditClass.indexOf(boundingBox.class) * 30) % 360;
          const color = `hsl(${hue}, 70%, 50%)`;

          // Draw the bounding box
          ctx.strokeStyle = "green";
          ctx.lineWidth = 5;
          ctx.strokeRect(x1, y1, width, height);

          // Measure text size to calculate the background rectangle
          const textWidth = 50;
          const textHeight = 25; // Approximation of text height

          // Set bounding box and text colors
          ctx.strokeStyle = color; // Green gradient for bounding box
          ctx.fillStyle = "black"; // Black background for text

          // Draw black background rectangle for text
          ctx.fillRect(
            x1 - 2, // Slight padding around the text
            y1 > 10 ? y1 - textHeight - 5 : y1 + 15, // Adjust position for text above or below
            textWidth + 4, // Add padding to the width
            textHeight + 4 // Add padding to the height
          );

          // Set text color
          ctx.fillStyle = color;

          // Draw text
          ctx.fillText(tile, x1, y1 > 10 ? y1 - 5 : y1 + 20);

          // Add the class label
          ctx.fillStyle = color;
          ctx.font = `${textHeight}px Arial`;
          ctx.fillText(
            tile,
            x1,
            y1 > 10 ? y1 - 5 : y1 + 20
          );
        });
      }
    }
  };

  const renderTileImages = () => {

    // Count occurrences of each class in results
    const resultsClassCounts = results.reduce<Record<string, number>>((acc, result) => {
      if (result.class in predictClassToTileMap) {
        acc[result.class] = (acc[result.class] || 0) + 1;
      }
      return acc;
    }, {});

    // Render images based on the counts
    return tileOrder.map((label) => {
      const correspondingClass = Object.keys(predictClassToTileMap).find(
        key => predictClassToTileMap[key] === label
      );

      const count = correspondingClass ? resultsClassCounts[correspondingClass] || 0 : 0;

      return count > 0
        ? Array.from({ length: count }).map((_, i) => (
            <img
              key={`${label}-${i}`}
              id={`${label}-png`}
              src={`./assets/mahjong_tiles/${label}.png`}
              alt={label}
            />
          ))
        : null;
    });
  };

  // Redraw bounding boxes whenever the image or results change
  useEffect(() => {
    const canvas = canvasRef.current;
    if (canvas && isUploading) {
      const ctx = canvas.getContext("2d");
      if (ctx) {
        // Clear the entire canvas
        ctx.clearRect(0, 0, canvas.width, canvas.height);
      }
    }

    if (uploadImagePath && results.length > 0 && !isUploading) {
      drawImage();
    }
  }, [uploadImagePath, results, isUploading]);


  return (
    <div id="result-card" className="col w-75">
      <div className="card">
        <div className="card-header">Result</div>
        <div className="my-2 mx-4 position-relative">
          {isUploading && (
            <div id="img-load" className="placeholder-box">
              <div className="spinner-grow" role="status" style={{ animationDuration: "2s" }}>
                <span className="visually-hidden">Loading...</span>
              </div>
            </div>
          )}
          <div className="canvas-container">
            <canvas ref={canvasRef} />
          </div>
        </div>
        <div className="card-footer">
          <div id="result-info">
            {loadingPrediction && <p>Processing prediction...</p>}
            {!loadingPrediction && Object.keys(results).length > 0 && (
              <h5>Detection Results</h5>
            )}
          </div>
          <div id="tile-images" className="mt-2">{renderTileImages()}</div>
        </div>
      </div>
    </div>
  );
}

export default ResultCard;
