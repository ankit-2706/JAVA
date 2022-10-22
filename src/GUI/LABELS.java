package GUI;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class LABELS {
    public static void main(String[] args) {
         //Jlabel = a GUI display area for a string of text, an image,or both.

        ImageIcon image = new ImageIcon("ankit.png");
        //Create frames
        JFrame frame = new JFrame();
        //setting frame settings
        frame.setSize( 500,500);
        frame.setTitle("ANKIT CHOUHAN");
        frame.setResizable( false );
        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // Creating labels
        JLabel label = new JLabel();
        label.setText("Hey Bro,Want to become a java developer!!");
//       label.setIcon( new ImageIcon("D:\\java codes\\java_codes\\src\\GUI\\ankit.jpg"));

        //add label to frame
        frame.add(label);

    }
}
