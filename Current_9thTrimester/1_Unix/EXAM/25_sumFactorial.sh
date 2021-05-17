#!/bin/bash
CHOICE=5
until [[ $CHOICE -eq 3 ]]
do
echo "1 :: Factorial"
echo "2 :: Sum of Digits "
echo "3 :: Exit the Program"
echo -n "Choose a number for Corresponding Option :: "
read CHOICE
case $CHOICE in
1) 
								echo -n "Enter a number :: "
								read num
								fact=1
								for((i=2;i<=num;i++))
								{
										fact=$((fact * i))  
								}
								echo "The Factorial of no :: "
								echo $fact;;
2) 
								echo -n "Enter a number :: "
								read num

								sum=0

								while [ $num -gt 0 ]
								do
												mod=$((num % 10))   
												sum=$((sum + mod))  
												num=$((num / 10)) 
								done
								echo "Sum of Digits "
								echo "Sum is :: $sum";;

3) echo "Adios!";;
*) echo "Invalid Input !";;
esac
echo "Press Enter to continue.."
read ENTER
done
