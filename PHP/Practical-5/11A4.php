q4. Create a class "AO"(Arithmetic Operations).Accept two numbers from user and perform operation depending on option. 

<html>
<body>
	<form name="frmname" method="post" action="11A4.php">
		Enter Number1:<input type="text" name="n1">
		<br>Enter Number2:<input type="text" name="n2">
		<br>Enter your choice: <select name="ch">
							<option value="1" name="ch">Addition</option>
							<option value="2" name="ch">Subtraction</option>
							<option value="3" name="ch">Multiplication</option>
							<option value="4" name="ch">Division</option>
							<option value="5" name="ch">Remainder</option>
						</select> <br>
		<br><input type="submit" name="sub">
	</form>

 <?php
	class arith
	{
		var $num1;
		var $num2;
		var $num3;
		var $cht;
		public function setvalue($num1,$num2)
		{ 
			$this->num1=$num1;
			$this->num2=$num2;

		}
		public function calculate($cht)
		{
			$this->cht=$cht;	
			switch($this->cht)
			{
				case 1 :  //addition
							$this->num3=$this->num1+$this->num2;
							echo "addition is : $this->num3";
							break;
				case 2: //sub
							$this->num3=$this->num1-$this->num2;
							echo "subtraction is : $this->num3";
							break;
				case 3 : //mul
							$this->num3=$this->num1*$this->num2;
							echo "multiplication is : $this->num3";
							break;
				case 4 : //div
							$this->num3=$this->num1/$this->num2;
							echo "division is : $this->num3";
							break;
				case 5 : //remainder
							$this->num3=$this->num1%$this->num2;
							echo "remainder is : $this->num3";
							break;
				default : echo "Invalid Choice";
							break;
			}
		}
	} //end of class
	$num1=$_POST['n1'];
	$num2=$_POST['n2'];
	$cht=$_POST['ch'];
	$e= new arith();
	$e->setvalue($num1,$num2);
	$e->calculate($cht);
	?>
</body>
</html>