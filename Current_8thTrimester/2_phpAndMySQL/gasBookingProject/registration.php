<?php
  error_reporting(0);
  //Create connection
  $conn = mysqli_connect("localhost", "root", "", "gasbookdb");
  //Check connection
  if (!$conn){
    die("Connection failed: " . mysqli_connect_error());
  }
  $typesOfCylin = mysqli_query($conn,"SELECT * FROM price_details");

?>
<html>

    <head>
        <title>Customer Login</title>
        <link rel="stylesheet" type="text/css" href="external.css">

    </head>

    <body>
        <h1>Sign Up Page </h1>
        <div>
        <form method="POST" action="registration.php">
            Customer number: <input type ="text" name="cusno" class="numberTextField" /><br><br>
            Name : <input type="text" name="name" class="numberTextField"/><br><br>
            Address : <input type="text" name="address" class="numberTextField"/><br><br>
            City : <input type="text" name="city" class="numberTextField"/><br><br>
            Phone : <input type="number" name="phone" class="numberTextField"/><br><br>
            Pincode : <input type="number" name="pincode" class="numberTextField"/><br><br>
            Date of Connection: <input type="text" name="Dtofconn"class="numberTextField"/><br><br>
            Type Of Cylinder : <select name="typeOfCylin">
                <?php
                    while($row = mysqli_fetch_assoc($typesOfCylin)){
                        ?><option value="<?php echo $row["Cylintype"]?>"> <?php echo $row["Cylintype"]?></option><?php
                    }
                ?>
            </select><br><br>
            Password : <input type="password" name="pass" class="numberTextField"/><br><br>
            <input type="submit"/>
            <button type="reset">Reset</button>

        </form>
    </div>
    </body>
</html>

<?php
    $Consno = $_POST['cusno'];
    $name = $_POST['name'];
    $address = $_POST['address'];
    $phone = $_POST['phone'];
    $city = $_POST['city'];
    $pincode = $_POST['pincode'];
    $password = $_POST['pass'];
    $Dtofconn = $_POST['Dtofconn'];
    $typeOfCylin = $_POST['typeOfCylin'];

    $iQuery = "INSERT INTO customer_details (`Consno`, `Pass`, `Cylintype`, `DtofConn`, `Cname`, `Caddr`, `City`, `Phone`, `Pincode`) VALUES ('$Consno','$password','$typeOfCylin','$Dtofconn','$name','$address','$city','$phone','$pincode')";

    if(mysqli_query($conn,$iQuery)){
        echo "successful";
    }
    else{
        echo "failed";
    }

?>
