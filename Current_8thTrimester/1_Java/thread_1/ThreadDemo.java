class ThreadDemo extends Thread
{
Thread t;
ThreadDemo()
{
t=new Thread(this);
t.start();
}
public static void main(String a[])
{
new ThreadDemo();
}
public void run()
{
for(int c=1;c<=15;c++)
{
System.out.print(c+" ");
try{
Thread.sleep(500);
}catch(InterruptedException e)
{
System.out.println(e);
}
}
}
}
