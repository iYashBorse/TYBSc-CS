class InvalidClass extends Exception{
    public void print(){
        System.out.println("You Entered Invalid Class");
    }
}

public class InvalidClassOfStudy {
    public static void main(String[] args){
        String name = args[0];
        String classOfStudy = args[1];

        try{
            check(classOfStudy);
            System.out.println("Name Entered : "+name+"\nClass Entered : "+classOfStudy);
        }
        catch(InvalidClass e){
            e.print();
        }
    }

    public static void check(String classOfStudy) throws InvalidClass{
        if(!classOfStudy.equals("FY") && !classOfStudy.equals("SY") && !classOfStudy.equals("TY")){
            
            throw new InvalidClass();

        }
    }
}
