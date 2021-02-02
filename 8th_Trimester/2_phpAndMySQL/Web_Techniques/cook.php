<?php
$pageAccesses = $_COOKIE['accesses']; 
setcookie('accesses', ++$pageAccesses);
echo "you have accessed it ". $pageAccesses." times";
?>