echo -n "Enter a file name ::"
read FILENAME

#using symbolic way 
chmod g+wrx $FILENAME
ls -l $FILENAME

#using numberic notation way
chmod 704 $FILENAME
ls -l $FILENAME
