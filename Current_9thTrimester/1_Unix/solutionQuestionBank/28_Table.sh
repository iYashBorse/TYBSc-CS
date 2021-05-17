#!/bin/bash
echo -n "Enter a number :: "
read number
i=0
while [[ $i -le 10 ]]
do
          echo " $number x $i = $(( number * i ))"
										i=$(( i + 1 ))
done
