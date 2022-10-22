package java_from_scatch;
                           //PRIME NUMBER
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number:"+ " ");
        int n = input.nextInt();
        if(n<=1){
            System.out.println("Neither Prime nor Composite");
        }
        int c = 2;
        while( c*c<=n ){
            if( n%c==0){
                System.out.println("Not a Prime Number");
            }
            else{
                System.out.println("Prime Number");
            }
            c++;
        }

    }
}
