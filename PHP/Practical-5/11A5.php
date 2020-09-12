q5. Create a class constructor to set values of length and breadth.Calculate area of rectangle and display it using destructor. 



<!DOCTYPE html>
<html>
<body>
<form method="post" action="11A5.php">
		Length: <input type="text" name="txtl"> <br>
		Breadth : <input type="text" name="txtb"> <br>
		<input type="submit">
	</form>

 <?php
class rectangle
	{
		var $len;
		var $bre;
		var $a;
		function __construct($len,$bre)
		{
			$this->len= $len;
			$this->bre= $bre;
		}

		 function __destruct()
		{
			echo "<br> Length: ",$this->len;
			echo "<br> Breadth: ",$this->bre;
			echo "<br> Area: ",$this->a;
		}
		public function calculate()
		{
			$this->a=$this->len*$this->bre;
			
		}

	} //end 
		$len=$_POST['txtl'];
		$bre=$_POST['txtb'];
		$e= new rectangle($len,$bre);
		$e->calculate();
	?>
</body>
</html>