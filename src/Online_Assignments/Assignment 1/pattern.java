package class_assignment;

public class pattern {

//    static void PATTERN( int n){
//        for( int i=1; i<=n; i++){
//            for( int j=1; j<= 2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        PATTERN(3);

    public static void main(String[] args) {

        for(int i=1; i<=5; i=i+2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3; i>=1; i=i-2){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
    }
    }




