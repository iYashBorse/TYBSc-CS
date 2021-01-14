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
?>
</div>
</body>
</html>
