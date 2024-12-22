package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposit  extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1,b2;
    Deposit( String pin)
    {
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel l2 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(460,180,400,35);
        l2.setForeground(Color.white);
        l1.add(l2);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l1.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l1.add(b2);


        





        this.pin = pin;
        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try{

        String amount =textField.getText();
        Date date = new Date();
        if(e.getSource()==b1)
        {
            if(textField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }
            else
            {
                Conn c = new Conn();
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','depposit','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposit Successfully");
                setVisible(false);
                new Main_Class(pin);
            }
        }
        
        else if(e.getSource()==b2)
        {
            setVisible(false);
            new Main_Class(pin);
        }
    }


    

        catch(Exception E)
        {
            E.printStackTrace();
        }

    }


    
}
