#!/bin/bash
#To find factorial of a number
read -p "Enter a number::" num
fact=1

for ((i=2;i<=num;i++))
do
	fact=$((fact*i))
done

echo "Factorial of $num is $fact"
