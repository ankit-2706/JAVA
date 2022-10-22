package Ankit_Bro;
import java.lang.Thread;


//IMMPLEMENTING BY EXTENDING THREAD CLASS
class Mythread extends Thread{
    public  void run(){
        for(int i =0; i<5; i++){
            System.out.println("Ankit");
        }
    }
}

public class Mythread2 {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        }
    }



//
//class Mythread extends Thread {
//    public void run() {
//        try {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Ankit");
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException i) {
//            System.out.println("Exception occurs");
//        }
//    }
//
//    public static class Mythread2 {
//        public static void main(String[] args) throws InterruptedException {
//            Mythread t = new Mythread();
//            t.start();
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Kanishk");
//                Thread.sleep(1000);
//            }
//        }
//    }
//}