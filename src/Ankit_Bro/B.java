package Ankit_Bro;
import java.lang.Thread;

       //IMPLEMENTATION OF THREAD BY IMPLIMENTING RUNNABLE INTERFACE
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("My Child Thread");
        }
    }

}
public class B {
    public static void main(String[] args) {
        A2 r = new A2();
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
