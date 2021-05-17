#!/bin/bash
echo -n "Enter a text file name :: "
read fileName
touch $fileName
mkdir hello2
mv $fileName hello2
cd hello2
chmod o+wrx $fileName
ls -l
pwd

