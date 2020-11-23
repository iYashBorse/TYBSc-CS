<?php
interface calculation{
  public function area();
  public function volume();
  public function display();
}
class cylinder implements calculation{
  private $radius;
  private $height;
  private $area; private $volume;
  function setData($r,$h){
    $this->radius = $r;
    $this->height = $h;
  }
  function area(){
    $this->area = (2*3.14159*$this->radius)*($this->radius+$this->height);
  }
  function volume(){
    $this->volume = (2*3.14157*($this->radius**2)*$this->height);
  }
  function display(){
    echo "<br>Area of cylinder is ".$this->area." square units.";
    echo "<br>Volume of cylinder is ".$this->volume." cubic units";
  }
}

$cyl = new cylinder();
$cyl->setData(5,10);
$cyl->area();
$cyl->volume();
$cyl->display();
 ?>
