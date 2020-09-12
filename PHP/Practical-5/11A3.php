q3. Create a class circle which accepts radius from user and display area of circle


<html>
<body>
	<form name="frmname" method="post" action="11A3.php">
		Enter Radius:<input type="text" name="radius">
		
		<br><input type="submit" name="sub">
	</form>
 <?php
	class area
	{
		private $radius;
		private $Area;

		public function calculate($r)
		{  
			$this->radius=$r;
	    	$this->Area= 3.14*$this->radius*$this->radius;
	    	echo "Area of Circle:",$this->Area;
	 	}
  	}

	$rad = $_POST['radius'];
	$a = new area();
	$a->calculate($rad);
?>
</body>
</html>