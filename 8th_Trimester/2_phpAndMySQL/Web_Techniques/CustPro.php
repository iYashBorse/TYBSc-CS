<?php
session_start();
?>

<html>
<body>

<form action="CustPro2.php" method="post">
<center>
<h2>Enter Customer's information :</h2>

<table>
<tr><td>Name : </td><td><input type="text" name="name"></td><tr>
<tr><td>Address : </td><td><input type="text" name="addr"></td></tr>
<tr><td>Phone no : </td><td><input type="text" name="phno"></td></tr>
<tr><td></td><td><input type="submit" name="submit" value=Next></td></tr>
</table>
</center>

</form>
</body>
</html>
