#!/bin/bash
echo "1)Fleshy"
echo "2)Dried"
echo "3)Citrus"
echo "4)Melons"
echo "5)Berries"
echo -n "Select a type to display fruits of that type :: "
read CHOICE

case $CHOICE in
1) echo "Apple, Litchi,Dragon Fruit, Mango, Pear";;
2) echo "Almonds, Cashew, Dates, Hazelnut, Raisins";;
3) echo "Orange, Grapefruit, Lemon, Clementine, Tangerine";;
4) echo "Cantaloupe, Watermelon, Squash, Honeydew";;
5) echo "Cranberry, Blueberry, Cherry, Raspberry, Strawberry";;
*) echo "Invalid Choice!!!"
esac
