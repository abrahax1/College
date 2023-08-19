<!--Program to test php arrays-->
<!DOCTYPE html>
<html>
    <body>
    	<?php
    	$people = array("Peter"=>35, "Ben"=>37, "Joe"=>43);

    	// Q2 ARRAY
    		foreach($people as $key => $value)
    		{
    			echo "Key=$key, Value=$value", "<br>";
    		}
    	?>
    </body>
</html>
