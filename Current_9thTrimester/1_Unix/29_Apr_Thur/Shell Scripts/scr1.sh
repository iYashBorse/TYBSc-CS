#!/bin/bash
#echo -n "Enter the number upto which you want to print odd number :: "
#read num
num=$1
for (( i=1; i <= $num; i++ ))
do
  a=`expr $i % 2`
  if [ $a -ne 0 ]
  then
    echo -n "$i "
  fi
done
