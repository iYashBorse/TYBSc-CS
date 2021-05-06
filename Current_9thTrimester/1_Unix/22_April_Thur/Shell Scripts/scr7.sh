#!/bin/bash
fileName=$1

if [ -d $fileName ]
then
echo "It is a directory"
else
echo "It is not a directory"
fi

