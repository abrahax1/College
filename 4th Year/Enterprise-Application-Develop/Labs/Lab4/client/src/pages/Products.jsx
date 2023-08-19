import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
import "../css/Products.css";
import {
  Box,
  Container,
  Grid,
  Paper,
  Typography,
  useMediaQuery,
  Pagination,
  SpeedDial,
  DialogTitle,
  DialogContent,
  Dialog,
  DialogActions,
  TextField,
  Button,
  Select,
  MenuItem,
  FormControl,
  InputLabel,
} from "@mui/material";
import AddIcon from "@mui/icons-material/Add";
import { FilterSettings } from "../components/filter.js";
import NavBar from "../components/navBar.js";

const categories = [
  "All",
  "smartphones",
  "laptops",
  "fragrances",
  "skincare",
  "groceries",
  "home-decoration",
];

const Products = () => {
  const [products, setProducts] = useState([]);
  const [value, setValue] = useState(0);
  const [selectedCategory, setSelectedCategory] = useState(categories[0]);
  const isMobile = useMediaQuery("(max-width:600px)");
  const [selectedBrand, setSelectedBrand] = useState("");
  const [priceRange, setPriceRange] = useState([0, 3000]);
  const [ratingRange, setRatingRange] = useState([0, 5]);
  const [onlyAvailable, setOnlyAvailable] = useState(false);
  const itemsPerPage = 8;
  const [currentPage, setCurrentPage] = useState(1);
  const [openAddModal, setOpenAddModal] = useState(false);
  const [id, setID] = useState();
  const [title, setTitle] = useState("");
  const [price, setPrice] = useState("");
  const [rating, setRating] = useState("");
  const [description, setDescription] = useState("");
  const [discountPercentage, setDiscountPercentage] = useState("");
  const [stock, setStock] = useState("");
  const [brand, setBrand] = useState("");
  const [category, setCategory] = useState("");
  const [thumbnail, setThumbnail] = useState("");
  const [images, setImages] = useState("");

  const brands = Array.from(new Set(products.map((product) => product.brand)));

  // get all products, store them on a list and set the ID lenght for new products
  const fetchProducts = async () => {
    try {
      const response = await axios.get("http://localhost:8081/api/products");
      setProducts(response.data);
      setID(response.data.length + 1);
    } catch (error) {
      console.error("Error fetching products:", error);
    }
  };

  useEffect(() => {
    fetchProducts();
  }, []);

  // handle navbar change (categories)
  const handleChange = (event, newValue) => {
    setCurrentPage(1);
    setSelectedCategory(categories[newValue]);
    setValue(newValue);
  };

  // handle page change (pagination)
  const handlePageChange = (event, value) => {
    window.scrollTo({ top: 0, behavior: "smooth" });
    setCurrentPage(value);
  };

  // close form for new product
  const handleCloseAddModal = () => {
    setOpenAddModal(false);
  };

  // opens form for new product
  const handleClick = () => {
    setOpenAddModal(true);
  };

  // Add product to database
  const handleAdd = async () => {
    const newProduct = {
      id: id,
      title: title,
      price: parseFloat(price),
      rating: parseFloat(rating),
      description: description,
      discountPercentage: parseFloat(discountPercentage),
      stock: parseInt(stock),
      brand: brand,
      category: category,
      thumbnail: thumbnail,
      images: images.split(",").map((url) => url.trim()),
    };

    // Check if there is any empty value on the form
    if (Object.values(newProduct).some((value) => value === "")) {
      alert("Please fill in all the fields");
      return;
    }

    try {
      const response = await axios.post(
        `http://localhost:8081/api/products`,
        newProduct
      );
      if (response.status === 201) {
        handleCloseAddModal();
        fetchProducts();
      }
    } catch (error) {
      console.error("Error adding product:", error);
    }
  };

  // Creates the filter for the products
  const paginatedProducts = products
    .filter(
      (product) =>
        selectedCategory === "All" || product.category === selectedCategory
    )
    .filter((product) =>
      selectedBrand ? product.brand === selectedBrand : true
    )
    .filter(
      (product) =>
        product.price >= priceRange[0] && product.price <= priceRange[1]
    )
    .filter(
      (product) =>
        product.rating >= ratingRange[0] && product.rating <= ratingRange[1]
    )
    .filter((product) => (onlyAvailable ? product.stock > 0 : true));

  // Creates the pagination number using a max of 8 items per page
  const pageCount = Math.ceil(paginatedProducts.length / itemsPerPage);

  return (
    <div className="Products">
      <Container maxWidth="x1">
        <NavBar value={value} handleChange={handleChange}></NavBar>
        <Box display="flex" flexDirection={isMobile ? "column" : "row"}>
          <Box flexShrink={0} width={isMobile ? "100%" : "25%"} sx={{ mr: 2 }}>
            <FilterSettings
              brands={brands}
              selectedBrand={selectedBrand}
              setSelectedBrand={setSelectedBrand}
              priceRange={priceRange}
              setPriceRange={setPriceRange}
              ratingRange={ratingRange}
              setRatingRange={setRatingRange}
              onlyAvailable={onlyAvailable}
              setOnlyAvailable={setOnlyAvailable}
            />
          </Box>
          <Box className="ProductList" flexGrow={1} margin={5}>
            <Grid container spacing={isMobile ? 1 : 4}>
              {paginatedProducts
                .slice(
                  (currentPage - 1) * itemsPerPage,
                  currentPage * itemsPerPage
                )
                .map((product) => (
                  <Grid key={product.id} item xs={12} sm={6} md={4} lg={3}>
                    <Paper elevation={3}>
                      <Link to={`/product/${product.id}`}>
                        <Box p={2}>
                          <Box mt={2}>
                            <img
                              src={product.thumbnail}
                              alt={product.thumbnail}
                              width="200"
                            />
                          </Box>
                          <Typography variant="h5" gutterBottom>
                            {product.name}
                          </Typography>
                          <Typography variant="body1">
                            Title: {product.title}
                          </Typography>
                          <Typography variant="body1">
                            Price: €{product.price.toFixed(2)}
                          </Typography>
                          <Typography variant="body1">
                            Brand: {product.brand}
                          </Typography>
                          <Typography variant="body1">
                            Category: {product.category}
                          </Typography>
                        </Box>
                      </Link>
                    </Paper>
                  </Grid>
                ))}
            </Grid>
            <Box
              sx={{
                position: "fixed",
                bottom: 16,
                right: 16,
              }}
            >
              <SpeedDial
                ariaLabel="Create Item Speed Dial"
                icon={<AddIcon />}
                onClick={handleClick}
              ></SpeedDial>
            </Box>

            <Dialog
              open={openAddModal}
              onClose={handleCloseAddModal}
              fullWidth
              maxWidth="sm"
            >
              <DialogTitle>Add New Item</DialogTitle>
              <DialogContent>
                <TextField
                  margin="dense"
                  id="add-title"
                  label="Title"
                  value={title}
                  onChange={(e) => setTitle(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-price"
                  label="Price"
                  value={price}
                  onChange={(e) => setPrice(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-rating"
                  label="Rating"
                  value={rating}
                  onChange={(e) => setRating(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-description"
                  label="Description"
                  value={description}
                  onChange={(e) => setDescription(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-discountPercentage"
                  label="DiscountPercentage"
                  value={discountPercentage}
                  onChange={(e) => setDiscountPercentage(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-stock"
                  label="Stock"
                  value={stock}
                  onChange={(e) => setStock(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-brand"
                  label="Brand"
                  value={brand}
                  onChange={(e) => setBrand(e.target.value)}
                  fullWidth
                />
                <FormControl fullWidth margin="dense">
                  <InputLabel id="add-category-label">Category</InputLabel>
                  <Select
                    labelId="add-category-label"
                    id="add-category"
                    value={category}
                    onChange={(e) => setCategory(e.target.value)}
                  >
                    <MenuItem value="smartphones">Smartphones</MenuItem>
                    <MenuItem value="laptops">Laptops</MenuItem>
                    <MenuItem value="fragances">Fragances</MenuItem>
                    <MenuItem value="skincare">Skincare</MenuItem>
                    <MenuItem value="groceries">Groceries</MenuItem>
                    <MenuItem value="home-decoration">Home Decoration</MenuItem>
                  </Select>
                </FormControl>
                <TextField
                  margin="dense"
                  id="add-thumbnail"
                  label="Thumbnail"
                  value={thumbnail}
                  onChange={(e) => setThumbnail(e.target.value)}
                  fullWidth
                />
                <TextField
                  margin="dense"
                  id="add-images"
                  label="Images"
                  value={images}
                  onChange={(e) => setImages(e.target.value)}
                  fullWidth
                />
              </DialogContent>
              <DialogActions>
                <Button onClick={handleCloseAddModal} color="primary">
                  Cancel
                </Button>
                <Button onClick={handleAdd} color="primary">
                  Add
                </Button>
              </DialogActions>
            </Dialog>
            <Box
              sx={{ display: "flex", justifyContent: "center", marginTop: 4 }}
            >
              <Pagination
                count={pageCount}
                onChange={handlePageChange}
                color="primary"
                classes={{ root: "Pagination-root" }}
              />
            </Box>
          </Box>
        </Box>
      </Container>
    </div>
  );
};

export default Products;
