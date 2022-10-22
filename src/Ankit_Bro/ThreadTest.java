package Ankit_Bro;
import java.lang.Thread;

//PROGRAM WITH 3 JAVA THREADS
class A1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("\t From ThreadA: i= "+i);
        }
        System.out.println("Exit from A");
    }
}

class B1 extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("\t From ThreadB: j= "+j);
        }
        System.out.println("Exit from B");
    }
}

class C1 extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("\t From ThreadC: k= "+k);
        }

        System.out.println("Exit from C");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        A1 t1 = new A1();
        t1.start();
        B1 t2 = new B1();
        t2.start();
        C1 t3 = new C1();
        t3.start();
    }
}
