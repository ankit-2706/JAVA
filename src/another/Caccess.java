package another;
import Same.Access;

public class Caccess {
    public static void main(String[] args) {
        Access obj = new Access();
//        System.out.println(obj.a);  //cann't access a bcoz its private member
        System.out.println(obj.b);
//        System.out.println(obj.c);    //cann't access sc bcoz its protected member,protected member can be accessed in same package but not in different package
//        System.out.println(obj.d);
    }
}
