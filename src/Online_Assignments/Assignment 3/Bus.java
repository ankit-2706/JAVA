package Online_Assignments;
import java.util.*;
interface Fare{
    int getAmount();
}
class Bus implements Fare {
    int fare;
    int food;
    int sleep;
    void setData(int fa,int fo,int sl){
        fare = fa;
        food = fo;
        sleep = sl;
    }
    @Override
    public int getAmount() {
        return (fare+food+sleep);
    }
}
class Train implements Fare{
    int fare;
    int food;
    int sleep;
    void setData(int fa,int fo,int sl){
        fare = fa;
        food = fo;
        sleep = sl;
    }
    @Override
    public int getAmount() {
        return (fare+food+sleep);
    }
}
class FareInterface{
    public static void main(String[] args) {
        Bus obj = new Bus();
        obj.setData(700,200,350);
        int Amount = obj.getAmount();
        System.out.println("\n Total Amount(BUS): " + Amount);

        Train T = new Train();
        T.setData(1000,200,500);
        Amount = T.getAmount();
        System.out.println("\n Total Amount(TRAIN): " + Amount);
    }
}
