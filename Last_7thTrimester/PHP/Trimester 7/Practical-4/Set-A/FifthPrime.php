<html>
<head>
	<title> To print a number is prime or not  </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1> To Print a  number is prime or not~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Print">
	</form>

</div><br><br>


<?php 

// A number which is only divisible by 1 and itself is called prime number. Numbers 2, 3, 5, 7, 11, 13, 17, etc. are prime numbers.
// 2 is the only even prime number.
// prime numbers are  natural number greater than 1 and so 0 and 1 are not prime numbers.


error_reporting (E_ALL ^ E_NOTICE);

echo"<div class=\"div php\">";

$number = $_POST["num"];

    for ($i = 2; $i <= $number-1; $i++) {  
      if ($number % $i == 0) {  
      $value= True;  
      }  
} 



if ($value == True) {  
     echo 'The Number ' , $number  , ' is not prime';  
}  else {  
   echo 'The Number ' , $number , ' is prime';  
   }    

echo"</div>";

?>
</body>
</html>