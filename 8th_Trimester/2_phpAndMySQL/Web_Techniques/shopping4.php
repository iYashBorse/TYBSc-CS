<?php
session_start();
?>
<html>
<head>
<script>
function myFunction()
{
window.print();
}
</script>
</head>
<body>
<h1>
<center>shopping mall</center> 
Total :<span style="color:red"><?php if(isset($_SESSION['total'])){echo $_SESSION['total'];}?></span> 
</h1>
<table style="width:100%">
<tr>
<th><a href="shopping1.php">1</a></th>
<th><a href="shopping2.php">2</a></th>
<th><a href="shopping3.php">3</a></th>
<th><a href="shopping4.php">Final</a></th>
</tr>
</table>
<br>
<br>
<h2><center>Final Bill</center> Total :</h2>
<table style="width:100%" border=1>
<tr><br> <th>Product Name</th>
<th>Amount </th>
<th>Total</th>
<th>Print</th>
</tr>
<tr>
<th><?php if(isset($_SESSION['pname'])){echo $_SESSION['pname'];}?></th>
<th><?php if(isset($_SESSION['amt'])){echo $_SESSION['amt'];}?></th>
<th><span style="color:red;"><?php if(isset($_SESSION['total'])){echo $_SESSION['total'];}?></span></th>
<th><button onclick="myFunction()">Print </button>
</tr>
</table>
<?php session_destroy();?>
</body>
</html>


