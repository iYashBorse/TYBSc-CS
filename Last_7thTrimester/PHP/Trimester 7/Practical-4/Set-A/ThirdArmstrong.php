<html>
<head>
	<title> To print if a number is Armstrong or not </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1> To find a number is Armstrong Number or Not ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Find">
	</form>

</div><br><br>


<?php 

// An Armstrong number is the one whose value is equal to the sum of the cubes of its digits.
// 0, 1, 153, 371, 407, 471 etc.



error_reporting (E_ALL ^ E_NOTICE);




echo"<div class=\"div php\">";

$number = $_POST["num"];
$total=0;  
$x=$number;  

	while($x!=0)  
	{  
	$rem=$x%10;  
	$total=$total+$rem*$rem*$rem;  
	$x=$x/10;  
	} 


		if($number==$total){ 
			  
			echo "Yes , Number $number  is an Armstrong number";  
		}  
		else{
			  
			echo "No  , Number $number   is not an armstrong number";  
		}              			
	    


echo"</div>";

?>
</body>
</html>