import React, { useEffect, useState } from "react";
import axios from "axios";
import Cookies from "js-cookie";

import "../css/Colors.css";
import Alert from "../components/Alert";
import { hexToHsl, hexToRGB } from "../helpers/hexTo";

const Colors = () => {
  const [alert, setAlert] = useState({});
  const [colours, setColours] = useState([]);
  const [name, setName] = useState("");
  const [hexString, setHexString] = useState("");
  const [showForm, setShowForm] = useState(false);
  const [editingColour, setEditingColour] = useState(null);
  const [searchText, setSearchText] = useState("");

  // Use useEffect hook to fetch data on component mount
  useEffect(() => {
    fetchData();
    handleLoadColour();
  }, []);

  // Define async function to fetch data from API
  const fetchData = async () => {
    try {
      const response = await axios.get("http://localhost:8081/api/colours");
      setColours(response.data);
    } catch {
      console.log("error getting colours");
    }
  };

  // Define functions to handle user actions
  const handleAddClick = () => {
    setEditingColour(null);
    setShowForm(true);
    setAlert({ msg: "", error: false });
  };

  const handleAddCancel = () => {
    setName("");
    setHexString("");
    setShowForm(false);
    setAlert({ msg: "", error: false });
  };

  const handleAddColour = async () => {
    if (!name || !hexString) {
      setAlert({ msg: "enter colour name and hex code", error: true });
      return;
    }

    // Convert hex code to HSL and RGB values
    const { h, s, l } = hexToHsl(hexString);
    const { r, g, b } = hexToRGB(hexString);

    // Create new colour object
    const newColour = {
      colorId: colours.length + 1,
      hexString: hexString,
      hsl: { h: h, s: s, l: l },
      name: name,
      rgb: { r: r, g: g, b: b },
    };

    // Add new colour
    try {
      const response = await axios.post(
        "http://localhost:8081/api/colours",
        newColour
      );
      setColours([...colours, response.data]);

      if (response.status === 201) {
        setName("");
        setHexString("");
        setShowForm(false);
        setAlert({ msg: "Colour added", error: false });
      } else {
        setAlert({ msg: "server error", error: true });
      }
    } catch {
      setAlert({ msg: "Error adding colour", error: true });
    }
  };

  const handleUpdateClick = async (colour) => {
    // Scroll to top of page and reset alert message
    window.scrollTo({ top: 0, behavior: "smooth" });
    setAlert({ msg: "", error: false });

    // Set editing state variables and show form
    setEditingColour(colour);
    setName(colour.name);
    setHexString(colour.hexString);
    setShowForm(true);
  };

  const handleUpdateColour = async () => {
    const updatedColour = {
      ...editingColour,
      name: name,
      hexString: hexString,
    };

    try {
      const resp = await axios.put(
        `http://localhost:8081/api/colours/${editingColour.colorId}`,
        updatedColour
      );
      console.log(resp.status);

      // Reset form and alert message and fetch updated data
      if (resp.status === 200) {
        setName("");
        setHexString("");
        setShowForm(false);
        setAlert({ msg: "Colour updated", error: false });
        fetchData();
      } else {
        setAlert({ msg: "Server error", error: true });
      }
    } catch {
      setAlert({ msg: "Error updating colour", error: true });
    }
  };

  const handleDeleteColour = async (colour) => {
    // Confirm deletion with user
    const confirmDelete = window.confirm(
      `Are you sure you want to delete ${colour.name}?`
    );

    // Delete colour and update state
    if (confirmDelete) {
      try {
        await axios.delete(
          `http://localhost:8081/api/colours/${colour.colorId}`
        );
        setColours(colours.filter((c) => c.colorId !== colour.colorId));
        setAlert({ msg: "Colour deleted", error: false });
      } catch {
        setAlert({ msg: "Error deleting colour", error: true });
      }
    }
  };

  const handleSearch = (event) => {
    setSearchText(event.target.value);
  };

  // Filter colours based on search text
  const filteredColours = colours.filter((colour) =>
    colour.name.toLowerCase().includes(searchText.toLowerCase())
  );

  // Set background color and save to cookie
  const handleSetColour = async (colour) => {
    setAlert({ msg: "", error: false });
    document.body.style.backgroundColor = colour.hexString;
    Cookies.set("background", colour.hexString, { expires: 1 });
  };

  // Load background color from cookie and set as body background color
  const handleLoadColour = async () => {
    try {
      const colour = Cookies.get("background") || "white";
      console.log("fetchColour", colour);

      document.body.style.backgroundColor = colour;
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div className="container">
      <h1 className="title">Colours</h1>

      {showForm && (
        <div className="form_container">
          <div className="form-group">
            <label htmlFor="nameInput">Name</label>
            <input
              type="text"
              id="nameInput"
              value={name}
              onChange={(e) => setName(e.target.value)}
            />
            <br />

            <label htmlFor="hexInput">Hex Code</label>
            <input
              type="text"
              id="hexInput"
              value={hexString}
              onChange={(e) => setHexString(e.target.value)}
            />
            <br />

            <button
              className="btn add-color"
              type="submit"
              onClick={editingColour ? handleUpdateColour : handleAddColour}
            >
              {editingColour ? "Update" : "Add Colour"}
            </button>
            <br />

            <button
              className="btn cancel"
              type="button"
              onClick={handleAddCancel}
            >
              cancel
            </button>
          </div>
          <br></br>
        </div>
      )}

      <div className="colours_container">
        {<Alert alert={alert} />}
        {!showForm && (
          <div>
            <br></br>
            <button className="btn add-color" onClick={handleAddClick}>
              Add Colour
            </button>
            <br />
            <hr />
          </div>
        )}
        <br />
        <input
          type="text"
          id="searchInput"
          placeholder="Search colours"
          value={searchText}
          onChange={handleSearch}
        />
        <br />
        <hr />

        <table>
          <thead>
            <tr>
              <th>Name</th>
              <th>Hex</th>
              <th>RGB</th>
              <th>HSL</th>
              <th>Color</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {filteredColours.map((colour) => (
              <tr key={colour.colorId}>
                <td>{colour.name}</td>

                <td>
                  <span className="hex-code">{colour.hexString}</span>
                </td>

                <td>
                  <span className="rgb-code">
                    {`R ${colour.rgb.r}, G ${colour.rgb.g}, B ${colour.rgb.b}`}
                  </span>
                </td>

                <td>
                  <span className="hsl-code">
                    {`H ${Math.round(colour.hsl.h)}, S ${Math.round(
                      colour.hsl.s
                    )}, L ${Math.round(colour.hsl.l)}`}
                  </span>
                </td>

                <td>
                  <span
                    className="hex-colour"
                    style={{ backgroundColor: colour.hexString }}
                  ></span>
                </td>

                <td>
                  <button
                    className="btn update-color"
                    onClick={() => handleUpdateClick(colour)}
                  >
                    Update
                  </button>

                  <button
                    className="btn delete-color"
                    onClick={() => handleDeleteColour(colour)}
                  >
                    Delete
                  </button>

                  <button
                    className="btn set-color"
                    onClick={() => handleSetColour(colour)}
                  >
                    Set as background
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default Colors;
