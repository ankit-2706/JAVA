package Online_Assignments;

public class NullPointerException {
    public static void main(String[] args) {
        try{
            String name = "Ankit";
            name = null;
            System.out.println(name.length());
        }
        catch(RuntimeException e){
            System.out.println(e.toString());
        }
    }
}
