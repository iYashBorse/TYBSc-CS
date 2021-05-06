#!/bin/bash
number=9
while [ "$number" -ge 0 ]
do
echo -n "$number "
sleep 1
number=`expr $number - 1`
done
