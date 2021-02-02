<?php
session_start();
if(!isset($_SESSION['total']))
{
$_SESSION['total']=0;
}
if(isset($_POST['submit']))
{
$_SESSION['pname']=$_SESSION['pname'].","."Patanjali mango juices";
$_SESSION['amt']=$_SESSION['amt'].","."70";
$_SESSION['total']=$_SESSION['total']+70;
}
?> <html>
<head>
</head>
<body>
<h1><center>shopping mall</center> 
Total :<span style="color:red;">
<?php if(isset($_SESSION['total'])){echo $_SESSION['total'];}?>
</span></h1>
<table style="width:100%">
<tr>
<th><a href="shopping1.php">1</a></th>
<th><a href="shopping2.php">2</a></th>
<th><a href="shopping3.php">3</a></th>
<th><a href="shopping4.php">Final</a></th>
</tr>
</table>
Product 3:
<FORM ACTION="<?php $_SERVER['PHP_SELF']; ?>" method="POST">
<table style="width:100%" border=1>

<th>Product Name</th>
<th>Price </th>
<th>action</th>
</tr><br> <tr>
<th>Patanjali mango juices</th>
<th>70</th>
<th>
<input type=submit name=submit value="buy" >
</form>
</tr>
</table>
</body>
</html>