#!/bin/bash

echo -n "Enter limit n :: "
read N

a=0  
b=1 
echo -e "\nThe Fibonacci series is : "
   
for (( i=0; i<N; i++ ))
do
    echo -n "$a "
    fn=$((a + b))
    a=$b
    b=$fn
done
echo -e "\n"
