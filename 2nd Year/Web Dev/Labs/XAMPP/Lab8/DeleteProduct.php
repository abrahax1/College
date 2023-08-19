<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>DeleteProduct</title>

</head>

<body>

	<!--TITLE-->
	<div class="topBanner">
		<h1><center>Delete Product</center></h1>
	</div>

	<!--MENU-->
	<div>
		<center>
			<a href="Home.html">Home</a>
			<a href="ShowProduct.php">Show product</a>
			<a href="AddNewProduct.php">Add new product</a>
			<a href="UpdateProduct.php" >Update product</a>
			<a href="#">Delete product</a>
		</center>
	</div>

	<div>
		<center>
			<br><br>
	        
	        <form action="DeleteProduct.php" method="post">

            <div>
            	<label>PName</label><br>
                <input type="text" name="PName" placeholder="Enter PName here"/>
                <br><br>
            </div>    

            <div>
            	<input class="button" type="submit"/>
           
            </div>

	        </form>
	    </center>
    </div>    

    <br><br>
    <center>
		<?php
			session_start();
			require_once "ConnectDB.php";

			$PName = $_POST['PName'];

			mysqli_query($db,"delete from ProductID where PName='$PName'");

			mysqli_close($db);

		?>
	</center>

</body>
</html>
