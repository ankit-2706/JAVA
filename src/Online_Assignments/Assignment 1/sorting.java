package class_assignment;
import java.util.Arrays;
import java.util.Scanner;

public class sorting {
        public static void bubbleSort(int [] sort_arr, int len){
            for (int i=0;i<len-1;++i){
                for(int j=0;j<len-i-1; ++j){
                    if(sort_arr[j+1]<sort_arr[j]){
                        int temp = sort_arr[j];
                        sort_arr[j] = sort_arr[j+1];
                        sort_arr[j+1] = temp;
                    }
                }
            }
        }
        public static void main( String args[] ) {
            Scanner input = new Scanner(System.in);

            int [] array = new int[5] ;
            int len = array.length;
            System.out.println("Enter the Numbers:");
            for( int i=0; i<len; i++){
                array[i] = input.nextInt();
            }
            bubbleSort(array,len);
            System.out.println("Ascending order: " + Arrays.toString(array));
    }
}
