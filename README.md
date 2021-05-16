# MakeChangeProject

### Overview

This program simulates a cash register and provides change to customers in the United States Dollar (USD), returning it in descending denominations.  

### Technologies Used

-Java
-Scanner
-Conditionals
-Looping
-Mods
-Conversions

### How to Run

After running the makeChange.java program, the user will be prompted with: "Please enter the asking price."  This simulates being asked for the purchase price of the item they wish to purchase.  After entering the amount of their item, the user is prompted for the amount they are paying, with "Please enter the amount tendered."  The program then provides the total amount of change due, and lists the payout in descending order of denominations. The maximum item price is $20.00, as is the maximum denomination of payment.  If the user's item price is higher than the amount of payment given, a message is displayed informing the user of insufficient payment.  Additionally, if the user pays the same as the item price, a message is displayed thanking them for exact payment.  

### Lessons Learned

During the course of this program's development, a key lesson learned was the propensity of rounding errors when declaring floating variables.  While the program ran without any detectable bugs for the majority of the simulation, rounding errors occurred in calculations where nickels and pennies were used.  It was necessary to convert to integer variables and calculate for the lowest common denominator (penny) for the program to run accurately for all denominations.  
