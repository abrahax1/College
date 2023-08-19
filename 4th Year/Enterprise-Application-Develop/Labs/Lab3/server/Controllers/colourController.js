import axios from "axios";

let colours = {};

async function fetchColours() {
  try {
    const response = await axios.get(
      "https://www.ditig.com/downloads/256-colors.json"
    );
    colours = response.data;
    console.log(`Loaded ${colours.length} colours`);
  } catch (error) {
    console.log(`Error fetching data: ${error}`);
  }
}

fetchColours();

// Get all colours
const getColours = (req, res) => {
  res.json(colours);
};

// Get colour
const getColourById = (req, res) => {
  const colour = colours.find((c) => c.colorId === parseInt(req.params.id));
  if (colour) {
    res.json(colour);
  } else {
    res.status(404).send(`Colour ${req.params.id} not found`);
  }
};

// Create a new colour
const createColour = (req, res) => {
  const newColour = req.body;
  colours.push(newColour);
  res.status(201).json(newColour);
};

// Update an existing colour by ID
const updateColour = (req, res) => {
  const id = parseInt(req.params.id);
  const updatedColour = req.body;
  const index = colours.findIndex((c) => c.colorId === id);
  if (index !== -1) {
    colours[index] = updatedColour;
    res.json(updatedColour);
  } else {
    res.status(404).send(`Colour ${id} not found`);
  }
};

// Delete a colour by ID
const deleteColour = (req, res) => {
  const id = parseInt(req.params.id);
  const index = colours.findIndex((c) => c.colorId === id);
  if (index !== -1) {
    colours.splice(index, 1);
    res.sendStatus(204);
  } else {
    res.status(404).send(`Colour ${id} not found`);
  }
};

export { getColours, getColourById, createColour, updateColour, deleteColour };
