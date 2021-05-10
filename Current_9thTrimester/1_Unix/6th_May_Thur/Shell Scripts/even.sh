#!/bin/bash

#Write a function isEven, which accepts an integer as parameter and returns
#1 if the number iseven, and 0 otherwise. Use this function in main to accept
#n numbers and check if they are even or odd.

isEven (){
  num=`expr $1 % 2`
  if [ $num -eq 0 ]
  then
    return 1
  else
    return 0
  fi
}

echo -n "Enter number of elements:: "
read ELE
for (( i=0; i<$ELE; i++))
do
  echo -n "Enter number:: "
  read NUM
  isEven $NUM
  RESULT=$?
  if [ $RESULT -eq 1 ]
  then
    echo "$NUM is even."
  else
    echo "$NUM is odd."
  fi
done
