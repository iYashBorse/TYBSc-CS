#!/bin/bash
CHOICE=5
until [ $CHOICE -eq 4 ]
do
echo -n -e "Choose a number for Corresponding Course ::\n"
echo "1 :: MSc"
echo "2 :: MBA"
echo "3 :: BSc"
echo "4 :: Exit the Program"
read CHOICE
case $CHOICE in
1) echo "The Course is MSc";;
2) echo "The Course is MBA";;
3) echo "The Course is BSc";;
4) echo "Bye Bye!";;
*) echo "Invalid Input !";;
esac
echo "Press Enter to continue.."
read ENTER
done
