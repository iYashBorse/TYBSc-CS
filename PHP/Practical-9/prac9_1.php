<?php
  class employee{
    private $code;
    private $name;
    private $desig;
    public function setData1($code,$name,$desig){
      $this->code = $code;
      $this->name = $name;
      $this->desig = $desig;
    }
    public function display1(){
      echo $this->code."<br>".$this->name."<br>".$this->desig."<br>";
    }
  }
  class emp_account extends employee{
    private $account_no;
    private $joining_date;
    public function setData2($accno,$jd){
      $this->account_no = $accno;
      $this->joining_date = $jd;
    }
    public function display2(){
      $this->display1();
      echo $this->account_no."<br>".$this->joining_date."<br>";
    }
  }
  class emp_sal extends emp_account{
    private $basic_pay;
    private $earnings;
    private $deduction;
    public function setData3($bp,$earn,$ded){
      $this->basic_pay = $bp;
      $this->earnings = $earn;
      $this->deduction = $ded;
    }
    public function display3(){
      $this->display2();
      echo $this->basic_pay."<br>".$this->earnings."<br>".$this->deduction;
    }
  }

  $emp = new emp_sal();
  $emp->setData1(10,"Ravi","Asst. Manager");
  $emp->setData2(2334,"11/04/2015");
  $emp->setData3(20000,18500,1500);
  echo "Employee Records are: <br>";
  $emp->display3();
 ?>
