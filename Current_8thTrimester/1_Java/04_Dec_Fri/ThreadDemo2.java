/*Write a program using thread to print odd numbers between 1 to 50 with a delay of 1 second each time. */

class ThreadDemo2 extends Thread{
  Thread t;
  ThreadDemo2(){
    t=new Thread(this);
    t.start();
  }
  public static void main(String a[]){
    new ThreadDemo2();
  }
public void run(){
for(int c=1;c<=50;c++){
  if(c%2!=0)
    System.out.print(c+" ");
    try{
      Thread.sleep(500);
      }catch(InterruptedException e){
        System.out.println(e);
        }
    }
  }
}
