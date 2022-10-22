import java.util.*;;
//importing our package and its classes
import Self.*;
public class Main_Package {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        Addition add = new Addition();
        System.out.println(add.Add(a,b));
        Sub s = new Sub();
        System.out.println(s.Sub(a,b));
        Multiply m = new Multiply();
        System.out.println(m.Mul(a,b));
        Division d = new Division();
        System.out.println(d.Div(a,b));
    }
}
