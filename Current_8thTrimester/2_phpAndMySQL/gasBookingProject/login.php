<?php
  session_start();
  if(isset($_SESSION['Consno'])){
  echo "CustomerNumber:".$_SESSION['Consno'];
}
?>

<html>
<head><title>Login page</title>
    <link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
  <div>
<?php
  //Create connection
  $conn = mysqli_connect("localhost", "root", "", "gasbookdb");
  //Check connection
  if (!$conn){
    die("Connection failed: " . mysqli_connect_error());
  }

  $username = $_POST['user'];
  $password = $_POST['pass'];

  $sql = "SELECT * from customer_details WHERE `Cname` = '$username' AND `Pass` = '$password'" ;
  $result = mysqli_query($conn, $sql);

  if(mysqli_num_rows($result) > 0 ){
      $data = mysqli_fetch_assoc($result);
      $cylin_type = $data['Cylintype'];
      $result = mysqli_query($conn,"SELECT price FROM price_details where `Cylintype` = '$cylin_type'");
      $row = mysqli_fetch_assoc($result);
      setcookie("price",$row['price']);
      setcookie("Consno",$data['Consno']);
      setcookie("Cylintype",$data['Cylintype']);
      echo "Login Successful.<br>"; ?>
      <a href="booking.php">Click Here</a><?php echo "~to book your Gas cylinder.";
  }
  else{
      echo "Login Failed";
  } 

  $cust_q = " SELECT `Consno` FROM `customer_details` WHERE `Cname` LIKE '$username' ";
  $cust_no_obj = mysqli_query($conn,$cust_q);

  if(mysqli_num_rows($cust_no_obj) > 0 ){
    $cust_no_arr = mysqli_fetch_assoc($cust_no_obj);
    $cust_no = $cust_no_arr['Consno'];
    if(isset($_POST['submit']))
      $_SESSION['Consno'] = $cust_no;
  }
?>

</div>
</body>
</html>
