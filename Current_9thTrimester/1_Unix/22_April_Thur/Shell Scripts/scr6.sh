#!/bin/bash
fileName=$1

if [ -c $fileName ]
then
echo "It is a character special file"
else
echo "It is not a character special file"
fi

