<html>
<head><title>Preferences Set</title></head>
<body>
<?php
$colors = array(
 'black' => "#000000",
 'white' => "#ffffff",
 'red' => "#ff0000",
 'blue' => "#0000ff"
);
$font_size_arr = array(
  '12' => "12px",
  '16' => "16px",
  '20' => "20px"
);
$font_style_arr = array(
  'plain' => "normal",
  'italic' => "italic",
  #'bold' => "bold"
);
$backgroundName = $_POST['background'];
$foregroundName = $_POST['foreground'];
$font_size = $_POST['Font_Size'];
$Font_Style = $_POST['Font_Style'];
setcookie('bg', $colors[$backgroundName]);
setcookie('fg', $colors[$foregroundName]);
setcookie('fs', $font_size_arr[$font_size]);
setcookie('fss', $font_style_arr[$Font_Style]);
?>
<p>Thank you. Your preferences have been changed to:<br />
Background: <?= $backgroundName; ?><br />
Foreground: <?= $foregroundName; ?><br />
Font Size: <?= $font_size; ?><br />
Font Style: <?= $Font_Style; ?></p>

<p>Click <a href="cookie2.php">here</a> to see the preferences
in action.</p>
</body>
</html>
