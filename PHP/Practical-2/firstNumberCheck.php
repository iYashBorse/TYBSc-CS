<html>
<head>
	<title>Number Check </title>
	<link rel="stylesheet"  type="text/css" href="external.css"> 

</head>
<body>

	<h1>  Number Check ~</h1>
	<div>
				<form method ="POST">

					Number :<input type = number name="txtname" class="numberTextField" placeholder="Enter a number to check...">


						
			
				<select name="choices" id="choice">

				  <option value="posNeg">Positive or Negative</option>
				  <option value="evenOdd">Even Or Odd</option>
				  <option value="div">Divisible By 10 or Not</option>

				 </select>



				 <br><br>
					<input type="submit" value="check">
				</form>
	</div><br><br>


<?php


			// Just to avoid a notice message ,using the below line of code . ( if you know then ignore )
			// remove this line and  observe the error.
			error_reporting (E_ALL ^ E_NOTICE);
			//  “Notice: Undefined index”  
			//  https://www.stechies.com/undefined-index-error-php/
			// This error means that within your code, there is a variable or constant that has no value assigned to it. 
			// But you may be trying to use the values obtained through the user form in your PHP code

			// You can also use  like ~   isset($_POST["prin"]);  to each  value obtained from HTML form.
			// If you haven't understood ,  read from the  above link provided.




$number = $_POST["txtname"];
$value  = $_POST["choices"];



echo "<div class=\"div php \">"; // Just for styling purpose ( ignore )



if($value == "posNeg"){ //  posNet is one  the value in our select box 

		if($number >0 ){
			printf("The number %d is postive " , $number);
		}
		else {
			printf("The number %d is negative " , $number);
		}

}

else if($value == "evenOdd"){

		if($number % 2 == 0 ){
			printf("The number %d is even " , $number);

		}
		else {
			printf("The number %d is Odd " , $number);
		}
}

else if($value == "div"){

		if($number % 10 == 0){
			printf("The number %d is Divisible " , $number);

		}

		else {
			printf("The number %d is Not Divisible " , $number);
		}
}


else{

	echo"No Input ";
}



echo "</div>";


?>



</body>
</html>



