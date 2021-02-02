<html>
<head>

	<title>Student Details </title>
	<link rel="stylesheet"  type="text/css" href="external.css"> 

</head>
<body>
	<h1> Student Details  Using parameterizedConstructor  ~</h1>
	<div>
	<form method ="POST"><br><br>


			 	Student Name : <input type=text  name="studentName" class="numberTextField" placeholder="Enter the name..."><br><br>
			 	Python Marks : <input type=number  name="pythonMarks" class="numberTextField" placeholder="Enter marks..."><br><br>
			 	rattleSnake Marks: <input type=number  name="rattleSnakeMarks" class="numberTextField" placeholder="Enter marks..."><br><br>
			 	NaagoBa Marks : <input type=number  name="naagoBaMarks" class="numberTextField" placeholder="Enter marks..."><br><br
			 
	
			       <input type="submit" value="Show Details"> <br>

	</form>
	</div>



<?php


			// Just to avoid a notice message ,using the below line of code . ( if you know then ignore )
			// remove this line and  observe the error.
			error_reporting (E_ALL ^ E_NOTICE);
			





if($_POST["studentName"] != NULL){ 	 // We don't want our  switch case to print any default value 
					 // I used $studentName which is the name of our first inputBox ( to make it look simple ) ,
					 // you can also use   $_POST or anyOther way to avoid it.

echo"<br><br><div class=\"div php\">";




class studentDetails{


	 	// Always try to keep your Class Property ( i.e classVariables) scope to private or protected.
		private $name;
		private $pythonMarks , $rattleSnakeMarks , $naagoBaMarks; // You can also use array to retrieve and display the marks.





		function __construct($name , $pythonMarks , $rattleSnakeMarks , $naagoBaMarks){ //  This is a PHP constructor and will set our Class Property ( i.e Variables ) 
		// This is an example of parameterized Constructor in php.																 //   to the values we passed in our html form.
			echo"Hello , you are in ConstructMethod to set all the values retrieved from HTML Form to Class Property (i.e  Variables) ";
			$this->name = $name ;
			$this->pythonMarks = $pythonMarks; 
			$this->rattleSnakeMarks = $rattleSnakeMarks;
			$this->naagoBaMarks = $naagoBaMarks;

		}

		

		function getSumOfAllSubjectMarks(){
			$sum = $this->pythonMarks + $this->rattleSnakeMarks + $this->naagoBaMarks;
			return $sum;
		}


		function getTotalPercentage(){

			$percentage = (( $this->getSumOfAllSubjectMarks() )/300)*100;
			return $percentage;
		}


		function __destruct(){ 
			echo"<br><br><div>You are in DestructMethod to display and destroy the created Object.";
			echo"And you are a BadPerson :(<br><br> ";
			$getSum = $this->getSumOfAllSubjectMarks();
			$getPercentage = $this->getTotalPercentage();
			echo"Student Name : ".$this->name."<br>python Marks : ".$this->pythonMarks."<br>rattleSnakeMarks : ".$this->rattleSnakeMarks."<br>naggoBa Marks : ".$this->naagoBaMarks."<br>Total Marks : ".$getSum."<br>Total Percentage :".$getPercentage."%</div>";


			
		}		


} // closing brace of the class

    $studentObject = new studentDetails($_POST["studentName"] , $_POST["pythonMarks"] , $_POST["rattleSnakeMarks"] , $_POST["naagoBaMarks"] );

    // If you want to check if the object is destroyed or not ,  by the Destructor , use the below way.
    // echo is_object($studentObject);  //  This will return 1 for True  and Viceversa.


  echo"</div>";
}


?>



</body>
</html>



