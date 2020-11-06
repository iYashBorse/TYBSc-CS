<html>
<head>
	<title> To print Factors of a number </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1>Print Factors of a number~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Print">
	</form>

</div><br><br>


<?php 


// Factors of a specific numbers means , if users enters number 6 then it's all factors from 1 to 5 ( number is always a factor of itself so )

// Output ~ 1 , 2 , 3.


error_reporting (E_ALL ^ E_NOTICE);

echo"<div class=\"div php\">";

$number = $_POST["num"];

echo "The factors are: ";
for($i=1;$i<$number;$i++){

	  if($number%$i==0){
	    echo $i , ' ';
	  }

}

echo"</div>";

?>
</body>
</html>