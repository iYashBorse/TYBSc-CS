#!/bin/bash
echo -n "Enter the number :: "
read num

a=`expr $num % 4`
b=`expr $num % 5`
if [ $a -eq 0 -a $b -eq 0 ]
then
echo "$num is divisible by 4 and 5"
else
echo "$num is not divisible by 4 and 5"
fi
