package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;

public class Signup extends JFrame implements ActionListener {

  JRadioButton r1, r2, M1, M2, M3;
  JButton next;

  Random ran = new Random();
  long first4 = (ran.nextLong() % 9000L) + 1000L;
  String first = " " + Math.abs(first4);

  JTextField textPIN, textST, textname, textCITY, textFname, textEmail, textMS, textADD;
  JDateChooser dateChooser;

  Signup() {
    super("Application Form");
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // BANK IMAGE
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(25, 10, 100, 100);
    add(image);

    JLabel label1 = new JLabel("Applicaton Form No" + first);
    label1.setBounds(160, 20, 600, 40);
    label1.setFont(new Font("Raleway", Font.BOLD, 35));
    add(label1);

    JLabel label2 = new JLabel("Page 1");
    label2.setFont(new Font("Ralway", Font.BOLD, 22));
    label2.setBounds(330, 70, 600, 30);
    add(label2);

    JLabel label3 = new JLabel("Personal details");
    label3.setFont(new Font("Raleway", Font.BOLD, 22));
    label3.setBounds(298, 90, 600, 30);
    add(label3);

    JLabel labelName = new JLabel("Name: ");
    labelName.setFont(new Font("Ralway", Font.BOLD, 20));
    labelName.setBounds(100, 190, 100, 30);
    add(labelName);

    textname = new JTextField();
    textname.setFont(new Font("Ralway", Font.BOLD, 14));
    textname.setBounds(300, 190, 400, 30);
    add(textname);

    JLabel labelfName = new JLabel("Father's name: ");
    labelfName.setFont(new Font("Ralway", Font.BOLD, 20));
    labelfName.setBounds(100, 240, 200, 30);
    add(labelfName);

    textFname = new JTextField();
    textFname.setFont(new Font("Ralway", Font.BOLD, 14));
    textFname.setBounds(300, 240, 400, 30);
    add(textFname);

    JLabel DOB = new JLabel("DOB: ");
    DOB.setFont(new Font("Ralway", Font.BOLD, 20));
    DOB.setBounds(100, 340, 200, 30);
    add(DOB);

    dateChooser = new JDateChooser();
    dateChooser.setForeground(new Color(105, 105, 105));
    dateChooser.setBounds(300, 340, 400, 30);
    add(dateChooser);

    JLabel labelG = new JLabel("Gender");
    labelG.setFont(new Font("Ralway", Font.BOLD, 20));
    labelG.setBounds(100, 290, 200, 30);
    add(labelG);

    r1 = new JRadioButton("Male");
    r1.setFont(new Font("Raleway", Font.BOLD, 14));
    r1.setBackground(new Color(222, 255, 228));
    r1.setBounds(300, 290, 60, 30);
    add(r1);

    r2 = new JRadioButton("Female");
    r2.setFont(new Font("Raleway", Font.BOLD, 14));
    r2.setBackground(new Color(222, 255, 228));
    r2.setBounds(450, 290, 90, 30);
    add(r2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);

    JLabel labelemail = new JLabel("Email");
    labelemail.setFont(new Font("Raleway", Font.BOLD, 20));
    labelemail.setBounds(100, 390, 400, 30);
    add(labelemail);

    textEmail = new JTextField();
    textEmail.setFont(new Font("Ralway", Font.BOLD, 14));
    textEmail.setBounds(300, 390, 400, 30);
    add(textEmail);

    JLabel labelMS = new JLabel("Married status");
    labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
    labelMS.setBounds(100, 440, 200, 30);
    add(labelMS);

    M1 = new JRadioButton("Married");
    M1.setFont(new Font("Raleway", Font.BOLD, 14));
    M1.setBackground(new Color(222, 255, 228));
    M1.setBounds(300, 440, 100, 30);
    add(M1);

    M2 = new JRadioButton("Unmarried");
    M2.setFont(new Font("Raleway", Font.BOLD, 14));
    M2.setBackground(new Color(222, 255, 228));
    M2.setBounds(450, 440, 100, 30);
    add(M2);

    M3 = new JRadioButton("Others");
    M3.setFont(new Font("Raleway", Font.BOLD, 14));
    M3.setBackground(new Color(222, 255, 228));
    M3.setBounds(635, 440, 100, 30);
    add(M3);

    ButtonGroup ButnG = new ButtonGroup();
    ButnG.add(M1);
    ButnG.add(M2);
    ButnG.add(M3);

    // textMS=new JTextField();
    // textMS.setFont(new Font("Ralway",Font.BOLD,14));
    // textMS.setBounds(300,440,400,30);
    // add(textMS);

    JLabel labelADD = new JLabel("Address :");
    labelADD.setFont(new Font("Raleway", Font.BOLD, 20));
    labelADD.setBounds(100, 490, 200, 30);
    add(labelADD);

    textADD = new JTextField();
    textADD.setFont(new Font("Ralway", Font.BOLD, 14));
    textADD.setBounds(300, 490, 400, 30);
    add(textADD);

    JLabel labelCITY = new JLabel("City :");
    labelCITY.setFont(new Font("Raleway", Font.BOLD, 20));
    labelCITY.setBounds(100, 540, 200, 30);
    add(labelCITY);

    textCITY = new JTextField();
    textCITY.setFont(new Font("Ralway", Font.BOLD, 14));
    textCITY.setBounds(300, 540, 400, 30);
    add(textCITY);

    JLabel labelPin = new JLabel("Pincode :");
    labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
    labelPin.setBounds(100, 590, 200, 30);
    add(labelPin);

    textPIN = new JTextField();
    textPIN.setFont(new Font("Ralway", Font.BOLD, 14));
    textPIN.setBounds(300, 590, 400, 30);
    add(textPIN);

    JLabel labelState = new JLabel("State :");
    labelState.setFont(new Font("Raleway", Font.BOLD, 20));
    labelState.setBounds(100, 640, 200, 30);
    add(labelState);

    textST = new JTextField();
    textST.setFont(new Font("Ralway", Font.BOLD, 14));
    textST.setBounds(300, 640, 400, 30);
    add(textST);

    next = new JButton("Next");
    next.setFont(new Font("Raleway", Font.BOLD, 14));
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setBounds(620, 710, 80, 30);
    next.addActionListener(this);
    add(next);

    getContentPane().setBackground(new Color(222, 255, 228));
    setLayout(null);
    setSize(900, 950);
    setLocation(360, 40);

    JPanel panel = (JPanel) getContentPane();
    panel.setPreferredSize(new Dimension(850, 900)); // height bigger than frame
    JScrollPane scroll = new JScrollPane(panel);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    setContentPane(scroll);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) { // insert after next buton
    
    String formno=first;
    String name= textname.getText();
    String Fname=textFname.getText();
    String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(r1.isSelected()){
      gender="Male";

    }
    else if(r2.isSelected()){
      gender="Female";

    }

    String email=textEmail.getText();
    String martial=null;
    if(M1.isSelected()){
      martial="Married";
    }
    else if(M2.isSelected()){
      martial="Unmarried";
    }
    else if(M3.isSelected()){
      martial="others";
    }
    
    String address = textADD.getText();
     String city = textCITY.getText();
 String pincode = textPIN.getText();
String state=textST.getText();

try {
  if(textname.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Fill all the fields");
  }
  else{
    conn conn1=new conn();
    String q="insert into signup values('"+formno+"','"+name+"','"+Fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
     conn1.statement.executeUpdate(q);
     new Signup2(first);
     setVisible(false);
  }
  
} catch (Exception E) {
  E.printStackTrace();
}


    


    
  }

  public static void main(String[] args) {
    new Signup();
  }

}
