# Enterprise Application Develop Lab 4
### Abraham Izarra / C19340801 

## Instructions to execute

### Start Server
1. Open a terminal tab and cd into lab4/server:
2. npm i 
3. npm run start -- starts server (wait until console displays "Database seeded successfully")

npm run dev -- starts server (development mode using nodemon)

### Start Client
1. Open a second terminal tab and cd into lab4/client:
2. npm i 
3. npm run start -- starts client and opens localhost:8080 automatically

## What to expect

### Home
- Once the server and client have been started you will be directed to localhost:8080

- In this page you will see a navbar with the different categories, filters, the products (each is clickable), pagination at the bottom and a speedial for adding new products (which will open a form)

#### Form 
- Thumbnail (only one url)
- - Example: 
https://i.dummyjson.com/data/products/1/1.jpg

- Images (as many URLs as wanted separated by comma)
- - Example: 
https://i.dummyjson.com/data/products/1/1.jpg,
https://i.dummyjson.com/data/products/1/2.jpg,
https://i.dummyjson.com/data/products/1/3.jpg

### Edit page
- In this page you will see the product images, edit which opens a form to edit the details and delete with a notification to confirm deletion of the product