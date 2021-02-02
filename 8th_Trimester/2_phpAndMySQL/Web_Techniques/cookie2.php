<html>
<head><title>Front Door</title></head>
<?php
$backgroundName = $_COOKIE['bg'];
$foregroundName = $_COOKIE['fg'];
$font_size = $_COOKIE['fs'];
$font_style = $_COOKIE['fss'];
?>
<body bgcolor="<?= $backgroundName; ?>" text="<?= $foregroundName; ?>">
<h1 style=" font-size:<?= $font_size; ?>; font-style:<?= $font_style; ?>">Welcome to the Store</h1>
<p style=" font-size:<?= $font_size; ?>; font-style:<?= $font_style; ?>">We have many fine products for you to view. Please feel free to browse
the aisles and stop an assistant at any time. But remember, you break it
you bought it!</p>
<p style=" font-size:<?= $font_size; ?>; font-style:<?= $font_style; ?>">Would you like to <a href="cookie.php">change your preferences?</a></p>
</body>
</html>
