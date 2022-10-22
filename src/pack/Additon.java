                                             //PACKAGES
   //Packages are pack of classes,interfaces and other packages.
   //There are 2 types of packages : 1)Built-in packages(eg-util,lang,swing,etc)
   //                                2)User defined packages
// Some of the Built-in packages are as follows:
  /*
  1)java.util
  2)java.lang
  3)java.awt
  4)java.net
  5)java.swing
  6)java.io
  */
   // TO CREATE ANY USER DEFINED PACKAGE->
   //syntax: package package_name

   // TO IMPORT ANY USER DEFINED PACKAGE->
  //syntax: import(keyword) package_name.class_name



package pack;                                //CREATING USER DEFINED PACKAGE
public class Additon {
    private double d1,d2;
    public Additon(double a,double b){
        d1=a;
        d2=b;
    }
    public void sum(){
        System.out.println("SUM: " + (d1+d2));
    }
}
