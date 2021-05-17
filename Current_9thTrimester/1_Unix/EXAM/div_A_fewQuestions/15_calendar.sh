#!/bin/bash
CHOICE=8

until [ $CHOICE -eq 6 ]
do
echo -en " 1 :: Current Year \n 2 :: previous , current , next month \n 3 :: Hours {1..12} {1..24} \n 4 :: current day of month \n 5 :: current date in YYYY-MM-DD \n 6 :: Exit "
echo -ne "\nEnter a valid choice :: "
read CHOICE

case $CHOICE in 
								1)cal -y;;
								2)cal -3;;
								3)date "+%I  %H";;
								4)date "+%d";; 
								5)date "+%Y %m %d";;
								6)echo Adios;;
								*)echo Invalid Choise ;;
esac
echo "Enter to conitnue.."
read ENTER
done
