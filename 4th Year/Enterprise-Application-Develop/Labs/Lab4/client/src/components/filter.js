import { Box, Typography, FormControl, InputLabel, MenuItem, Select, Slider, Switch, FormControlLabel } from '@mui/material';

const FilterSettings = ({
    brands,
    selectedBrand,
    setSelectedBrand,
    priceRange,
    setPriceRange,
    ratingRange,
    setRatingRange,
    onlyAvailable,
    setOnlyAvailable,
  }) => {
    const handleBrandChange = (event) => {
      setSelectedBrand(event.target.value);
    };
  
    const handlePriceRangeChange = (event, newValue) => {
      setPriceRange(newValue);
    };
  
    const handleRatingRangeChange = (event, newValue) => {
      setRatingRange(newValue);
    };
  
    const handleAvailabilityChange = (event) => {
      setOnlyAvailable(event.target.checked);
    };
  
    return (
      <Box>
        <Typography variant="h6" gutterBottom>
          Filters
        </Typography>
        <FormControl fullWidth variant="outlined" sx={{ mb: 2 }}>
          <InputLabel  style={{ color: "white" }}>Brand</InputLabel>
          <Select value={selectedBrand} onChange={handleBrandChange} label="Brand"  style={{ color: "white" }}>
            <MenuItem value="">
              <em>Any</em>
            </MenuItem>
            {brands.map((brand) => (
              <MenuItem key={brand} value={brand}>
                {brand}
              </MenuItem>
            ))}
          </Select>
        </FormControl>
        <Box sx={{ mb: 2 }}>
          <Typography gutterBottom>Price Range</Typography>
          <Slider
            value={priceRange}
            onChange={handlePriceRangeChange}
            valueLabelDisplay="auto"
            min={0}
            max={3000}
            step={10}
          />
        </Box>
        <Box sx={{ mb: 2 }}>
          <Typography gutterBottom>Rating Range</Typography>
          <Slider
            value={ratingRange}
            onChange={handleRatingRangeChange}
            valueLabelDisplay="auto"
            min={0}
            max={5}
            step={0.5}
          />
        </Box>
        <FormControlLabel
          control={<Switch checked={onlyAvailable} onChange={handleAvailabilityChange} />}
          label="Show only available products"
        />
      </Box>
    );
  };

  export {FilterSettings};