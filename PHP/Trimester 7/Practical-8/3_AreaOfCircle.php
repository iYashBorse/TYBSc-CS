
<html>
<head>
	<title>Area of Circle Using Class Concept ~</title>
	<link rel="stylesheet"  type="text/css" href="external.css">
</head>

<body>

	<h1> Calculate Area of Circle Using ( Class and Object ) ~ <br><br><br></h1>
<div>
<form method ="POST" >
	

	Enter Circle Radius :<input type=number name="circleRadius" class="numberTextField"><br><br>

    <input type="submit" value="Caculate Area">

</form>
</div><br><br>


			<?php 




			// Just to avoid a notice message ,so using the below line of code . ( if you know then ignore )

			error_reporting (E_ALL ^ E_NOTICE);
			//  “Notice: Undefined index”  
			//  https://www.stechies.com/undefined-index-error-php/
			// This error means that within your code, there is a variable or constant that has no value assigned to it. 
			// But you may be trying to use the values obtained through the user form in your PHP code

			// You can also use  like ~   isset($_POST["prin"]);  to each  value obtained from HTML form.
			// to better  understand ,  read from the link provided

			// This "Notice" commonly occures when you use html and php in same file. As this is.


			if($_POST["circleRadius"] != NULL ){// To avoid printing any default values before feeding any values in our html input.





		echo"<div class=\"div php\">"; // For Desiging Purpose , Ignore.



		class areaOfCircle { // You can name  the class as --  "AreaOfCircle" or "areaOfCircle" both are vaild in php. 


			// Always try to set Class Property( i.e Variables ) to private . ( Considered as good Practise and "Really" useful)
			private $radius ;
		    private $area ;



			 function setData(){ // setting our  classProperty(variable) to the value  we  feed to the html inputBox.
			      $this->radius = $_POST["circleRadius"];
			 
			 }


			  function getData(){
			 	$catchMyArea = $this->calculateAreaOfCircle();

			 	echo "Area of Circle with Raduis ( ".$this->radius ." ) is :  ".$catchMyArea;


			 }


			 function calculateAreaOfCircle(){ 

			 	$this->area = 3.14159 * ($this->radius * $this->radius ); // ( $this->radius ** 2 ) does the same thing.
			 	return $this->area; 
			 	// You can print the area here itself and no need to create one more function  to print as I did. 
			 	// But this  makes your code more readable .
			 	// NOT RECOMMENDED DURING EXAM. YOU DON'T HAVE TIME.AND NO EXTRA MARKS GIVEN  FOR GOOD CODING PRACTISES.


			 }
			



		// All this can be performed using just one Function 
		// but the following practise makes your code more concise and consideredGoodPractise ( again ) . 

		}// closing brace of the areaOfCircle Class


  $calculateArea = new areaOfCircle();  //  Creating object of our Class Circle 
  $calculateArea->setData(); 			//  Using our Class Object for calling our getData() method to set the values , 
   										//  from the html Form to the class property (i.e Class variables ) . 
  $calculateArea->getData();			 




  // Here  setData() and getData() methods are also called as Getters And Setters . ( commonly used in OO Languages )
  // You can browse on Internet , ( Getters And Setters in PHP ) for detailed info. 

  // They are not compulsory , but they restrict outside interference with our class property ( variables ) without our permission.
  // It's about security.
  // It's important . Go have a look on Internet. 



}
echo"</div>";
?> 
</body>
</html>

	


		

		


