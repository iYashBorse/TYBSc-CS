#!/bin/bash

#Write a function isPrime, which accepts an integer as parameter and returns
# 1 if the number is prime and 0 otherwise. Use this function in main to
#display the prime numbers between 1 to 50.

isPrime (){
  for (( j=2; j<$1; j++))
  do
    if [ $(( $1 % $j )) -ne 0 ]
    then
      return 1
    else
      return 0
    fi
  done
}


for (( i=1; i<=50; i++))
do

  isPrime $i
  RESULT=$?
  if [ $RESULT -eq 1 ]
  then
    echo "$i is prime."
  fi
done
