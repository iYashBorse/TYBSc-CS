<?php
$to = $_GET['to'];
 $subject =  $_GET['sub'];
$message =  $_GET['msg'];
ini_set("SMTP","ssl://smtp.gmail.com");
   ini_set("smtp_port","465");
   ini_set("sendmail_from","iyashborse@gmail.com");
   ini_set("sendmail_path", "C:\xampp\sendmail\sendmail.exe -t");

// Remove all illegal characters from email
$email = filter_var($to, FILTER_SANITIZE_EMAIL);

// Validate e-mail
if (filter_var($to, FILTER_VALIDATE_EMAIL)) {
    //if(mail($to,$subject,$message)){
	echo("$email is a valid email address and mail sent");
}
 //}
else {
    echo("$email is not a valid email address");
}
?>
