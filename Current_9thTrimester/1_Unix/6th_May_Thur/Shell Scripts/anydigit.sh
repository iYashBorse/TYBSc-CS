#Display lines containing any digit in the range 1-9, redirect output to 
#output.txt (use grep command)

echo "Enter the filename to check whether it contains any digit or not:"
read FILENAME

grep "[0-9]" $FILENAME > output.txt

echo "Output can be seen in output.txt file"
