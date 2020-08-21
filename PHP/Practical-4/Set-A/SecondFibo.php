<html>
<head>
	<title> To print Fibonacci Series </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1> To print Fibonacci number's ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a number : <input type=number  name="num" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	<input type="submit" value="Find">
	</form>

</div><br><br>


<?php 

 // Fibonacci series is the one in which you will get your next term by adding previous two numbers.
 // eg . 0 1 1 2 3 5 8 13 21 34  
 

	error_reporting (E_ALL ^ E_NOTICE);


echo"<div class=\"div php\">";

$number = $_POST["num"];


$n0 = 0;  
$n1 = 1;  
echo "<h3>Fibonacci series for first 0 to ", $number ," number is : </h3>";  
echo "\n";  
echo $n0,' &nbsp;',$n1,'&nbsp;';  
    for($i = 0; $i<=$number; $i++){
 
          $n2 = $n0 + $n1;     //adding first two numbers
        echo $n2, "&nbsp;  ";                 //print the 3rd number
 
        //To calulate the fourth element and so on..
 
        $n0 = $n1;                    //2nd element becomes first element 
        $n1 = $n2;                  //3rd element becomes second element
    }               			
    


echo"</div>";

?>
</body>
</html>