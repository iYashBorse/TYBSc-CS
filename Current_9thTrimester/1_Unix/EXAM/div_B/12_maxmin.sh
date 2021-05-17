#!/bin/bash
#Write a shell script to find the maximum and minimum number from n
#given numbers.

echo -n "Enter number of elements:: "
read LIMIT
MAX=0
MIN=0
i=1

while [ $i -le $LIMIT ]
do
  echo -n "Enter a number:: "
  read NUM

  if [ $i -eq 1 ] #setting the first number
  then
    MAX=$NUM
  else
    if [ $NUM -gt $MAX ]
    then
       MAX=$NUM
     fi
  fi

  if [ $i -eq 1 ]
  then
    MIN=$NUM
  else
    if [ $NUM -lt $MIN ]
    then
     MIN=$NUM
    fi
  fi

   i=`expr $i + 1`
done

echo "Maximum of given numbers is $MAX"
echo "Minimum of given numbers is $MIN"
