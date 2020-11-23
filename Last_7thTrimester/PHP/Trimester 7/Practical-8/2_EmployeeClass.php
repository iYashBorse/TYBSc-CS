
<html>
<head>
	<title>Employee Class ~</title>
	<link rel="stylesheet"  type="text/css" href="external.css">
</head>

<body>

	<h1>  Employee Details  ~ <br><br><br></h1>
<div>
<form method ="POST" >
	

	Employee Name      :<input type=text name="empName" class="numberTextField"><br><br>
	Designation ( Post ):<input type=text name="empDesignation" class="numberTextField"><br><br>
	Salary      :<input type=number name="empSalary" class="numberTextField">



 <br><br><input type="submit" value="DisplayDetails">

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

			if($_POST["empName"] != NULL ){// To avoid printing any default values before feeding any values in our input box.
			echo"<div class=\"div php\">"; // For Desiging Purpose , Ignore.

				
				
				
				


		class Employee { // You can name  the class as --  "Employee" or "employee" both are vaild in php. 


			// Always try to set Class Property( i.e Variables ) to private . ( Considered as good Practise and "Really" useful)
			private $name ;
		        private $designation ;
			private $salary ;


			 function setData(){
			      $this->name = $_POST["empName"];
			      $this->designation = $_POST["empDesignation"];
			      $this->salary = $_POST["empSalary"];
			 }

    		function getData(){
      		echo "Employee's name:".$this->name."<br> <br>Designation ( Post ) :".$this->designation."<br><br> Salary :".$this->salary;
      		 // You can use " , " (i.e comma )  instead of " . " ( i.e period ) in above echo statement.
      		 // But while returing , for Eg : 

      		// echo $value , " Cartoon"; // This Works 
      		// return $value , " Cartoon"; // But This Doesn't 
      		// Have a look over this link. "Useful"
      		//https://stackoverflow.com/questions/1466408/difference-between-period-and-comma-when-concatenating-with-echo-versus-return
 

   		    }


  }// closing brace of the employee Class


  $emp = new Employee();  // Creating object of our Class Employee 
  $emp->setData(); //  Using our Class Object for   calling our getData() method to set the values , 
  				   // from the html Form to the class property (i.e Class variables ) . 
  $emp->getData(); //  Displaying  Employee Details by calling our getData Method , using classObject




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

	


		

		


