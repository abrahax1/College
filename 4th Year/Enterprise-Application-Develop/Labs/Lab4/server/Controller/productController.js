import axios from "axios";
import Product from "../schema/mongoTables.js";

let products = {};

const fetchProducts = async () => {
  try {
    const response = await axios.get("https://dummyjson.com/products");
    products = response.data.products;

    if (products) {
      console.log(`Loaded ${products.length} products`);

      try {
        // Clear the existing data in the 'products' collection
        await Product.deleteMany({});

        // Insert the JSON data into the 'products' collection
        await Product.insertMany(products);

        console.log("Database seeded successfully");
      } catch (error) {
        console.error("Error seeding the database:", error);
      }
    }
  } catch (error) {
    console.log(`Error fetching data: ${error}`);
  }
};

// Get all products
const getProducts = async (req, res) => {
  try {
    const products = await Product.find();
    res.json(products);
  } catch (error) {
    res.status(500).json({ error: "Failed to fetch products" });
  }
};

// Get single product
const getProductById = async (req, res) => {
  const { id } = req.params;

  try {
    const product = await Product.findOne({ id: id });
    if (!product) {
      return res.status(404).json({ error: "Product not found" });
    }
    res.json(product);
  } catch (error) {
    res.status(500).json({ error: "Failed to fetch product" });
  }
};

// Create a new product
const createProduct = async (req, res) => {
  const newProduct = new Product(req.body);

  try {
    const savedProduct = await newProduct.save();
    res.status(201).json(savedProduct);
  } catch (error) {
    res.status(500).json({ error: "Failed to add product" });
  }
};

// Update an existing product
const updateProduct = async (req, res) => {
  const { id } = req.params;
  const { title, price, rating, description } = req.body;

  try {
    const updatedProduct = await Product.findOneAndUpdate(
      { id: id },
      { title, price, rating, description },
      { new: true }
    );
    if (updatedProduct) {
      res.json(updatedProduct);
    } else {
      res.status(404).json({ error: "Product not found" });
    }
  } catch (error) {
    res.status(500).json({ error: "Failed to update product" });
  }
};

// Delete a product
const deleteProduct = async (req, res) => {
  const { id } = req.params;

  try {
    const deletedProduct = await Product.findOneAndDelete({ id: id });
    if (deletedProduct) {
      res.json({ message: "Product deleted successfully" });
    } else {
      res.status(404).json({ error: "Product not found" });
    }
  } catch (error) {
    res.status(500).json({ error: "Failed to delete product" });
  }
};

export {
  fetchProducts,
  getProducts,
  getProductById,
  createProduct,
  updateProduct,
  deleteProduct,
};
