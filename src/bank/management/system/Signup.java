package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class Signup  extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,m1,m2;
    JButton next;


    JTextField textName, FName1, emailField, addresslField, cityField, pincodeField, stateField;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong()% 9000l) +1000l;
    String first = " "+Math.abs(first4);


    Signup()
    {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Relway",Font.BOLD,20));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Relway",Font.BOLD,22));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Relway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel FName = new JLabel("Father Name : ");
        FName.setFont(new Font("Relway",Font.BOLD,22));
        FName.setBounds(100,240,200,30);
        add(FName);

        FName1 = new JTextField();
        FName1.setFont(new Font("Relway",Font.BOLD,14));
        FName1.setBounds(300,240,400,30);
        add(FName1);

        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Relway",Font.BOLD,22));
        dob.setBounds(100,340,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Relway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,290,90,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,390,200,30);
        add(email);

        emailField = new JTextField();
        emailField.setFont(new Font("Relway",Font.BOLD,14));
        emailField.setBounds(300,390,400,30);
        add(emailField);

        JLabel labelMs = new JLabel("Marital Status : ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("RelWay",Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("RelWay",Font.BOLD,14));
        add(m2);

        ButtonGroup buttonGroup2  = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);

        

        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        addresslField = new JTextField();
        addresslField.setFont(new Font("Relway",Font.BOLD,14));
        addresslField.setBounds(300,490,400,30);
        add(addresslField);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        cityField = new JTextField();
        cityField.setFont(new Font("Relway",Font.BOLD,14));
        cityField.setBounds(300,540,400,30);
        add(cityField);

        JLabel pincode = new JLabel("PIN CODE : ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeField = new JTextField();
        pincodeField.setFont(new Font("Relway",Font.BOLD,14));
        pincodeField.setBounds(300,590,400,30);
        add(pincodeField);

        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,640,200,30);
        add(state);

        stateField = new JTextField();
        stateField.setFont(new Font("Relway",Font.BOLD,14));
        stateField.setBounds(300,640,400,30);
        add(stateField);

        next = new JButton("Next");
        next.setFont(new Font("Relway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);
        

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String  name = textName.getText();
        String fname = FName1.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "Female";
        }
        else if(r3.isSelected())
        {
            gender = "Others";
        }

        String email = emailField.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "Married";
        }
        else if(m2.isSelected())
        {
            marital = "Unmarried";
        }

        String address = addresslField.getText();
        String city = cityField.getText();
        String pincode = pincodeField.getText();
        String state = stateField.getText();

        try {
            if(textName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the field" );
            }
            else{
                Conn con1 = new Conn();
                
                String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(query);
                new Signup2(formno);
                setVisible(false);
            }
            
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    
}
