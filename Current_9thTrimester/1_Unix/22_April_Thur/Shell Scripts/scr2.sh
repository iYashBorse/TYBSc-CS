#!/bin/bash
h1=$1
h2=$2
h3=$3

if [ $h1 -gt $h2 -a $h1 -gt $h3 ]
then
echo "Student1 with height $h1 ft is tallest"
elif [ $h2 -gt $h1 -a $h2 -gt $h3 ]
then
echo "Student2 with height $h2 ft is tallest"
else
echo "Student3 with height $h3 ft is tallest"
fi

if [ $h1 -lt $h2 -a $h1 -lt $h3 ]
then
echo "Student1 with height $h1 ft is smallest"
elif [ $h2 -lt $h1 -a $h2 -lt $h3 ]
then
echo "Student2 with height $h2 ft is smallest"
else
echo "Student3 with height $h3 ft is smallest"
fi
