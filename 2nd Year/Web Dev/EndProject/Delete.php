<?php  
	session_start();

	require_once "ConnectDB.php";

	$Username = $_SESSION['Username'];

	mysqli_query($db,"delete from Users where UserName='$Username'");

	mysqli_close($db);

	header('Location: Login.php');
	exit;
?>

</body>
</html>