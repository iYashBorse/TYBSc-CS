#!/bin/bash


CHOICE=6

until [[ $CHOICE  -eq 5 ]]
do

echo -ne " 1 :: Create a Directory \n 2 :: Remove a Directory \n 3 :: Change the name of a directory \n 4 :: print working directory ::\n 5 :: Exit "
echo -ne "\nEnter your Choice :: "
read CHOICE
case $CHOICE in 
								
								1)echo -n "Enter a name for directory to create "
																read name
																mkdir $name;;
								2)echo -n "enter name of directory to remove ( if exists )"
																read name
																rmdir $name;;
								3)echo -n "Enter  old name and new name of directory "
																read oldName newName
																mv $oldName $newName;;
								4)pwd;;
								5) echo  "Adios";;
								*) echo  "Invalid choice";;

esac 
echo "press Enter to continue..."
read ENTER
done
