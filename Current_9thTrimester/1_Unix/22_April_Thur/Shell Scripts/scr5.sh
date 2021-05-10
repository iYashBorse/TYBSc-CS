#!/bin/bash
fileName=$1

if [ -b $fileName ]
then
echo "It is a special block file"
else
echo "It is not a special block file"
fi
