package swing_project1;

import javax.swing.JFrame;
import java.awt.*;

public class IlkFrame {

    public static void main(String[] args) {

        JFrame ilkFrame = new JFrame();
        ilkFrame.setSize(400,400);
        ilkFrame.setTitle("Bu Pencere");
        ilkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ilkFrame.getContentPane().setBackground(Color.GREEN);

        ilkFrame.setVisible(true);

    }

}
