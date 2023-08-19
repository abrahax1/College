import React from "react";
import { AppBar, Tabs, Tab } from "@mui/material";
import { images } from "../constants";

const categories = {
  All: "All",
  smartphones: "smartphones",
  laptops: "laptops",
  fragances: "fragrances",
  skincare: "skincare",
  groceries: "groceries",
  "home decoration": "homeDecoration",
};

const NavBar = ({ value, handleChange }) => {
  return (
    <AppBar position="static" color="default">
      <Tabs
        value={value}
        onChange={handleChange}
        variant="scrollable"
        scrollButtons="auto"
      >
        {Object.keys(categories).map((category, index) => {
          const imageKey = categories[category];
          return (
            <Tab
              key={index}
              icon={<img src={images[imageKey]} alt={images[imageKey]} />}
              label={category}
              classes={{ root: "Tab-root" }}
            />
          );
        })}
      </Tabs>
    </AppBar>
  );
};

export default NavBar;
