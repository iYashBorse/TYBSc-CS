import java.util.Date;

class ThreadDate extends Thread{
  Thread t;
  ThreadDate(){
    t=new Thread(this);
    t.start();
  }
  public static void main(String[] ar){
    new ThreadDate();
  }
    public void run(){
      for(;;){
        Date d= new Date();
        System.out.println(d);
        try{
          Thread.sleep(1000);
        }catch(InterruptedException e){
          System.out.println(e);
        }
      }
    }
}
