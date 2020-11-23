<html>
<head>
	<title> To print Table of a number </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1>Print Table of a Number~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Print Table">
	</form>

</div><br><br>


<?php 

// Printing table ,  i.e  2 * 1 = 2   ,   2 * 2 = 4 ....   2 * 10 = 20 . 

// It was a time we used to learn them.


error_reporting (E_ALL ^ E_NOTICE);


echo"<div class=\"div php\">";

$number = $_POST["num"];
if($number != NULL){ // NULL because in starting without value in input Box  it's printing default last echo statment .

echo "Table of $number is : <br><br>";
for($i=1;$i<11;$i++){

   $mul = $number * $i;

  echo "$number    &nbsp;  * &nbsp;  $i  &nbsp; =  $mul <br>"; // &nbsp;  non breaking space ( it's html facility )
}
}




echo"</div>";

?>
</body>
</html>