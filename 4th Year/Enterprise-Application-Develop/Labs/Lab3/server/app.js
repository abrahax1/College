import express from "express";
import cors from "cors";
import bodyParser from "body-parser";

import colourRoutes from "./Routes/colourRoutes.js";
import logRequest from "./Middleware/request.js";

const app = express();
const port = 8081;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.use(cors()); // Enable CORS for all routes

// Middleware and Routes
logRequest(app);
app.use("/api/colours", colourRoutes);

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});
