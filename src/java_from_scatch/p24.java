package java_from_scatch;          //OPERATORS
import java.util.ArrayList;

public class p24 {
    public static void main(String[] args) {

        System.out.println('a' + 'b');  //returns addition of ascii values
        System.out.println("a" + "b");  //if starting one is string,then ans would be string
        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1);    //returns string

        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        //'+' -> this operator is only allowed if at least of them is string or for the data types

        System.out.println("Ankit" + new ArrayList<>());
        System.out.println("Ankit" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>(); //
        System.out.println(ans);

        System.out.println("a" + 'b');  //returns string
    }
}