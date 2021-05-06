#`Display lines of file which can contain at least one occurrence of 
#pattern “hello”  in abc.txt and xyz.txt, redirect output to output.txt txt 
#(use grep command)

echo "If files abc.txt and xyz.txt contain at least one hello then it is redirected to output.txt"

 grep -i "hello" xyz.txt > output.txt && grep -i "hello" abc.txt >> output.txt

echo "Output has been generated in output.txt"

