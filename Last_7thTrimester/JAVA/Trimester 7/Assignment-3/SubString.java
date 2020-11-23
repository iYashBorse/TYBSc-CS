public class SubString {
    public static void main(String[] args){
        String str = "I am Rutwik Uday Shete . Who Are You ?";

        System.out.println("The Original String Is : " + str);

        String subString = str.substring(5, 22); //this substring function will return a string from index 5 to 22 index
                                                 //including char at 5th index and excluding the character at 22nd i
        System.out.println("The SubString Is : " + subString);
    }
}