<?php
	$db = mysqli_connect("localhost","root","","Lab10");

	if(!$db)
	{
	    die("Connection failed: " . mysqli_connect_error());
	}
	else
	{
		echo "Connected to database";
	}
