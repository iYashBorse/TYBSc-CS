<html>
<head><title>Page</title></head>
<body>
	<form name = "frmname" method="post">
		Enter String<input type="text" name="txt">
		<br><input type="submit" name="submit">
	</form>
</body>
</html>

<?php
	$str=$_POST['txt'];
	$pattern = "/ /";
	$components = preg_split($pattern,$str,100,PREG_SPLIT_NO_EMPTY);
	print_r($components);
	for($i=0;$i<count($components);$i++)
	{
		echo "<br>",strlen($components[$i]);
	}
?>
