<?php
class account{
  private $accno;
  private $cust_name;
  public function setData1($a,$c){
    $this->accno = $a;
    $this->cust_name = $c;
  }
  public function display1(){
    echo "Account no: $this->accno <br>Customer name: $this->cust_name";
  }
}
class savings_acc extends account{
  private $balance; private $min_amount;
  public function setData2($bal,$min){
    $this->balance = $bal;
    $this->min_amount = $min;
  }
  public function display2(){
    echo "<br> Savings account Details: <br>";
    $this->display1();
    echo "<br>Balance: $this->balance <br>Minimum amount: $this->min_amount";
  }
}
class current_acc extends account{
  private $balance; private $min_amount;
  public function setData2($bal,$min){
    $this->balance = $bal;
    $this->min_amount = $min;
  }
  public function display2(){
    echo "<br> Current account Details: <br>";
    $this->display1();
    echo "<br>Balance: $this->balance <br>Minimum amount: $this->min_amount<br>";
  }
}
$ch = 2;
while($ch!=0){
  switch($ch){
    case 1:
            $sa = new savings_acc();
            $sa->setData1(2245,"Ravi");
            $sa->setData2(20000,5000);
            $sa->display2();
            $ch -= 1;
            break;
    case 2:
            $ca = new current_acc();
            $ca->setData1(4590,"Hari");
            $ca->setData2(35000,10000);
            $ca->display2();
            $ch -= 1;
            break;
  }
}
 ?>
