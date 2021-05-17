#!/bin/bash

#Logical Operator Logical ! (not)  ,logical  AND , logical OR 

echo -n  "Enter number  1 or 0 :: "
read n1
echo -n "Enter number 1 or 0 :: "
read n2

if(($n1 == 1 & $n2 ==  1))
then
								echo "both 1"
else
								echo "not same"
fi

if(($n1 == 1 || $n2 == 1 ))
then
echo "atleast one is 1"
else
								echo "both different"
fi


if (($n1 != $n2 ))
then
    echo "different"
else
     echo "same"
fi
