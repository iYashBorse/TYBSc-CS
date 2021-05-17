#!/bin/#!/usr/bin/env bash
#Write a shell script to accept a filename and perform one of the
#following operations as per the user’s choice, 1) to check whether
#the file exist or not, 2) to check whether the file is block special
#file or not, 3) to check whether the file is character special file
#or not, 4) to check whether the file is a directory or not.

echo "List of actions to be performed on the file:"
echo "1) to check whether the file exist or not."
echo "2) to check whether the file is block special file or not."
echo "3) to check whether the file is character special file or not."
echo "4) to check whether the file is a directory or not."
echo -n "Enter your choice:: "
read CHOICE
echo -n "Enter filename:: "
read FILENAME

case $CHOICE in
  1) if [ -e $FILENAME ]
     then
       echo "$FILENAME exists."
     else
       echo "$FILENAME doesn't exist."
     fi
     ;;
  2) if [ -b $FILENAME ]                  # /dev folder has special block files like sda
     then
       echo "$FILENAME is a block special file."
     else
       echo "$FILENAME is a not block special file."
     fi
     ;;
  3) if [ -c $FILENAME ]                # /dev folder has special character files like tty
     then
       echo "$FILENAME is a character special file."
     else
       echo "$FILENAME is not a character special file."
     fi
     ;;
  4) if [ -d $FILENAME ]
     then
       echo "$FILENAME is a directory."
     else
       echo "$FILENAME is not a directory."
     fi
     ;;
  *) echo "Invalid Choice!!!"
    ;;
esac
