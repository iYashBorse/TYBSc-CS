#!/bin/bash
#Write a program, which accepts two strings and check for all
#comparisons using string operators.

echo -n "Enter 1st String:: "
read STR1
echo -n "Enter 2nd String:: "
read STR2

if [ $STR1 = $STR2 ]
then
  echo "$STR1 is equal to $STR1 using '=' operator "
else
  echo "$STR1 is not equal to $STR2 using '=' operator "
fi

if [ $STR1 != $STR2 ]
then
  echo "$STR1 is not equal to $STR1 using '!=' operator "
else
  echo "$STR1 is equal to $STR2 using '!=' operator "
fi

if [ -z $STR1 ]
then
  echo "$STR1 size is zero using '-z' operator. "
else
  echo "$STR1 size is not zero using '-z' operator. "
fi

if [ -n $STR1  ]
then
  echo "$STR1 size is not zero using '-n' operator. "
else
  echo "$STR1 size is zero using '-n' operator. "
fi

if [  $STR1  ]
then
  echo "$STR1 is not empty. "
else
  echo "$STR1 is empty "
fi
