#!/bin/bash
  pattern (){
										chars=( {a..z})
    for (( i=0; i<=$1; i++ ))   #for incrementing each line
    do
      for (( j=0; j<$i; j++ ))   #for incrementing each number in a single
      do
        echo -n "${chars[$j]} "             # -n option after echo prevents echo from
     done
      echo ""
      echo ""                     #adding that extra blank line
    done
  }
 
 echo -n "Enter a number:: "
  read NUM
 
 pattern $NUM
