package java_from_scatch.Binary_Search.Leet;
import java.util.Scanner;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

//APPROACH
//Exact same approach for ceiling of a number
//ignore the target = what we are looping for
//condition voilated: when start = end+1 i.e, equals to the length of Array
//if there does not exist such character >= target char,then in that case it returns 1st character

public class Smallest_letter {
    public static void main(String[] args) {
         char letters[] = {'c','f','j'};
         char target = 'c';

        //Function which takes array name and target element as its parameters
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char letters[], char target) {

        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            //finding middle element
//            int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
            int mid = start+(end-start)/2;
            //cheking on left side
            if( target<letters[mid] ){
                end = mid-1;
            }
            //checking on right side
            else {
                start=mid+1;
            }
        }
        //if after traversing through whole array,target element not found,return -1
        //this modulo returns the index of first char,through which we access the character
        return letters[start%letters.length];
    }
}





