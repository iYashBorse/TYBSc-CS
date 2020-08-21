<html>
<head>
	<title> Sorting Numbers using bubble sort </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1>Sorting Numbers using bubbleGum sort ( bubbleSort ) ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Number 1 : <input type=number  name="num1" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	Number 2 : <input type=number  name="num2" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	Number 3 : <input type=number  name="num3" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	Number 4 : <input type=number  name="num4" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	Number 5 : <input type=number  name="num5" class="numberTextField" placeholder="Enter a number..."><br><br>



	 	<input type="submit" value="Find">
	</form>

</div><br><br>


<?php 




// Bubble sort is an algorithm that compares the adjacent elements and swaps their positions if they are not in the intended order. 
// The order can be ascending or descending.
// You can sort values in Ascending or Descending order .

// For this program ,  we are sorting in Ascending order.



error_reporting (E_ALL ^ E_NOTICE);

echo"<div class=\"div php\">";


$number1 = $_POST["num1"];
$number2 = $_POST["num2"];
$number3 = $_POST["num3"];
$number4 = $_POST["num4"];
$number5 = $_POST["num5"];

$numberArray = array($number1, $number2 , $number3 , $number4 , $number5); // storing all values in a array .






function bubbleSort($numberArray){

  $n = count($numberArray);
  for($i = 0; $i < $n - 1; $i++){
    for($j = $i + 1; $j < $n; $j++){
      if($numberArray[$j]<$numberArray[$i]){
        $t = $numberArray[$i];
        $numberArray[$i] = $numberArray[$j];
        $numberArray[$j] = $t;
      }
    }
  }
  echo "<br><br>The sorted array is :&nbsp;";
  foreach($numberArray as $value){ // you can just use    print_r($numberArray);
     echo $value."___";
	}
}




if($number1 != NULL){ // Because , when loading the page it prints some default values so just to avoid that this line of code.

echo "Original array is : &nbsp;&nbsp;&nbsp;&nbsp; "; // using &nbsp; for spaces . 

	foreach($numberArray as $value){ // you can just use    print_r($numberArray);
	echo $value."___";
	}


$sorted = bubbleSort($numberArray);

}
echo"</div>";

?>
</body>
</html>