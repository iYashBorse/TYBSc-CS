/* 
	
	Super Keyword  in java : 

	The super keyword refers to superclass (parent) objects. 
	It is used to call superclass methods, and to access the 
	superclass ( parent ) constructor. The most common use of the super
	keyword is to eliminate the confusion between superclasses ( parent class )
	and subclasses that have methods with the same name.   ( ref from  - W3school)

*/




class cust{
	private int cno;
	private String cname;

		cust(int cno,String cname){
		this.cno=cno;
		this.cname=cname;
		}


		void display(){
		System.out.println(cno+" "+cname);
		}
}

class custacc1 extends cust{

	private int balance;

		custacc1(int balance){
		super(333,"Doreamon");
		this.balance=balance;
		}

		void display(){
		super.display();
		System.out.print(""+balance+"\n");
		}

		public static void main(String ninjaHattori[]){
		custacc1 custObj=new custacc1(15000);
		custObj.display();
		}

}