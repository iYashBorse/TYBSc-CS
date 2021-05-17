#!/bin/bash
#Write a function to accept an integer and return sum of digits of the given number

sod (){
  num=$1
  sum=0
  while [ $num -ne 0 ]
  do
    temp=$(( $num % 10 ))
    sum=$(( $sum + $temp ))
    num=$(( $num / 10 ))
  done
  echo "Sum of digits is $sum."
}

echo -n "Enter a number to print sum of its digits:: "
read NUM

sod $NUM
