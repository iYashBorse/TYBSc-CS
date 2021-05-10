#!/bin/bash
echo "1)Create a Directory."
echo "2)Change to a directory."
echo "3)To rename a direcotry."
echo -n "Enter your choice:: "
read CHOICE

case $CHOICE in
  1) echo -n "Enter directory name:: "
     read dirname
     mkdir $dirname
     echo "$dirname directory created in current directory!"
     ;;
  2) echo -n "Enter directory name:: "
     read dirname
     echo "You were in this directory... "
     pwd
     cd $dirname
     echo "Now you're in this directory..."
     pwd
     ;;
  3) echo -n "Enter old directory name:: "
     read olddirname
     echo -n "Enter new directory name:: "
     read newdirname
     echo "directories previously.."
     ls -d */                             #displays only the directory's name, if you remove the -d option will also display directories content
     mv $olddirname $newdirname
     echo "directories now..."
     ls -d */
     ;;
  *) echo "Inavlid Choice!!!"
    ;;
esac
