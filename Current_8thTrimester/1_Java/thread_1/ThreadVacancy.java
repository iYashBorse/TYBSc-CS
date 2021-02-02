/*Write a program using thread which prints vacancies for a company continuously with a delay of 1 second each time. */

class ThreadVacancy extends Thread{

  Thread t;
  ThreadVacancy(){
    t=new Thread(this);
    t.start();
  }
  public static void main(String a[]){
    new ThreadVacancy();
    }
  public void run(){
    String[] jobs={"Associate", "Manager", "Director", "HR", "Peon"};
      for(;;){
        for(int i=0;i<jobs.length;i++){
          System.out.println(jobs[i]);
        try{
          Thread.sleep(1000);
        }catch(InterruptedException e){
          System.out.println(e);
        }
        }
      }
    }
}
