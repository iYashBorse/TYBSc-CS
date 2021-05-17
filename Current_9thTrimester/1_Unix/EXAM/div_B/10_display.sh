#!/bin/bash
#Write a shell script to accept the filename and perform one of the
#following operations as per the user’s choice,1) Display the contents
#of the file, 2) Display number of lines in the file, 3) Display lines
#along with line numbers from file which contains given word.

echo -n "Enter file name: "
read FILENAME

echo "1) Display the contents of the file"
echo "2) Display number of lines in the file"
echo "3)display lines along with line numbers from file which contains given word"
echo -n "Enter your choice:: "
read CHOICE

case $CHOICE in
  1) cat $FILENAME
  ;;
  2) wc -l $FILENAME
  ;;
  3)echo -n "Enter a word: "
  read WORD
  fgrep -n $WORD $FILENAME
  ;;
  *) echo "Invalid Choice!!"
    ;;
esac
