public class ShoppingList {
    public static void main(String args[]){
        String[] listItems = new String[10];
        for(int i=0 ; i<args.length ; i++){
            listItems[i] = args[i]; // takes the values of list item from the command line argument
                                    // and places it into the listItems array one by one
        }

        for(int i=0 ; i<args.length ; i++){
            System.out.println("Item " + (i+1) +" : "+ listItems[i]); // prints the elements of the listItems array
        }
    }   
    
}
