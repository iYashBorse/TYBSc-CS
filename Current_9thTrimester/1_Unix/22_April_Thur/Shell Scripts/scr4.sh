#!/bin/bash
echo -n "Enter the number :: "
read num

a=`expr $num % 6`
b=`expr $num % 7`
if [ $a -eq 0 -a $b -eq 0 ]
then
echo "$num is divisible by 6 and 7"
else
echo "$num is not divisible by 6 and 7"
fi
