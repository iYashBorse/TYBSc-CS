<?php
session_start();
if(!isset($_SESSION['total']))
{
$_SESSION['total']=0;
}
if(isset($_POST['submit']))
{
$_SESSION['pname']=$_SESSION['pname'].","."Patanjali Saundarya Face WashOIL (L)";
$_SESSION['amt']=$_SESSION['amt'].","."50";
$_SESSION['total']=$_SESSION['total']+50;
}
?>
<html>
<head>
</head>
<body>
<h1<center>shopping mall</center> 
Total :<span style="color:red;"><?php if(isset($_SESSION['total'])){echo $_SESSION['total'];}?></span></h1>
<table style="width:100%">
<tr><br> <th><a href="shopping1.php">1</a</th>
<th><a href="shopping2.php">2</a</th>
<th><a href="shopping3.php">3</a></th>
<th><a href="shopping4.php">Final</th>
</tr>
</table>
Product 2:
<FORM ACTION="<?php $_SERVER['PHP_SELF']; ?>" method="POST">
<table style="width:100%" border=1>
<tr>

<th>Product Name</th>
<th>Price </th>
<th>action</th>
</tr>
<tr>
<th>Patanjali Saundarya Face Wash</th>
<th>50</th>
<th>
<input type=submit name=submit value="buy">
</form></th>
</tr>
</table>
</body>
</html>