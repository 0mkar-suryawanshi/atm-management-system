package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener{

    String formno;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField panField,aadharField;
    JRadioButton e1,e2;
    JRadioButton r1, r2;
    JButton next;
    

    Signup2( String first)
    {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(150,5,100,100);
		add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("RaleWay",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2  = new JLabel("Additional Details");
        l2.setFont(new Font("RaleWay",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel  l3 = new JLabel("Religion : ");
        l3.setFont(new Font("RaleWay",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"}; 
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel  l4 = new JLabel("Category : ");
        l4.setFont(new Font("RaleWay",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"}; 
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel  l5 = new JLabel("Income : ");
        l5.setFont(new Font("RaleWay",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00.000","Above 10,00,000"}; 
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel  l6= new JLabel("Educational : ");
        l6.setFont(new Font("RaleWay",Font.BOLD,18));
        l6.setBounds(100,270,200,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"}; 
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel  l7= new JLabel("Occupation : ");
        l7.setFont(new Font("RaleWay",Font.BOLD,18));
        l7.setBounds(100,320,200,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employee","Business","Student","Retired","Other"}; 
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel  l8= new JLabel("PAN Number : ");
        l8.setFont(new Font("RaleWay",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        panField = new JTextField();
        panField.setBackground(new Color(252,208,76));
        panField.setFont(new Font("Raleway",Font.BOLD,14));
        panField.setBounds(350,370,320,30);
        add(panField);

        JLabel  l9= new JLabel("Aadhar Number : ");
        l9.setFont(new Font("RaleWay",Font.BOLD,18));
        l9.setBounds(100,420,200,30);
        add(l9);

        aadharField = new JTextField();
        aadharField.setBackground(new Color(252,208,76));
        aadharField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharField.setBounds(350,420,320,30);
        add(aadharField);

        JLabel  l10= new JLabel("Senior Citizen: ");
        l10.setFont(new Font("RaleWay",Font.BOLD,18));
        l10.setBounds(100,470,200,30);
        add(l10);

        r2 = new JRadioButton("NO");
        r2.setBackground(new Color(252,208,76));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(420,470,320,30);
        add(r2);

        r1 = new JRadioButton("YES");
        r1.setBackground(new Color(252,208,76));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(350,470,320,30);
        add(r1);


        JLabel  l11= new JLabel("Existing Account: ");
        l11.setFont(new Font("RaleWay",Font.BOLD,18));
        l11.setBounds(100,520,200,30);
        add(l11);

        e1 = new JRadioButton("NO");
        e1.setBackground(new Color(252,208,76));
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBounds(420,520,320,30);
        add(e1);

        e2 = new JRadioButton("YES");
        e2.setBackground(new Color(252,208,76));
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBounds(350,520,320,30);
        add(e2);

        JLabel  l12= new JLabel("Form No: ");
        l12.setFont(new Font("RaleWay",Font.BOLD,18));
        l12.setBounds(700,10,150,30);
        add(l12);

        JLabel  l13= new JLabel(formno);
        l13.setFont(new Font("RaleWay",Font.BOLD,18));
        l13.setBounds(700,100,150,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);






        


        













        



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));;
        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup2("");


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String)comboBox.getSelectedItem();
        String cat = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = panField.getText();
        String aadhar = aadharField.getText();

        String citizen = " ";
        if(r1.isSelected())
        {
            citizen ="Yes";
        }
        else if(r2.isSelected())
        { 
            citizen = "No";
        }
        String eAccount = " ";
        if((r1.isSelected()))
        {
            eAccount = "Yes";
        }
        else if(r2.isSelected()){
            eAccount = "No";
        }

        try {

        if(panField.getText().equals(" ") ||aadharField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Fill all the Fields");
            }
            else{
                Conn c1 = new Conn();
                String q = "insert into signup_two values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+citizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
            
            
        } catch (Exception E) {
            E.printStackTrace();
        }


        
    }
    
}
