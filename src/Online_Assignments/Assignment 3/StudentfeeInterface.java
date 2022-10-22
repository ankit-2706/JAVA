package Online_Assignments;
import java.util.*;

interface StudentFee{
    double getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
}
class Hostler implements StudentFee{
    String fn,ln,add,cont;
    double amt;
    void setData(String FirstName,String LastName, String Address, String Contact, double Amount){
        fn = FirstName;
        ln = LastName;
        add = Address;
        cont = Contact;
        amt = Amount;
    }
    public double getAmount(){
        return amt;
    }
    @Override
    public String getFirstName() {
        return fn;
    }
    @Override
    public String getLastName() {
        return ln;
    }
    @Override
    public String getAddress() {
        return add;
    }
    @Override
    public String getContact() {
        return cont;
    }
}
class NonHostler implements StudentFee{
    String fn,ln,add,cont;
    double amt;
    void setData(String FirstName,String LastName, String Address, String Contact, double Amount){
        fn = FirstName;
        ln = LastName;
        add = Address;
        cont = Contact;
        amt = Amount;
    }
    public double getAmount(){
        return amt;
    }
    @Override
    public String getFirstName() {
        return fn;
    }
    @Override
    public String getLastName() {
        return ln;
    }
    @Override
    public String getAddress() {
        return add;
    }
    @Override
    public String getContact() {
        return cont;
    }
}
 class StudentfeeInterface {
    public static void main(String[] args) {
        Hostler obj1 = new Hostler();
        obj1.setData("Ankit", "Chouhan","JR MIG Bhopal","6263376432",45000);
        double amount = obj1.getAmount();
       String fn = obj1.getFirstName();
       String ln = obj1.getLastName();
       String add = obj1.getAddress();
       String cont = obj1.getContact();
        System.out.println("\nFirst Name : "+fn+ "\nLast Name : "+ln+ "\n Address : "+add+ "\n Contact : " +cont+ "\n Amount : " +amount);

        NonHostler obj2 = new NonHostler();
        obj2.setData("Sagar", "Chouhan","Hoshangabad","1234567890",50000);
         amount = obj2.getAmount();
         fn = obj2.getFirstName();
         ln = obj2.getLastName();
         add = obj2.getAddress();
         cont = obj2.getContact();
        System.out.println("\nFirst Name : "+fn+ "\nLast Name : "+ln+ "\n Address : "+add+ "\n Contact : " +cont+ "\n Amount : " +amount);

    }
}
