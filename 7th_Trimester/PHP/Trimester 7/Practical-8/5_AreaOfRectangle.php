
<html>
<head>
	<title>Area of Rectangle Using ConstructreAndDestructor Concept ~</title>
	<link rel="stylesheet"  type="text/css" href="external.css">
</head>

<body>

	<h1> Calculate Area of Rectangle Using ConstructreAndDestructor ~ <br><br></h1>
<div>
<form method ="POST" >
	

	Enter Rectangle Length :<input type=number name="rectangleLength" class="numberTextField"><br>
	Enter Rectangle Breadth :<input type=number name="rectangleBreadth" class="numberTextField"><br><br>


    <input type="submit" value="Caculate Area">

</form>
</div><br><br>


			<?php 




			// Just to avoid a notice message ,so using the below line of code . ( if you know then ignore )

			error_reporting (E_ALL ^ E_NOTICE);
			//  “Notice: Undefined index”  
			// This "Notice" commonly occures when you use html and php in same file. As this is.


			if($_POST["rectangleLength"] != NULL ){// To avoid printing any default values before feeding any values in our html input.
				 								// Try to practise  such things in your code. 
			echo"<div>"; // For Desiging Purpose , Ignore.



	class areaOfRectangle { // You can name  the class as --  "AreaOfCircle" or "areaOfCircle" both are vaild in php. 


			   // Always try to set Class Property( i.e Variables ) to private . ( Considered as good Practise and "Really" useful)
			    private $length ;
			    private $breadth ;
			    private $area;


			 function __construct(){ 
			 	  echo"Hello , am constructor  and down below is my enemy Destructor";
			      $this->length = $_POST["rectangleLength"];
			      $this->breadth = $_POST["rectangleBreadth"];
			      $this->area = $this->calculateAreaOfRectangle();
			 }
			
			 function calculateAreaOfRectangle(){ 

			 	$onlyThisMethodScopeArea =($this->length * $this->breadth );
			 	return $onlyThisMethodScopeArea;  // This return value is used by our construct method and stored in our class property( i.e variable )
			 									  // $area . Now this $area is used in our destructor to  display the area. 
			  }

			 function __destruct(){ 
			 	echo"<br><div>Hey , constructor 'Thanks for addressing'<br>";
				echo "<br>Area of Rectangle with Length and Breadth( ".$this->length ." , ".$this->breadth." ) is :  ".$this->area."</div>";
			 }
			
			
			
	 }// closing brace of the areaOfCircle Class


  $calculateArea = new areaOfRectangle();  //  Creating object of our Class Circle 
  

}
echo"</div>";
?> 
</body>
</html>

	


		

		


