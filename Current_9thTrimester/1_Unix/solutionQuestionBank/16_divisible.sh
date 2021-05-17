#!/bin/bash 
echo "Enter a number :: " 
read number
if [ $(( $number % 13 )) -eq 0 ] && [ $(( $number % 15 )) -eq 0 ] 
then 
								echo "Your number is divisible by 13 and 15" 
else
								echo "Your number is not divisible by 13 and 15"
fi
