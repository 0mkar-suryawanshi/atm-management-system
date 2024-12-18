package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;

public class Signup3 extends JFrame {
    Signup3()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);

        setVisible(true);


    }
    public static void main(String[] args) {
        
        new Signup3();
    }
    
}
