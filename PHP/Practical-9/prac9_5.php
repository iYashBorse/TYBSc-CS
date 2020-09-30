<?php
abstract class shape{
  abstract function area();
}
class square extends shape{
  private $side;
  private $area;
  function __construct($s){
    $this->side = $s;
  }
  public function area(){
    $this->area = $this->side**2;
    echo "Area of Square is $this->area square units.";
  }
}
class rectangle extends shape{
  private $length; private $breadth;
  private $area;
  function __construct($l,$b){
    $this->length = $l;
    $this->breadth = $b;
  }
  public function area(){
    $this->area = $this->length*$this->breadth;
    echo "<br>Area of Rectangle is $this->area square units.";
  }
}

$s = new square(5);
$s->area();
$r = new rectangle(2,7);
$r->area();
 ?>
