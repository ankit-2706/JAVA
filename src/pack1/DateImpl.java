package pack1;
import pack1.myDate;
import java.util.*;

public class DateImpl implements myDate {
    @Override
    public void show_date() {
        Date d=new Date();
        System.out.println(d);
    }
}
