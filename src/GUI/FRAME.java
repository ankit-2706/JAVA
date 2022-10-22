package GUI;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class FRAME {

    public static void main(String[] args) {
//
        //Jframe -> a GUI window to add components to

        JFrame frame = new JFrame();  //creates a frame
        //setting frame settings
        frame.setSize( 620,620); //sets x dimensions and y dimensions of the frame
        frame.setTitle("All about java codes"); //sets title of frame
        frame.setResizable( false ); // prevent frame from getting reside.
        frame.setVisible(true);

        ImageIcon image = new ImageIcon(" C:\\Users\\ASUS\\OneDrive\\Pictures\\Ankit"); //creates an ImageIcon
        frame.setIconImage(image.getImage());   //set ImageIcon
        frame.getContentPane().setBackground(Color.white); // change colour of the backgroud
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.getContentPane().setBackground(new colour( hexadecimal of any colour or RGB ); // change colour of the backgroud

//
//        other way to create frame->
//        by creating  other derived class Myframe from base class JFrame.
        // there just make constructor,and inside copy this content from settings
//        Myframe myframe = new Myframe();
//        or
//                new Myframe();
    }

}
