#!/bin/bash

#Write a function to accept two integers x and y and calculate the sum of
#all integers between x and y (both inclusive)

sum (){
  SUM=0
  x=$1; y=$2
  for (( i=$x; i<=$y; i++ ))
  do
    SUM=$(( $SUM + $i ))
  done
  echo "Sum of numbers between $x and $y is $SUM. $x and $y included."
}

echo "Enter two numbers to print sum of its digits:: "
echo -n "Enter 1st number:: "
read NUM1
echo -n "Enter 2nd number:: "
read NUM2

sum $NUM1 $NUM2
