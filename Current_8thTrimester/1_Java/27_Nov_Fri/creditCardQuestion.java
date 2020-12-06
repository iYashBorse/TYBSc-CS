/*

Create an interface “CreditCardInterface” with methods : viewCreditAmount(), useCard(),
payCredit() and increaseLimit(). Create a class SilverCardCustomer (name, cardnumber (16
digits), creditAmount – initialized to 0, creditLimit - set to 50,000 ) which implements the above
interface. Inherit class GoldCardCustomer from SilverCardCustomer having the same methods
but creditLimit of 1,00,000. Create an object of each class and perform operations. Display
appropriate messages for success or failure of transactions. (Use method overriding)
i. useCard() method increases the creditAmount by a specific amount upto creditLimit
ii. payCredit() reduces the creditAmount by a specific amount.
iii. increaseLimit() increases the creditLimit for GoldCardCustomers
 
// Following program opened using Sublime might cause some codeColor issue.
   but will run as good as it's written.  
 

*/

import  java.util.*;
interface CreditCardInterface{

    void useCard();
    void payCredit();
    void increaseLimit();
}

// Silver Card Customer
class SCC implements CreditCardInterface{

    String name="" , card_no="";
    int amount , creditAmount , creditLimit;


    SCC(){
        creditAmount = 0;
        creditLimit = 50000;
    }

    public void accept(){
        System.out.println("\n Enter Card Number :");
        Scanner userInput =  new Scanner(System.in);
        card_no = userInput.nextLine();

        if(card_no.length() == 16){
            System.out.println("\nEnter the name :");
            name = userInput.nextLine();
            System.out.println("\nEnter Credit Amount :");
            creditAmount = userInput.nextInt();
        }
        else{
            System.out.println("\nThe Card Number is Invalid !");
            System.exit(0); // Using this line of code because else the program will ask for other entries
                            // even though you entered card number invalid.
                            // System.exit(0) terminates  java program from any where you want.
                            // And return; statements just returns the control to the calling function.
                            // ref : https://stackoverflow.com/questions/22452930/terminating-a-java-program
        }
        
    }
    
    
    public void display(){
        System.out.println("User name: "+name);
        System.out.println("\nCard number : "+card_no);
    }
    
    
    
    public void useCard(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter new purchases amount:");
        amount = userInput.nextInt();
        
        if(creditAmount + amount <= creditLimit){
            // Look at line 32 , our initialized credit Limit is 50,000
            creditAmount = creditAmount + amount;
            System.out.println("\nThe Credit Amount is : "+creditAmount);
        }
        else
            System.out.println("\nError ! \n Transaction Failed. ");
    }
    
    
    
    
    
    public void payCredit(){
        
        Scanner userInput =  new Scanner(System.in);
        System.out.println("Paise de Bank ko , jo karch kyee creditCard se :");
        amount = userInput.nextInt();
        if((amount - creditAmount) <= creditLimit){
            creditAmount = creditAmount - amount;
            System.out.println("\nThe Credit Amount is :"+creditAmount);
        }
        else
            System.out.println("\nError ! \n Transaction failed.");
    }
    
    
    
    //As we are not specifying  increaseLimit() method for Silver Card Customber  in the question  so it's empty
    //But we have to define it inside our class which extends the interface , because  which'ver methods are declared
    // in a  class that implements an interface must implement all the methods declared in the interface.
    public void increaseLimit(){
    }
   
    
    
}

// Gold Card Customber

class GCC implements CreditCardInterface{
    
    String name , card_no;
    int creditAmount ,  amount , creditLimit;
    
    GCC(){
        creditAmount = 0;
        creditLimit = 100000;
    }
    
    
    public void accept(){
        System.out.println("Enter Card Number :");
        Scanner userInput =  new Scanner(System.in);
        card_no = userInput.nextLine();
        
        if(card_no.length() == 16){
            System.out.println("Enter the name :");
            name = userInput.nextLine();
            System.out.println("Enter Credit Amount");
            creditAmount = userInput.nextInt();
        }
        else{
            System.out.println("The Card Number is Invalid !");
        }
    }
    
    
    public void display(){
        System.out.println("\n\nUser Name : "+name);
        System.out.println("Card Number :"+card_no);
    }
    
    
    public void useCard(){
        System.out.println("\nEnter amount for new purchases :");
        Scanner userInput = new Scanner(System.in);
        amount = userInput.nextInt();
        
        if((creditAmount +amount) <= creditLimit){
            creditAmount = creditAmount + amount;
            System.out.println("\nCredit amount is :"+creditAmount);
        }
        else
            System.out.println("\nError \n Transaction failed.");
    }
    
    
    public void payCredit(){
        System.out.println("\nPaise de Bank ko , jo karch kyee creditCard se :");
        Scanner userInput = new Scanner(System.in);
        amount = userInput.nextInt();
        
        if(amount - creditAmount <= creditLimit){
            creditAmount = creditAmount - amount;
            System.out.println("\nCredit amount is:"+creditAmount);
        }
        else
            System.out.println("\nError \n Transaction failed.");
    }
    
    public void increaseLimit(){
        System.out.println("\nEnter the amount to increase the Limit :");
        Scanner userInput = new Scanner(System.in);
        int amount = userInput.nextInt();
        
        if(amount > 5000 ){
            System.out.println("Amount cannot be exceed 5000 .");
        }
        else
            creditLimit = creditLimit + amount;
        
        System.out.println("\nCredit Card limit is :"+creditLimit);
    } // closing brace of increaseLimit() method
    
} // Closing brace of class GCC


class creditCardQuestion{
    
    public static void main(String[] ninjaHattori){
        int input;
        System.out.println("\n1.Silver Card Customber :\n2.Gold Card Customber :\nEnter the Valid Choice :");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();
        
        
        switch(input){
                case 1:
                SCC silverCardCustomerObject = new SCC();
               
                silverCardCustomerObject.accept();
                silverCardCustomerObject.display();
                silverCardCustomerObject.useCard();
                silverCardCustomerObject.payCredit();
           
                break;
                
                case 2:
                GCC goldCardCustomerObject = new GCC();
                goldCardCustomerObject.accept();
                goldCardCustomerObject.display();
                goldCardCustomerObject.useCard();
                goldCardCustomerObject.payCredit();
                goldCardCustomerObject.increaseLimit();
                
                break;
                
                default:
               System.out.println("Invalid Input !");
    } // Closing brace of main method
} // closing brace of credit class
}//closing brace of creditCardQuestion class
