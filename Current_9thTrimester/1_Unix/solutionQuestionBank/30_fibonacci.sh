#!/bin/bash
echo  -n "Enter a number to check :: "
read NUM
#0 1 1 2 3 5 8 13 .....
checkFibonacci () {
									a=0
          b=1
            if [ $NUM -eq $a -o $NUM -eq $b ]
												then	
																				return 1
								    fi 
																				c=$(( $a + $b ))
												
            while [ $c -le $NUM ] 
												do 
                if [ $c -eq $NUM ] 
																then
																								return 1
																fi
																 a=$b
                b=$c
																c=$(( $a + $b ))
								done 
            return 0
        }
checkFibonacci
VALUE=$?
if [ $VALUE -eq 0 ]
then
								echo "no"
else
								echo "yes"
fi
