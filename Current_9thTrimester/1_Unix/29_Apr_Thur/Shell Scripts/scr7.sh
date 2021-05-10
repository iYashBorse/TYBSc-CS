#!/bin/bash
echo -n "Enter a number :: "
read number
if [ $(( $number % 17 )) -eq 0 ] && [ $(( $number % 19 )) -eq 0 ]
then
    echo "Your number is divisible by 19 and 17"
else
    echo "Your number is not divisible by 19 or 17"
fi
