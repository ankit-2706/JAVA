package pack;
import pack.Additon;       //IMPORTING PACK PACKAGE HERE..
                         //syntax: import(keyword) package_name.class_name

public class Use1 {
    public static void main(String[] args) {
        //creating object of addition class
        Additon obj=new Additon(8.5,10.5);
        obj.sum();
    }
}
