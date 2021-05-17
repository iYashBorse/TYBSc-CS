#Display  line don not containing “hello” pattern in it ,redirect output 
#to output.txt(output should be appended to current content of file txt (use 
#grep command)

echo "Enter filename to print lines in it that do not contain 'hello' :"
read FILENAME

grep -vi "hello" $FILENAME > output.txt

echo "Output has been generated to output.txt"

