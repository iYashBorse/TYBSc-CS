<?php
session_start();
if(isset($_POST['submit']))
{
$_SESSION['pname']=$_POST['p1'];
$_SESSION['pqty']=$_POST['p2'];
$_SESSION['prate']=$_POST['p3'];
}
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
<center>Billing Details</center>
<?php if( isset( $_SESSION['pname'] ) ){$Total = ( (int)$_SESSION['pqty']*(int)$_SESSION['prate'] );}?>
</h1>
<br>
<h2><span style="font-weight: bold;">Customer's name: <?php if(isset($_SESSION['cname'])){echo $_SESSION['cname'];}?><br>
Customer's Address: <?php if(isset($_SESSION['caddr'])){echo $_SESSION['caddr'];}?><br>
Customer's phone number: <?php if(isset($_SESSION['cphno'])){echo $_SESSION['cphno'];}?><br></span></h2>
<br>
<h2><center>Final Bill</center></h2>
<table style="width:100%" border=1>
<tr><br> <th>Product Name</th>
  <th> Quantity </th>
<th>Amount </th>
<th>Total</th>
<th>Print</th>
</tr>
<tr>
<th><?php if(isset($_SESSION['pname'])){echo $_SESSION['pname'];}?></th>
<th><?php if(isset($_SESSION['pqty'])){echo $_SESSION['pqty'];}?></th>
<th><?php if(isset($_SESSION['prate'])){echo $_SESSION['prate'];}?></th>
<th><span style="color:red;"><?php echo $Total;?></span></th>
<th><button onclick="myFunction()">Print </button>
</tr>
</table>
<?php session_destroy();?>
</body>
</html>
