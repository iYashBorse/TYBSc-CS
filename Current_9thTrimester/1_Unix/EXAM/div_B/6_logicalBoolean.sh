#!/bin/bash

#Logical Operator Logical ! (not)  ,logical  AND , logical OR 

echo -n  "Enter number  1 or 0 :: "
read n1
echo -n "Enter number 1 or 0 :: "
read n2

if [  $n1 -eq 1  -a  $n2 -eq 1 ]
then
								echo "both 1"
else
								echo "not 1"
fi

if [ $n1 -eq 1  -o $n2 -eq 1 ]
then
echo "atleast one is 1"
else
								echo "none is 1"
fi


if [[ !$n1 -eq 1 ]]
then
    echo "1"
else
     echo " 0"
fi
