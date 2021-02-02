import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private int age;
    private String course;

    static int count = 0;

    public Student(String name , int rollNo , int age , String course){
        this.name = name ;
        this.age = age;
        this.rollNo = rollNo;
        this.course = course ;
        count++;
    }

    public void display(){
        System.out.println("\nName : "+name+"\nRoll No :"+rollNo+"\nAge :"+age+"\nCourse :"+course+"\n\n");
    }
}

class Checker{
    void checkObject() throws ClassAlreadyCreatedException{
        if(Student.count >= 1){
            throw new ClassAlreadyCreatedException();
        }
    }
}

class ClassAlreadyCreatedException extends Exception{
    void print(){
        System.out.println("Already One Class Created");
    }
}

public class SecondObject {
    
    public static void main(String[] args){
        System.out.println("\nCreating Class For The First Time ..........\n");
        createClass();
        System.out.println("Creating Class For The Second Time ..........\n");
        createClass();
    }

    public static void createClass(){

        String name , course;
        int age , roll;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Name");
        name = input.nextLine();
        System.out.println("Enter Age");
        age = input.nextInt();
        System.out.println("Enter Roll");
        roll = input.nextInt();
        input.nextLine();
        System.out.println("Enter Course");
        course = input.nextLine();

        try{
            Checker checker = new Checker();
            checker.checkObject();
            Student student = new Student(name,roll,age,course);
            System.out.println("\nClass Created Successfully : \n");
            student.display();
        }
        catch(ClassAlreadyCreatedException e){
            e.print();
        }
    }
}
