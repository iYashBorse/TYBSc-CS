<html>
<!-- Ask user for a input and check whether it is divisible by 5, if so,
    check whether it is also divisible by 10. -->
<body>
  <form method="POST">
  Enter a number: <input type="text" name="num">
  <br><br> <input type="submit">
</form>
<?php
  $num = $_POST["num"];
  if($num%5==0){
    if($num%10==0){
      echo "$num is divisible by 5 and 10 both.";
    }
    else{
    echo "$num is divisible by 5 but not 10.";
  }
}else{
  echo "$num is not divisible by 5.";
}
/* As far as I know, you cannot directly accept value explicitly in PHP,
  therefore, we use forms. 
  There are few functions to read input from the users  depending on the Program Need. 
  One of them is readline()  
  eg :  $a = readline("Enter your name:") 
        echo" Hey , " , $a;
        
       ouput : Enter your name: Yash 
               Hey , Yash
 */
  
?>
</body>
</html>
