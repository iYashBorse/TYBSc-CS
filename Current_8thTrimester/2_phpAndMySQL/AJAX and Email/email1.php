 <?php
$to = $_GET['to'];
 $subject =  $_GET['sub'];
$message =  $_GET['msg'];

ini_set("SMTP","ssl://smtp.gmail.com");
   ini_set("smtp_port","465");
   ini_set("sendmail_from","iyashborse@gmail.com");
   ini_set("sendmail_path", "C:\xampp\sendmail\sendmail.exe -t");

if(mail($to,$subject,$message))         // Always set content-type when sending HTML email
echo "Email sent";
else
	echo "Email not sent"; /*

$to_email = "iyashborse@gmail.com";
$subject = "Simple Email Test via PHP";
$body = "Hi,nn This is test email send by PHP Script";
$headers = "From: iyashborse@gmail.com";

if (mail($to_email, $subject, $body, $headers)) {
    echo "Email successfully sent to $to_email...";
} else {
    echo "Email sending failed...";
} */
?>
