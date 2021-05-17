#!/bin/bash

Vowel(){

echo -en "Vowel Check Script\n"
echo -ne "Enter a character to check :: "
read CHAR

case $CHAR in

a)  return 1;;
e) 	return 1;;
i) 	return 1;;
o) 	return 1;;
u)  return 1;;
*) return 0;;

esac

}
Vowel
result=$?
if [ $result -eq 1 ]
then 
echo "si , vowel"
else
echo "nope"
fi

