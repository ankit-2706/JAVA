package GUI;

import javax.swing.*;//->includes all clasess of swing pack.
import javax.swing.JOptionPane;
//or
//import java.util.*;
// '*'- includes all classes of util package

public class Message_box {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, " HELLO " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(" Enter your age "));
        JOptionPane.showMessageDialog(null, " You are " + age + " years old ");

        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "Congratulations,you can vote");
        }
        else{
            JOptionPane.showMessageDialog(null, "OOPs! You cannot vote");
        }

    }
    
}
