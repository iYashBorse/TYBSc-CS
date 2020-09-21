<html>
<head>

	<title>DifferentFunctionsOnA_Array </title>
	<link rel="stylesheet"  type="text/css" href="external.css"> 

</head>
<body>
	<h1> Perform Different Array Operations ~</h1>
	<form method ="POST"><br><br>

			<div class="floatDivLeft">

				<h3>First Array : </h3>
			 	Number 1 : <input type=number  name="num1" class="numberTextField" placeholder="Enter a number..."><br><br>
			 	Number 2 : <input type=number  name="num2" class="numberTextField" placeholder="Enter a number..."><br><br>
			 	Number 3 : <input type=number  name="num3" class="numberTextField" placeholder="Enter a number..."><br><br>
			 	Number 4 : <input type=number  name="num4" class="numberTextField" placeholder="Enter a number..."><br><br><br>
 			</div>





	 	<div class="floatDivRight">

	 		<i> Second Array "Input" is compulsory for first selectOption only. </i>
	 		<h3>Enter Second Array : </h3>

			 Number 1 : <input type=number  name="number1"  class="numberTextField" placeholder="Enter a number" > <br><br>
			 Number 2 : <input type=number  name="number2"  class="numberTextField"placeholder="Enter a number" ><br><br>
			 Number 3 : <input type=number  name="number3" class="numberTextField" placeholder="Enter a number"><br><br>
			 Number 4 : <input type=number  name="number4" class="numberTextField" placeholder="Enter a number" ><br><br>


		</div><br><br><br><br>





		<div class="floatDivMiddleSubmitButton">


			<select name="choices" id="choicee">

				  <option value="replace" >Replace one array with another</option>
				  <option value="reverse">Find reverse of an array.</option>
				  <option value="index">Display array elements from second index</option>
				  <option value="twoArray">Display two array elements from third index.</option>
				  <option value="duplicate">Remove Duplicate values from array.</option>
			</select>
	

			<input type="submit" value="Perform Operation" id="secondButton"> <br><br>
					</div>

	</form>





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



			// Just to avoid a notice message ,so using the below line of code . ( if you know then ignore )


			// Retrieving our first Array members from our form

			$number1 = $_POST["num1"];
			$number2 = $_POST["num2"];
			$number3 = $_POST["num3"];
			$number4 = $_POST["num4"];




			// Retrieving our first Array members from our form
			// This array will be only used for first option in select ( replaceArray )
			$numb1 = $_POST["number1"];
			$numb2 = $_POST["number2"];
			$numb3 = $_POST["number3"];
			$numb4 = $_POST["number4"];
			
			$option = $_POST["choices"];


			// Now creating two arrays and feeding them our values from our form. 
			// You can directly use "$_POST["Number"] " instead of assigning to a different variable
			// and then  feeding that variable to  the array. But this looks more clear, though. 
			$numberArray1 = array($number1, $number2 , $number3 , $number4 ); 
			$numberArray2= array($numb1, $numb2 , $numb3 , $numb4 );


if($number1 != NULL){ // We don't want our  switch case to print any default value 
					  // I used $number1 ( to make it look simple ) , you can use  $_POST or anyOther way to avoid it.

		echo"<div class=\"div floatDivMiddle\">";


echo"<br><br>";


 switch($option){


    case "replace":

         	 echo"First Array is : ";
          
            foreach($numberArray1 as $value){ // you can  also  use  just  print_r($numberArray1 , $numberArray2);
				echo $value."___";
			}


			  echo"<br><br>Second Array is : ";
          

            foreach($numberArray2 as $value){ // you can  also  use  just  print_r($numberArray1 , $numberArray2);
				echo $value."___";
			}

              echo"<br><br>Replaced First Array is : ";

           $arr = array_replace($numberArray1,$numberArray2); // Here array_replace returns our array elements after performing the
           //respective  operations on them , and we catch those elements in our $arr ( variable ) & then using foreach , we print.
           // You can also  use print_r(array_replace($numberArray1,$numberArray2)); directly function instead of doing the above.


            foreach($arr as $value){ // printing the values in our $arr variable
				echo $value."___";   // You can directly Use print_r($arr);
			}


         break;


    case "reverse":


        echo" Accepted Array is :&nbsp;";


			foreach( $numberArray1 as $v ) {
			 echo $v."___";

			}

         echo "<br><br>Reversed array is  &nbsp;:  ";

          $arr = array_reverse($numberArray1);

           foreach($arr as $value){
          	echo$value."___";
           }

        break;

    case "index":

    	echo" Accepted Array is :&nbsp;";


			foreach( $numberArray1 as $v ) {
			 echo $v."___";

			}

			echo" <br>After slicing Array is :&nbsp;";

          $arr= array_slice($numberArray1,2);

          // The array_slice() function returns selected parts of an array.
          // Here in array_slice($numberArray1, 2);  , it prints value from 2 position in array i.e last 2 elements.

            foreach($arr as $value){ 
				echo $value."___";
			}


        break;

    case "twoArray":
    	echo" Accepted Array is :&nbsp;";


			foreach( $numberArray1 as $v ) {
			 echo $v."___";

			}

			echo"<br><br> After slicing : ";

          $arr = array_slice($numberArray1,2,2);

          foreach($arr as $value){
          	echo $value."___";
          }


        break;

    case "duplicate":

        echo "Accepted array : ";

        foreach( $numberArray1 as $value){
        	echo $value."___";
        }

        echo "<br><br> without duplicate values : ";

        $arr= array_unique($numberArray1);

        foreach($arr as $value){
        	echo $value."___";
        }

        break;

     default:

          echo "Hey ,Mann!!! Invalid choice.";


    }

  echo"</div>";

}

?>



</body>
</html>



