<html>
<head><title>case</title></head>
<body>
	<form name = "frmname" method="post">
		Enter String<input type="text" name="string">
		<br><input type="submit" name="submit">
	</form>
</body>
</html>

<?php
	$str = $_POST['string'];
	if(ctype_upper($str))
	{
		echo "<br>".strtolower($str);
	}
	else if(ctype_lower($str))
	{
		echo "<br>".strtoupper($str);
	}

?>
