package Online_Assignments;
import java.util.*;
abstract class Shapes {
    public abstract void getArea();
    public abstract void getVolume();
}
class Derived extends Shapes{
    Scanner input = new Scanner(System.in);
    public void getArea(){
        double AOC,AOS,r,l;
        System.out.println("<-AREA->");
        System.out.println("Enter the radius of Circle");
         r = input.nextDouble();
         AOC = (Math.PI)*Math.pow(r,2);
        System.out.println("Area of Circle: " + AOC);

        System.out.println("Enter the length of Square");
         l = input.nextDouble();
         AOS = Math.pow(l,2);
        System.out.println("Area of Square: " + AOS);
    }
    @Override
    public void getVolume() {
        double VOS,VOC,R,L;
        System.out.println("\n<-VOLUME->");
        System.out.println("Enter the radius of Sphere");
        R = input.nextDouble();
        VOS = (4*(Math.PI)*Math.pow(R,3))/3;
        System.out.println("Volume of Sphere: " + VOS);

        System.out.println("Enter the length of Cube");
        L = input.nextDouble();
        VOC = Math.pow(L,3);
        System.out.println("Volume of Cube: " + VOC);
    }
}
 class  Answer{
     public static void main(String[] args) {
         Derived obj = new Derived();
         obj.getArea();
         obj.getVolume();
     }
}