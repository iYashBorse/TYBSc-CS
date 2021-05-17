#!/bin/bash

echo -e " 1 :: content \n 2 :: number of lines  \n 3 :: Find the word with line number"

echo -n "Enter your choice "
read CHOICE
case $CHOICE in

1) cat $1 ;;
2) wc -l $1 ;;
3) echo "Enter the  a word to find "
read word
grep -n $word $1;;
*) echo "Invalid choice";;
esac
