<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>AddNewProduct</title>

</head>

<body>

	<!--TITLE-->
	<div class="topBanner">
		<h1><center>Add new Product</center></h1>
	</div>

	<!--MENU-->
	<div>
		<center>
			<a href="Home.html">Home</a>
			<a href="ShowProduct.php">Show product</a>
			<a href="#">Add new product</a>
			<a href="UpdateProduct.php" >Update product</a>
			<a href="DeleteProduct.php">Delete product</a>
		</center>
	</div>

	<!--FORM-->
	<div>
		<br><br>

		<center>
			        
	        <form action="AddNewProduct.php" method="post">

	            <div>
	                <label>PName</label><br>
	                <input type="text" name="PName" placeholder="Enter PName here"/>
	                <br><br>
	            </div>    

	            <div>
	                <label>Description</label><br>
	                <input type="text" name="Description" placeholder="Enter Description here"/>
	                <br><br>
	            </div>

	            <div>
	                <label>Price</label><br>
	                <input type="number" name="Price" placeholder="Enter Price here"/>
	                <br><br>
	            </div>

	            <div>
	                <label>Stock</label><br>
	                <input type="number" name="Stock" placeholder="Enter Stock amount here"/>
	                <br><br>
	            </div>

	            <div>
	                <input class="button" type="submit"/>
	               
	            </div>

	        </form>
	    </center>
    </div>    

    <div>
    	<center>
			<?php
				session_start();
				require_once "ConnectDB.php";
				
				if(isset($_POST['PName']) && isset($_POST['Description']) && isset($_POST['Price']) & isset($_POST['Stock']))
	            {
	                $PName  	 = $_POST["PName"];
	                $Description = $_POST["Description"];
	                $Price   	 = $_POST["Price"];
	                $Stock  	 = $_POST["Stock"];
	                
	                $sql = "INSERT INTO ProductID (PName, Description, Price, Stock)  
	                        VALUES ('$PName', '$Description', '$Price', '$Stock')";

	                if ($db->query($sql) === TRUE) 
	                {
	                    echo "<br><br>New product created";
	                } 
	                else 
	                {
	                  echo "<br><br>Error: " . $sql . "<br><br>" . mysqli_error($db);
	                }

	                $db->close();
	            
	            }

			?>
		</center>
	</div>

</body>
</html>
