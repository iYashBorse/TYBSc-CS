#!/bin/bash
#Write a shell script to display odd numbers from 1 to n. Accept number
#as a command line argument.

NUM=$1

for(( i=1; i<=$NUM; i++ ))
do
  N=`expr $i % 2`
  if [ $N -ne 0 ]
  then
    echo -n "$i "
  fi
done
