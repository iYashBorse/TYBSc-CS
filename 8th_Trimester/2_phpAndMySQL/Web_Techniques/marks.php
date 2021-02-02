<html>
<body>

<form action="marks2.php" method="post">
<center>
<h2>Enter Marks for Student out of 100:</h2>

<table>
<tr><td>Physics : </td><td><input type="text" name="m1"></td><tr>
<tr><td>Bio : </td><td><input type="text" name="m2"></td></tr>
<tr><td>Chem: </td><td><input type="text" name="m3"></td></tr>
<tr><td>Maths : </td><td><input type="text" name="m4"></td></tr>
<tr><td>Marathi : </td><td><input type="text" name="m5"></td></tr>
<tr><td>English : </td><td><input type="text" name="m6"></td></tr>
<tr><td></td><td><input type="submit" value=Next></td></tr>
</table>
</center>

</form>
</body>
</html>

<?php
setcookie("name",$_POST['name'],time()+3600);
setcookie("addr",$_POST['addr'],time()+3600);
setcookie("class",$_POST['class'],time()+3600);
?>
