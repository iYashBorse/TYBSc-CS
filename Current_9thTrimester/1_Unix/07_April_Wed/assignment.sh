#!bin/bash
echo "1 :Write a shell script to display following details(use environment variables)
current username. USER :"
echo "-------------------------------------------------------------------------------"
user="$USER"
shell="$SHELL"
pwd="$PWD"
hostname="$HOSTNAME"
echo "User Name Is =>  $user"
echo "User Id Is => $UID"
echo "My Shell Is => $shell"
echo "My Directory Is => $pwd"
echo "My Host Is => $hostname"
echo "My Home Is => $HOME"
echo "-------------------------------------------------------------------------------"

echo "2. Write a echo statement to print “UNIX” and LINUX on separate lines using single echo command :"

echo -e "UNIX \nLINUX"


echo "-------------------------------------------------------------------------------"

echo "3. Write echo statement to print “Hello” and “World”  separated by horizontal tab using single echo statement : "
echo -e "Hello \tWorld"

echo "-------------------------------------------------------------------------------"

echo "4. Write a shell script to accept list of  command line argument, using shell special variables display following information :"
echo "File Name Is => $0"
echo "Command Line Arguments Are => $*"
echo "Process ID Is => $$"
echo "Number Of Arguments => $#"
echo "-------------------------------------------------------------------------------"

echo "5. Write a shell script to assign output of date command to user variable in shell script code. : "
todayDate="$(date)"
echo "Todays Date Is => $todayDate"