<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>UpdateProduct</title>

</head>

<body>

	<!--TITLE-->
	<div class="topBanner">
		<h1><center>Update Product</center></h1>
	</div>

	<!--MENU-->
	<div>
		<center>
			<a href="Home.html">Home</a>
			<a href="ShowProduct.php">Show product</a>
			<a href="AddNewProduct.php">Add new product</a>
			<a href="#" >Update product</a>
			<a href="DeleteProduct.php">Delete product</a>
		</center>
	</div>

	<div>
		<center>
			<br><br>
	        
	        <form action="UpdateProduct.php" method="post">

            <div>
            	<label>Old PName</label><br>
                <input type="text" name="OldPName" placeholder="Enter Old PName here"/>
                <br><br>
            </div>    

            <div>
            	<label>New PName</label><br>
                <input type="text" name="NewPName" placeholder="Enter New PName here"/>
                <br><br>
            </div>    

            <div>
            	<input class="button" type="submit"/>
           
            </div>

	        </form>
	    </center>
    </div>    

    <center>
		<?php
			session_start();
			require_once "ConnectDB.php";

			$OldPName = $_POST['OldPName'];
			$NewPName = $_POST['NewPName'];


			mysqli_query($db,"Update ProductID set PName = '$NewPName' where PName='$OldPName'");

			mysqli_close($db);

		?>
	</center>

</body>
</html>
