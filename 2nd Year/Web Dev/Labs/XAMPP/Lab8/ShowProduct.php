<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>ShowProduct</title>

</head>

<body>

	<!--TITLE-->
	<div class="topBanner">
		<h1><center>Show Product</center></h1>
	</div>

	<!--MENU-->
	<div>
		<center>
			<a href="Home.html">Home</a>
			<a href="#">Show product</a>
			<a href="AddNewProduct.php">Add new product</a>
			<a href="UpdateProduct.php" >Update product</a>
			<a href="DeleteProduct.php">Delete product</a>
		</center>
	</div>

	<div>
		<br><br>
		<center>
	        <table border="2">
				<tr>
					<td>PName</td>
					<td>Description</td>
					<td>Price</td>
					<td>Stock</td>
				</tr>
		</center>
    </div>    

	<div>
		<center>
			<?php
				session_start();
				require_once "ConnectDB.php";

				$PName = $_SESSION['PName'];

				$records = mysqli_query($db,"select * from ProductID");

				while($data = mysqli_fetch_array($records))
				{
					?>
					  <tr>
					    <td><?php echo $data['PName']; ?></td>
					    <td><?php echo $data['Description']; ?></td>
					    <td><?php echo $data['Price']; ?></td>
					    <td><?php echo $data['Stock']; ?></td>
					  </tr>	
					<?php
				}

				mysqli_close($db);

			?>
		</center>
	</div>

</body>
</html>
