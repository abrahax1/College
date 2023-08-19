# Enterprise Application Develop Lab 3
### Abraham Izarra / C19340801 

## Instructions to execute

### Start Server
1. Open a terminal tab and cd into lab3/server:
2. npm i 
3. npm run start -- starts server 

npm run dev -- starts server (development mode using nodemon)

### Start Client
1. Open a second terminal tab and cd into lab3/client:
2. npm i 
3. npm run start -- starts client and opens localhost:3000 automatically

## What to expect

### Home 
- Once the server and client have been started you will be directed to localhost:8080

- In this page you will see a basic welcoming page (click "Pick Colours" to access the main page)

### Colour page
- In this page you will see all the available colours

- There is a search box 

- There is an alert when actions are performed successfully (green) or incorrectly (red). (best seen when the background is white/black)

#### Buttons 
- *Changes remain even when the page is refreshed*

- Add: a form to add the new colour with name and hexcode appears at the top.

- Update: a form to update the colour's name and hexcode appears at the top (scrolled automatically with code).

- Delete: a pop up asking the user to delete the colour appears at the top.

- Set as background: when clicked, the background colour changes.
