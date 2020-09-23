class VowelException extends Exception{
    public void printErrorVowel(){
        System.out.println("VOWEL EXCEPTION -> CHARACTER CONTAINS VOWELS!!");
    }
}
 
class BlankException extends Exception{
    public void printErrorBlank(){
        System.out.println("BLANK EXCEPTION!!");
    }
}
 
class ExitException extends Exception{
    public void printErrorExit(){
        System.out.println("EXIT AND TERMINATE!!");
        System.exit(0);
    }
}
 
class Test{
    public void check(char CH) throws VowelException,BlankException,ExitException{
        if(CH == 'A' || CH =='a' || CH =='E' || CH =='e' || CH =='I' || 
            CH =='i' || CH == 'O' || CH=='o' || CH =='U' || CH =='u'){
                throw new VowelException();
            }
        else if(CH == ' '){
            throw new BlankException();
        }
        else if(CH == 'X'){
            throw new ExitException();
        }
        else{
            System.out.println("Valid Character");
        }
    }
}
 
public class CharacterException {
    public static void main(String[] arg){
        String string = arg[0]; 

        char CH = string.charAt(0);

        Test obj = new Test();
        
        try{
            obj.check(CH);
        }
        catch(VowelException e){
            e.printErrorVowel();
        }
        catch(BlankException e){
            e.printErrorBlank();
        }
        catch(ExitException e){
            e.printErrorExit();
        }

        System.out.println("This Is Rest of The Code");

    }
}
