package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;

    JTextField textField2;
    JPasswordField passwordField3;
    JButton Butn1, Butn2, Butn3;

    Login() {
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // BANK IMAGE
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png")); // CARD IN HAND
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM"); // WELCOME TO ATM TEXT
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card  No: "); // CARD NO TEXT
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField2 = new JTextField(15); // CARD NO TEXT FIELD
        textField2.setBounds(325, 190, 250, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("Enter Pin: "); // ENTER PIN TEXT
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField3 = new JPasswordField(15); // PIN TEXT FIELD
        passwordField3.setBounds(325, 250, 250, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        Butn1 = new JButton("SIGN IN"); // SIGN IN
        Butn1.setFont((new Font("Arial", Font.BOLD, 14)));
        Butn1.setForeground(Color.WHITE);
        Butn1.setBackground(Color.BLACK);
        Butn1.setBounds(300, 300, 100, 30);
        Butn1.addActionListener(this);
        add(Butn1);

        Butn2 = new JButton("CLEAR");
        Butn2.setFont(new Font("Arial", Font.BOLD, 14));
        Butn2.setForeground(Color.WHITE);
        Butn2.setBackground(Color.BLACK);
        Butn2.setBounds(430, 300, 100, 30);
        Butn2.addActionListener(this);
        add(Butn2);

        Butn3 = new JButton("SIGN IN");
        Butn3.setFont(new Font("Arial", Font.BOLD, 14));
        Butn3.setForeground(Color.WHITE);
        Butn3.setBackground(Color.BLACK);
        Butn3.setBounds(300, 350, 230, 30);
        Butn3.addActionListener(this);
        add(Butn3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png")); // BACKGROUNG IMAGE
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(300, 100);
       // setUndecorated(true); // close button and full size option right top invisible
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Butn1) {
               conn c=new conn(); // SQL connection
               String cardno= textField2.getText();
               String pin=  passwordField3.getText();
               String q="select *from login where card_no = '"+cardno+"' and pin ='"+pin+"'";
               ResultSet resultset = c.statement.executeQuery(q);
               if(resultset.next()){
                setVisible(false);
                new main_Class(pin);
               }
               else{
                JOptionPane.showMessageDialog(null, "Enter Valid Details");
               }

            } else if (e.getSource() == Butn2) {
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource() == Butn3) {
                new Signup();
                setVisible(false);
            }

        } catch (Exception E) {
            // TODO: handle exception
            E.printStackTrace();
        }

    }

    public static void main(String[] Args) {
        new Login();
    }

}
