package Online_Assignments;

 interface Payable{
     double getAmount();
}
 class Employee implements Payable {
     String first_name;
     String last_name;
     double salary;
     void setData( String fn,String ln,double sal){
         first_name = fn;
         last_name = ln;
         salary = sal;
     }
     @Override
     public double getAmount() {
         return salary;
     }
     void show(){
         System.out.println("Name : " +first_name+" "+last_name);
     }
 }
 class Main{
     public static void main(String[] args) {
         Employee obj = new Employee();
         obj.setData("Ankit","Chouhan", 123456.234);
         double salary = obj.getAmount();
         obj.show();
         System.out.println("Salary: " + salary);
     }
 }
