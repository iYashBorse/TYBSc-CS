#!/bin/bash

sod (){
  for (( i=$1; i<=$2; i++ ))
  do
    num=$i
    N=$i
    sum=0
    while [ $num -ne 0 ]
    do
      temp=$(( $num % 10 ))
      sum=$(( $sum + $temp ))
      num=$(( $num / 10 ))
    done
    echo "Sum of digits of $N is $sum."
  done
}

echo "Enter two numbers to print sum of its digits:: "
echo -n "Enter 1st number:: "
read NUM1
echo -n "Enter 2nd number:: "
read NUM2

sod $NUM1 $NUM2
