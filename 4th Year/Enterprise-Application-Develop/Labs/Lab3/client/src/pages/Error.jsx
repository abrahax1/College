import React from "react";
import "../css/HomePage.css";

function Error() {
  return (
    <div>
      <h1>404 Error: Page Not Found</h1>
      <p>The requested page could not be found.</p>
      <a href="/">Return to the main page</a>
    </div>
  );
}

export default Error;
