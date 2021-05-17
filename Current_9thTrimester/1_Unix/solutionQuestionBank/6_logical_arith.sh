#!/bin/bash

echo -n "Enter 1st Number :: "
read  number1
echo -n "Enter 2nd Number :: "
read number2
until [ $CHOICE -eq 6 ]
do
echo -e " 1 :: Addition \n 2 :: Substraction \n 3 :: Multiplication \n 4 :: Division \n 5 :: Modulus \n 6 :: Exit \n "
echo -n "Enter your choice "
read CHOICE
case $CHOICE in
1) sum=$(( $number1 + $number2 ))
echo "Addition is :: $sum";;
2) sub=$(( $number1 - $number2 ))
echo "Substraction is :: $sub";;
3) mul=$(( $number1 * $number2 ))
echo "Multiplication is :: $mul";;
4) Division=$(( $number1 / $number2 ))
echo "Division is :: $div";;
5) mod=$(( $number1 % $number2 ))
echo "Modulus  is :: $mod";;
6) echo "adios";;
*) echo "Invalid choice";;
esac
echo "press Enter to conitnue ..."
read ENTER
done

