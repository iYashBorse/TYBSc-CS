#!/bin/bash
CHOICE=6

until [ $CHOICE -eq 5 ]
do
echo -en "1 :: Create Directory\n"
echo -en "2 :: Change user permission to read only\n"
echo -en "3 :: Change group permission to read and write only\n"
echo -en "4 :: change  other's permission  to read and execute only\n"
echo -n "5 :: Exit the program "
echo -ne "\nChoose a valid option :: "
read CHOICE

case $CHOICE in

								1) echo -n "Enter a directory name to create :: "
																read NAME

									mkdir $NAME;;

								2) chmod u=r $NAME;;
								3) chmod g=rw $NAME;;
								4) chmod o=rx $NAME;;
								5) echo  "Adios";;
								*) echo "invalid choice";;
esac 
echo "Press Enter to continue .."
read ENTER 
done

