<!--Program to test php forms-->
<!DOCTYPE html>
<html>
    <body>
		<!-- Q3 FORM -->
		<form action="Form.php" method="post">
			Number1: <input type="text" name="Number1"/>
			Number2: <input type="text" name="Number2"/>
			<input type="submit" />
		</form>

    	<?php
    		// Q3 FUNCTION
    		$Number1 = $_POST["Number1"];
    		$Number2 = $_POST["Number2"];

    		function multiply($Number1 = 0, $Number2 = 0)
    		{
    			$total = $Number1 * $Number2;
    			echo $total;
    		}

    		multiply($Number1, $Number2);
    	?>

    </body>
</html>
