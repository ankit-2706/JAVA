package class_assignment;
                              // ForEach Loop
public class AS2 {
    public static void main(String[] args) {

        int a[]={ 10,20,30,40,50,60};

        //ForEach Loop..
        // They are used to fetch any value from collections( eg- arrays )
        // here :-
        // a-> array variable,
        // b-> reference variable storing data of a.

        for( int b : a ){
            System.out.println( b + " ");
        }

        // or we can do this by using for loop-->

      /*
          for( int i=0; i<a.length; i++){
          system.out.println( a[i] + " ");
          }
       */

    }

}
