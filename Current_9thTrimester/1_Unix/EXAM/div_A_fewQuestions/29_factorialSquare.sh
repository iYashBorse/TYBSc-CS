#!/bin/bash
echo -n "Enter a number :: "
read num

rem=$(( $num % 2 ))
 
if [ $rem -eq 0 ]
then
								
          fact=1
          for((i=2;i<=num;i++))
          {
            fact=$((fact * i))
          }
        echo "The Factorial of no :: "
        echo $fact
else
								echo " $((num*num))"

fi

