package java_from_scatch;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in Celcius");
        float tempC = input.nextFloat();
        float tempF = ( tempC * 9/5 ) + 32;
        System.out.println(tempF);
    }

}
