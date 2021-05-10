#!/bin/bash

#Write a function to accept n display following pattern.
#1
#
#1 2
#
#1 2 3

pattern (){
  for (( i=1; i<=$1; i++ ))   #for incrementing each line
  do
    for (( j=1; j<=$i; j++ ))   #for incrementing each number in a single line
    do
      echo -n "$j "             # -n option after echo prevents echo from going to next line
    done
    echo ""
    echo ""                     #adding that extra blank line
  done
}

echo -n "Enter a number:: "
read NUM

pattern $NUM
