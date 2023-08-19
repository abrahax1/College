import express from "express";
import mongoose from "mongoose";
import dotenv from "dotenv";
import cors from "cors";
import bodyParser from "body-parser";
import productRoutes from "./Routes/productRoutes.js";
import { fetchProducts } from "./Controller/productController.js";

dotenv.config();

const app = express();
app.use(cors()); // Enable cors
app.use(bodyParser.json());

// Login for mongoDb
mongoose.connect("mongodb+srv://Abe:1234@lab4.ymowgzd.mongodb.net/test", {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

// Connect to mongoDB
const db = mongoose.connection;
db.on("error", console.error.bind(console, "connection error:"));
db.once("open", async () => {
  console.log("Connected to MongoDB");
  await fetchProducts();
});

// Routes
app.use("/api/products", productRoutes);

// Create server
const PORT = process.env.PORT || 8081;
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
