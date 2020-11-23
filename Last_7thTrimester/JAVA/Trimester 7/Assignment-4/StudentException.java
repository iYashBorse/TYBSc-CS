
class Student{
    private String name;
    private int rollNo;
    private int age;
    private String course;

    public Student(String name , int rollNo , int age , String course){
        Checker checker = new Checker();
        try{
            checker.check(name);
            checker.check(age);
            this.name = name ;
            this.age = age;
            this.rollNo = rollNo;
            this.course = course ;
        }
        catch(NameNotValidException e){
            e.print();
        }
        catch(AgeNotWithinRangeException e){
            e.print();
        }
    }

    public void display(){
        System.out.println(name+"\n"+rollNo+"\n"+age+"\n"+course);
    }
}

class Checker {
    void check(String name) throws NameNotValidException{
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
        for(int i = 0 ; i < name.length() ; i++){
            if(specialCharacters.contains(Character.toString(name.charAt(i)))){
                throw new NameNotValidException(name);
            }
        }
    }

    void check(int age) throws AgeNotWithinRangeException{
        if(age < 15 || age > 21){
            throw new AgeNotWithinRangeException(age);
        }
    }
}

class AgeNotWithinRangeException extends Exception{
    int age;
    public AgeNotWithinRangeException(int age){
        this.age = age;
    }
    void print() {
        System.out.println(age + " Age Is Not In Range");
    }
}

class NameNotValidException extends Exception{
    String name;
    public NameNotValidException(String name){
        this.name = name;
    }

    void print() {
        System.out.println(name + " Is A Invalid Name");
    }
}

public class StudentException {
    public static void main(String[] args){
        Student student1 = new Student("Rutwik",48,20,"TY");
        student1.display();
        Student student2 = new Student("@Sh#",48,20,"SY");
        Student student3 = new Student("Shete",48,25,"SY");
    }
}
