<?php
abstract class SOCS{
  abstract function accept($n,$e);
  abstract function display();
}
class BSC extends SOCS{
  private $name;
  private $experience;
  function accept($n,$e){
    $this->name = $n;
    $this->experience = $e;
  }
  function display(){
    echo "$this->name from BSC has an experience of $this->experience years.";
  }
}
class BCA extends SOCS{
  private $name;
  private $experience;
  function accept($n,$e){
    $this->name = $n;
    $this->experience = $e;
  }
  function display(){
    echo "<br>$this->name from BCA has an experience of $this->experience years.";
  }
}

$bsc = new BSC();
$bsc->accept("MS Subhramaniyam",15);
$bsc->display();
$bca = new BCA();
$bca->accept("Shashi Tharoor",10);
$bca->display();
 ?>
