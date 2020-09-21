<html>
<body>
<form method="POST">
  <p> To display date!
  <br> Enter dd/mm/yyyy format</p>
  <br><br> Enter a date: <input type="text" name="txt">
  <br><br> <input type="submit">
</form>
<?php
  $d = $_POST["txt"];
  $pattern = "~/~i";
  $components = preg_split($pattern,$d);
  echo "Day: ",$components[0];
do
{
switch($components[1])
{
	case '1' : echo "<br>Month Name: January";
			   break;
	case '2' : echo "<br>Month Name: February";
			   break;
	case '3' : echo "<br>Month Name: March";
			   break;
	case '4' : echo "<br>Month Name: April";
			   break;
	case '5' : echo "<br>Month Name: May";
			   break;
	case '6' : echo "<br>Month Name: June";
			   break;
	case '7' : echo "<br>Month Name: July";
			   break;
	case '8' : echo "<br>Month Name: August";
			   break;
	case '9' : echo "<br>Month Name: September";
			   break;
	case '10': echo "<br>Month Name: October";
			   break;
	case '11': echo "<br>Month Name: November";
			   break;
	case '12': echo "<br>Month Name: December";
			   break;
}
}while($components[1]>=12);
echo "<br>Year : ",$components[2];

 ?>
</body>
</html>
