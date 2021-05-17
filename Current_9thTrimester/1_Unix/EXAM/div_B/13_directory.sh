#!/bin/bash
#Write a shell script to create a new directory, changing directory,
#and renaming the directory.

echo -n "Enter a directory name to create:: "
read DIR
mkdir $DIR
echo "Created a directory with the name '$DIR' in current directory."

echo -n "Enter a directory name to change to it:: "
read DIR1
cd $DIR1
echo -n "Now we're in "
pwd

cd -
echo -n "Enter a new directory name:: "
read DIR2
mv $DIR $DIR2
echo "New name of $DIR is $DIR2 ."
