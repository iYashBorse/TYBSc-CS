q6. Create a constructor to aacept student name,marks of three subjects and display the details with sum and percentage.


<html>
<body>
<form method="post" action="Student.php">
		Enter Student Name:<input type="text" name="txtName">
		<br>Enter Subject1 Marks:<input type="text" name="txtsub1">
		<br>Enter Subject2 Marks:<input type="text" name="txtsub2">
		<br>Enter Subject3 Marks:<input type="text" name="txtsub3">
		<br><input type="submit">
	</form>

 <?php
	
	class student
	{
		var $name;
		var $sub1;
		var $sub2;
		var $sub3;
		var $sum;
		var $per;
		function __construct($name,$sub1,$sub2,$sub3)
		{
			$this->name= $name;
			$this->sub1= $sub1;
			$this->sub2= $sub2;
			$this->sub3= $sub3;
		}
		public function calculate()
		{
			$this->sum=$this->sub1+$this->sub2+$this->sub3;
			$this->per=$this->sum/3;
		}
		 function __destruct()
		{
			echo "<br> <b> Student details: </b> ";
			echo "<br> Name: ",$this->name;
			echo "<br> Subject 1 marks: ",$this->sub1;
			echo "<br> Subject 2 marks: ",$this->sub2;
			echo "<br> Subject 3 marks: ",$this->sub3;
			echo "<br> Total marks: ",$this->sum;
			echo "<br> Percentage: ",$this->per;
		}

	} //end of class
	$name=$_POST['txtName'];
	$sub1=$_POST['txtsub1'];
	$sub2=$_POST['txtsub2'];
	$sub3=$_POST['txtsub3'];
	$s= new student($name,$sub1,$sub2,$sub3);
	$s->calculate();
	
	?>
</body>
</html>