
// USER DEFINED EXCEPTION

class InvalidageException extends  Exception{
    InvalidageException( String msg){
        System.out.println(msg);
    }

}
public class UserdefindException {
    public static void vote( int age ) throws InvalidageException{
        if(age < 18){
            throw new  InvalidageException(  "Not eliglible for voting");
        }
        else{
            System.out.println("Eliglible to voting");
        }

    }
    public static void main(String[] args) {
        try {
            vote( 13);
        }
        catch( Exception e){
            System.out.println(e);
        }
    }
}
