<html>
<head>
	<title> To print reverse of a number </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1> To Print Reverse of a number  ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Print">
	</form>

</div><br><br>


<?php 

// Reverse of a number  i.e  ~  123  =>  321 


error_reporting (E_ALL ^ E_NOTICE);

echo"<div class=\"div php\">";

$number = $_POST["num"];
$b = $number;

$revnum = 0;  
		while ($number > 1)  
		{  
		$rem = $number % 10;  
		$revnum = ($revnum * 10) + $rem;  
		$number = ($number / 10);   
		}  
echo "Reverse number of $b  is: $revnum";  


echo"</div>";

?>
</body>
</html>