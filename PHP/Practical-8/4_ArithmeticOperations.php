<html>
<head>

	<title>DifferentArithmeticOperations </title>
	<link rel="stylesheet"  type="text/css" href="external.css"> 

</head>
<body>
	<h1> Perform Different Arithmetic Operations ~</h1>
	<div>
	<form method ="POST"><br><br>


			 	Number 1 : <input type=number  name="num1" class="numberTextField" placeholder="Enter a number..."><br><br>
			 	Number 2 : <input type=number  name="num2" class="numberTextField" placeholder="Enter a number..."><br><br>
			 


			<select name="choices" id="choice">

				  <option value="addition" >Addition</option>
				  <option value="substraction">Substraction</option>
				  <option value="multiplication">Multiplication</option>
				  <option value="division">Division</option>
			</select>
	
			<input type="submit" value="Perform Operation"> <br>

	</form>


					</div>



<?php


			// Just to avoid a notice message ,using the below line of code . ( if you know then ignore )
			// remove this line and  observe the error.
			error_reporting (E_ALL ^ E_NOTICE);


		if($_POST["num1"] != NULL){		  // We don't want our  switch case to print any default value 
					  // I used $num1 which is the name of our first inputBox ( to make it look simple ) ,
					  // you can use  $_POST or anyOther way to avoid it.

		echo"<br><br><div class=\"div php\">";


			
class arithmeticOperations{


	 	// Always try to keep your Class Property ( i.e classVariables) scope to private or protected.
		private $number1;
		private $number2;
		private $choice;


		function setData(){ //  This method will set our Class Property ( i.e Variables ) to the values we passed in our html form.

			$this->number1 = $_POST["num1"];
			$this->number2 = $_POST["num2"];
			$this->choice =  $_POST["choices"];
		}

		function getAddition(){
			$this->addition = $this->number1 + $this->number2;
			return $this->addition;
		}


		function getSubstraction(){
			$this->substraction = $this->number1 - $this->number2;
			return $this->substraction;
		}

		function getMultiplication(){
			$this->multiplication = $this->number1  * $this->number2;
			return $this->multiplication;
		}

		function getDivision(){
			$this->division = $this->number1 / $this->number2;
			return $this->division;
		}




 
 function switchOperations(){


 switch($this->choice){


    case "addition":

         	$this->answer = $this->getAddition();
         	echo"Addition of ( ".$this->number1."+".$this->number2." ) is : ".$this->answer;

        	 break;


    case "substraction":
    		$answer = $this->getSubstraction();
         	echo"Substraction of ( ".$this->number1."-".$this->number2." ) is : ".$answer;


       		 break;

    case "multiplication":
    		$answer = $this->getMultiplication();
         	echo"Multiplication of ( ".$this->number1."*".$this->number2." )  is :".$answer;

        	break;

    case "division":
    		$answer = $this->getDivision();
         	echo"Division of ( ".$this->number1."/".$this->number2." ) is :  ".$answer;
    		break;



     default:

          echo "Hey ,Mann!!! Invalid choice.";
	}// closing brace of swtich 	

  } // closing brace of function switchOperations

} // closing brace of the clas

    $operations = new arithmeticOperations();
    $operations->setData();
    $operations->switchOperations();


  echo"</div>";
}


?>



</body>
</html>



