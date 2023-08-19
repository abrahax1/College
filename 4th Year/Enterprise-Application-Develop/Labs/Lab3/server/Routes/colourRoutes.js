import express from "express";
const router = express.Router();

import {
  getColours,
  getColourById,
  createColour,
  updateColour,
  deleteColour,
} from "../Controllers/ColourController.js";

router.route("/").get(getColours).post(createColour);

router.route("/:id").get(getColourById).put(updateColour).delete(deleteColour);

export default router;
