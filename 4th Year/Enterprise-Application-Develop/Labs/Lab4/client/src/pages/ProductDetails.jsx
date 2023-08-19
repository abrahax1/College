import React, { useState, useEffect } from "react";
import axios from "axios";
import { useParams, useNavigate } from "react-router-dom";
import "../css/ProductDetails.css";
import {
  Button,
  Typography,
  Dialog,
  DialogTitle,
  DialogContent,
  TextField,
  DialogActions,
} from "@mui/material";
import "react-responsive-carousel/lib/styles/carousel.min.css";
import { Carousel } from "react-responsive-carousel";

const ProductDetails = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [product, setProduct] = useState(null);
  const [openEditModal, setOpenEditModal] = useState(false);
  const [title, setTitle] = useState("");
  const [price, setPrice] = useState("");
  const [rating, setRating] = useState("");
  const [description, setDescription] = useState("");

  // Get selected product
  useEffect(() => {
    const fetchProduct = async () => {
      try {
        const response = await axios.get(
          `http://localhost:8081/api/products/${id}`
        );
        setProduct(response.data);
        setProduct(response.data);
        setTitle(response.data.title);
        setPrice(response.data.price);
        setRating(response.data.rating);
        setDescription(response.data.description);
      } catch (error) {
        console.error("Error fetching product:", error);
      }
    };

    fetchProduct();
  }, [id]);

  // Open form to edit
  const handleEdit = () => {
    setOpenEditModal(true);
  };

  // Close form to edit
  const handleCloseEditModal = () => {
    setOpenEditModal(false);
  };

  // Update product
  const handleUpdate = async (event) => {
    console.log(product);

    try {
      const response = await axios.put(
        `http://localhost:8081/api/products/${id}`,
        {
          title,
          price,
          rating,
          description,
        }
      );
      setProduct(response.data);
      setOpenEditModal(false);
    } catch (error) {
      console.error("Error deleting product:", error);
    }
  };

  // delete product
  const handleDelete = async () => {
    const confirmDelete = window.confirm(
      `Are you sure you want to delete this product?`
    );
    if (confirmDelete) {
      try {
        await axios.delete(`http://localhost:8081/api/products/${id}`);
        navigate("/");
      } catch (error) {
        console.error("Error deleting product:", error);
      }
    }
  };

  if (!product) {
    return <div>Loading...</div>;
  }

  return (
    <div className="detail-Container">
      <Typography variant="h4">{product.name}</Typography>
      <Carousel>
        {product.images.map((image, index) => (
          <div key={index}>
            <img
              src={image}
              alt={`Image ${index}`}
              className="carousel-image"
            />
          </div>
        ))}
      </Carousel>
      <Typography variant="body1">Title: {product.title}</Typography>
      <Typography variant="body1">Price: €{product.price}</Typography>
      <Typography variant="body1">Rating: {product.rating}</Typography>
      <Typography variant="body1">
        Description: {product.description}
      </Typography>
      <Button variant="contained" color="primary" onClick={handleEdit}>
        Edit
      </Button>
      <Button variant="contained" color="secondary" onClick={handleDelete}>
        Delete
      </Button>

      <Dialog
        open={openEditModal}
        onClose={handleCloseEditModal}
        fullWidth
        maxWidth="sm"
      >
        <DialogTitle>Edit Product</DialogTitle>
        <DialogContent>
          <TextField
            margin="dense"
            id="title"
            label="Title"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            fullWidth
          />
          <TextField
            margin="dense"
            id="price"
            label="Price"
            value={price}
            onChange={(e) => setPrice(e.target.value)}
            fullWidth
          />
          <TextField
            margin="dense"
            id="rating"
            label="Rating"
            value={rating}
            onChange={(e) => setRating(e.target.value)}
            fullWidth
          />
          <TextField
            margin="dense"
            id="description"
            label="Description"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
            fullWidth
          />
        </DialogContent>
        <DialogActions>
          <Button onClick={handleCloseEditModal} color="primary">
            Cancel
          </Button>
          <Button onClick={handleUpdate} color="primary">
            Save
          </Button>
        </DialogActions>
      </Dialog>
    </div>
  );
};

export default ProductDetails;
