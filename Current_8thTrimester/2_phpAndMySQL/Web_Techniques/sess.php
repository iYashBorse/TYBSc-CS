<?php
session_start();
$_SESSION['hits'] = $_SESSION['hits'] + 1;
echo "This page has been viewed {$_SESSION['hits']} times.";
?>