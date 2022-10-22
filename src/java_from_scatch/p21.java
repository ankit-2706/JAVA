package java_from_scatch;        //STRINGS
public class p21 {
    public static void main(String[] args) {

        //here a & b are reference variables pointing to the same object Ankit
        //these object are created in the heap memory inside string pool

        String a = "Ankit";
        String b = "Ankit";
        String c = a;

//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        //syntax of creating new object of String
        //here name1 & name2 are refernce variables pointing to 2 different object  Ankit
        //these object are created in heap memory but outside the string pool

        String name1 = new String("Ankit");
        String name2 = new String("Ankit");

        // '==" -> this is comparator which gives true ya false value.
        //"TRUE"-if reference variables are pointing to same object
        //"FALSE"-if reference variables are pointing to different object

        System.out.println(name1 == name2);

        // '.equals()'-> this is method which actually compares the value
        // "TRUE"- if values are same
        // "FALSE"- if values are different

        System.out.println(name1.equals(name2));
    }
}
