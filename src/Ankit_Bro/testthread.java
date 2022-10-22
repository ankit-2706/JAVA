package Ankit_Bro;
import java.lang.*;

//class Sample extends Thread{
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//    }
//}
//
//public class testthread {
//    public static void main(String[] args) {
//        Sample t1 = new Sample();
//        Sample t2 = new Sample();
//        Sample t3 = new Sample();
//
//        t1.setName("t1 thread");
//        t2.setName("t2 thread");
//        t3.setName("t3 thread");
//
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//    }
//}



class A2 extends Thread
{
    public void run()
    {
        System.out.println("Thread A started");
        for(int i=1;i<=4;i++)
        {
            System.out.println("\t From ThreadA: i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B2 extends Thread
{
    public void run()
    {
        System.out.println("Thread B started");
        for(int j=1;j<=4;j++)
        {
            System.out.println("\t From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread
{
    public void run()
    {
        System.out.println("Thread C started");
        for(int k=1;k<=4;k++)
        {
            System.out.println("\t From ThreadC: k= "+k);
        }
        System.out.println("Exit from C");
    }
}
class ThreadPriority
{
    public static void main(String args[])
    {
        A2 threadA=new A2();
        B2 threadB=new B2();
        C threadC=new C();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority()+1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Started Thread A");
        threadA.start();
        System.out.println("Started Thread B");
        threadB.start();
        System.out.println("Started Thread C");
        threadC.start();
        System.out.println("End of main thread");
    }
}

