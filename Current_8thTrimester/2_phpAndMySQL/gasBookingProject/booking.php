<html>
    <head>    <link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
<div>
<form method="POST" action="booking.php">
    Billing id: <input type="text" name="Blid"class="numberTextField"/><br>
    Booking Date :(yyyy-mm-dd) <input type="text" name="Bkdate"class="numberTextField" /><br>
    Delivery Date :(yyyy-mm-dd) <input type="text" name="Deldate" class="numberTextField"/><br>
    Cylin Type : <?php error_reporting (E_ALL ^ E_NOTICE); echo $_COOKIE['Cylintype'] ?><br>
    Amount : <?php error_reporting (E_ALL ^ E_NOTICE); echo $_COOKIE['price'] ?><br>
    <input type="submit" value="Book" /> <button type="reset" >Reset</button>
</form>
</body>
</html>

<?php
  error_reporting(0);
$conn = mysqli_connect("localhost", "root", "", "gasbookdb");
if (!$conn){
  die("Connection failed: " . mysqli_connect_error());
}

$Blid = $_POST['Blid'];
$Deldate = $_POST['Deldate'];
$Bkdate = $_POST['Bkdate'];
$Cylintype = $_COOKIE['Cylintype'];
$price = $_COOKIE['price'];
$Consno = $_COOKIE['Consno'];

$iQuery = "INSERT INTO billing_details (`Blid`, `Consno`, `Cylintype`, `Bkdate`, `Deldate`, `Amt`) VALUES ('$Blid','$Consno','$Cylintype','$Bkdate','$Deldate','$price')";

if (mysqli_query($conn, $iQuery)) {
    echo "Booking Done !<br>";
    $result = mysqli_query($conn, "SELECT * FROM billing_details where `Blid` = $Blid");

    $row = mysqli_fetch_assoc($result);

?>
    <html>

    <head>
        <style>
            table,th,td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th,td {
                padding: 15px;
            }
        </style>
    </head>

    <body>
        <table style="text-align: center;">
            <tr>
                <th>Title</th>
                <th>Details</th>
            </tr>
            <tr>
                <td>Booking Date</td>
                <td><?php echo $row['Bkdate']; ?></td>
            </tr>
            <tr>
                <td>Delivery Date</td>
                <td><?php echo $row['Deldate']; ?></td>
            </tr>
            <tr>
                <td>Cylinder Type</td>
                <td><?php echo $row['Cylintype']; ?></td>
            </tr>
            <tr>
                <td>Amount</td>
                <td><?php echo $row['Amt']; ?></td>
            </tr>
        </table>

    </body>

    </html>
<?php
} 
    else
        echo"Booking Failed";

echo"</div>";
?>
