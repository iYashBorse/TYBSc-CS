#!/bin/bash
echo -n "Enter number of elements: "
read n

i=1
max=0
min=0

while [ $i -le $n ]
do
    echo -n "Enter number$i :"
    read num
    if [ $i -eq 1 ]
    then
      max=$num
      min=$num
    else
      if [ $num -gt $max ]
      then
        max=$num
      fi
      if [ $num -lt $min ]
      then
        min=$num
      fi
    fi
    i=$(( i + 1 ))
  done
  echo " "
  echo "$max is maximum, $min is minimum"
