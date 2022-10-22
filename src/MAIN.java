



//INTERFACE EXTENDS INTERFACE

interface Client{
    void add();
}

interface Client2 extends Client{
    void add();
    void sub();
}
 class Ankit implements  Client2{
    public void add(){
        int a=4;
        int b=9;
        System.out.println("sum:"+ (a+b));
    }
    public void sub(){
        int a=9;
        int b=4;
        int c = a-b;
        System.out.println("Differnce:" + c);
    }
}
public class MAIN {
    public static void main(String[] args) {
        Ankit obj = new Ankit();
        obj.add();
        obj.sub();
    }
}
