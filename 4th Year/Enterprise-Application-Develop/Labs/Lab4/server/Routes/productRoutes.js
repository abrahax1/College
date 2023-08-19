import express from "express";
const router = express.Router();

import {
  getProducts,
  getProductById,
  createProduct,
  updateProduct,
  deleteProduct,
} from "../Controller/productController.js";

router.route("/").get(getProducts).post(createProduct); // get all products, create

router
  .route("/:id")
  .get(getProductById)
  .put(updateProduct)
  .delete(deleteProduct); // get single product, update, delete

export default router;
