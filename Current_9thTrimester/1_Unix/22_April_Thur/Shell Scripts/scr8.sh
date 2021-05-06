#!/bin/bash
fileName=$1

if [ -f $fileName -a -r $fileName ]
then
echo "It is a regular file and has read permission on."
else
echo "It is not a regular file or doesnt have read permission on."
fi

