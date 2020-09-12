q2. Create a class employee which accept employee name,employee designation & salary

 and display it using member function


 <!DOCTYPE html>
<body>
	<form name="frmname" method="post" action="11A2.php">
		Enter Employee Name:<input type="text" name="ename">
		<br>Enter Employee Designation:<input type="text" name="edes">
		<br>Enter Employee Salary:<input type="text" name="esal">
		
		<br><input type="submit" name="sub">
</form>
	
 <?php
	class employee
	{
		private $empname;
		private $empdes;
		private $empsalary;

		function setValue($ename,$empdesignation,$empsalary)
		{
			$this->empname = $ename;
			$this->empdes = $empdesignation;
			$this->empsalary = $empsalary;
		}
		function display()
		{
			echo "<br>Employee Name: ",$this->empname;
			echo "<br>Employee Designation: ",$this->empdes;
			echo "<br>Employee Salary: ",$this->empsalary;
		}
	}
	$empname = $_POST['ename'];
	$empdesignation = $_POST['edes'];
	$empsalary = $_POST['esal'];
	$e = new employee();
	$e->setValue($empname,$empdesignation,$empsalary);
	$e->display();
?>
		<br><input type="submit" name="sub">
	
</body>
</html>