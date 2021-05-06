#!/bin/bash
#Write a function to accept character and return 1 if it vowel and 0
#otherwise .Use this function in main to accept a character and display it
#Is vowel or not (use switch case in function to check for vowel)

checkVowel (){

  if [ $CHAR == 'a' -o $CHAR == 'A' -o $CHAR == 'e' -o $CHAR == 'E' -o $CHAR == 'i' -o $CHAR == 'I' -o $CHAR == 'o' -o $CHAR == 'O' -o $CHAR == 'u' -o $CHAR == 'U' ]
  then
    return 1
  else
    return 0
  fi
}

echo -n "Enter a character:: "
read CHAR

checkVowel
RESULT=$?               #captures value return by last command
if [ $RESULT -eq 1 ]
then
  echo "$CHAR is a vowel."
else
  echo "$CHAR is a consonant."
fi
