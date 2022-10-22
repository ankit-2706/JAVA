package another;

import Same.Access;

public class C extends Access {
    public static void main(String[] args) {
        //creating object of class C
        C obj = new C();
//        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c); //it can also be accessed within its same sub classes
//        System.out.println(obj.d);
    }
}
