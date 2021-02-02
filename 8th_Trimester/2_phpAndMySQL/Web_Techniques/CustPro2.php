<?php
session_start();
if(isset($_POST['submit']))
{
$_SESSION['cname']=$_POST['name'];
$_SESSION['caddr']=$_POST['addr'];
$_SESSION['cphno']=$_POST['phno'];
#echo $_POST['name'];
}
 ?>

<html>
<body>

<form action="CustPro3.php" method="post">
<center>
<h2>Enter Product's Information:</h2>

<table>
<tr><td>Product's Name : </td><td><input type="text" name="p1"></td><tr>
<tr><td>Product's quantity : </td><td><input type="text" name="p2"></td></tr>
<tr><td>Product's rate : </td><td><input type="text" name="p3"></td></tr>
<tr><td></td><td><input type="submit" name="submit" value=Next></td></tr>
</table>
</center>

</form>
</body>
</html>
