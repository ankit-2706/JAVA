package Online_Assignments;
import java.util.*;
interface Vehicle{
    public String getColor();
    public int getNumber();
    public double getConsumption();
}
class TwoWheeler implements Vehicle {
    String name,color;
    int number;
    double fuelcon;
    void setData( String name,String color, int number, double fuelcon){
        this.name = name;
        this.color = color;
        this.number = number;
        this.fuelcon = fuelcon;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public int getNumber() {
        return number;
    }
    @Override
    public double getConsumption() {
        return fuelcon;
    }
}
class FourWheeler implements Vehicle{
    String name,color;
    int number;
    double fuelcon;
    void setData( String name,String color, int number, double fuelcon){
        this.name = name;
        this.color = color;
        this.number = number;
        this.fuelcon = fuelcon;
    }
    public String getName() {
        return name;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public int getNumber() {
        return number;
    }
    @Override
    public double getConsumption() {
        return fuelcon;
    }
}
class Main_Veh{
    public static void main(String[] args) {

        TwoWheeler obj = new TwoWheeler();
        obj.setData("Apache","Navy Blue",2149,600.23);
        String name = obj.getName();
        String color = obj.getColor();
        int num = obj.getNumber();
        double cons = obj.getConsumption();
        System.out.println("\n Name : " +name+ "\n Color : " +color+ "\n Number : " +num+ "\n Consumption : " + cons);

        FourWheeler obj2 = new FourWheeler();
        obj2.setData("BMW","GREY",7070,8000.66);
         name = obj2.getName();
         color = obj2.getColor();
         num = obj.getNumber();
         cons = obj2.getConsumption();
        System.out.println("\n Name : " +name+ "\n Color : " +color+ "\n Number : " +num+ "\n Consumption : " + cons);
    }
}
