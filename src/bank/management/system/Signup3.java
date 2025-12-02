package bank.management.system;

import javax.swing.*;

 import java.awt.*;
import java.awt.event.ActionEvent;
// import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;
 Signup3(String formno){
    this.formno=formno;

     JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(800, 1000));
        panel.setBackground(new Color(215,252,252));

      

        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 850, 900);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scroll);

  
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // BANK IMAGE BACKGROUND
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150, 5, 100, 100);
    add(image);
    panel.add(image);


    JLabel l1=new JLabel("Page 3"); // PAGE 3
    l1.setFont(new Font("Raleway",Font.BOLD,22));
    l1.setBounds(280,40,400,40);
    add(l1);
    panel.add(l1);

     JLabel l2=new JLabel("Account Details");  // ACCOUNT DEATILS
    l2.setFont(new Font("Raleway",Font.BOLD,22));
    l2.setBounds(280,70,400,40);
    add(l2);
    panel.add(l2);


     JLabel l3=new JLabel("Account Type");  // ACCOUNT DEATILS
    l3.setFont(new Font("Raleway",Font.BOLD,18));
    l3.setBounds(100,140,200,30);
    add(l3);
    panel.add(l3);


    r1=new JRadioButton("Saving Account");
     r1.setFont(new Font("Raleway",Font.BOLD,16));
    r1.setBounds(100,180,150,30);
    r1.setBackground(new Color(215,252,252));
    add(r1);
    panel.add(r1);


     r2=new JRadioButton("Fixed Deposit Acoount");
     r2.setFont(new Font("Raleway",Font.BOLD,16));
    r2.setBounds(350,180,300,30);
    r2.setBackground(new Color(215,252,252));
    add(r2);
    panel.add(r2);


     r3=new JRadioButton("Current Account");
     r3.setFont(new Font("Raleway",Font.BOLD,16));
    r3.setBounds(100,220,250,30);
    r3.setBackground(new Color(215,252,252));
    add(r3);
    panel.add(r3);

    r4=new JRadioButton("Recurring Deposit Account");
     r4.setFont(new Font("Raleway",Font.BOLD,16));
    r4.setBounds(350,220,250,30);
    r4.setBackground(new Color(215,252,252));
    add(r4);
    panel.add(r4);

    ButtonGroup buttonGroup=new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);
    buttonGroup.add(r3);
    buttonGroup.add(r4);

   


    JLabel l4=new JLabel("Card No");  // CARD NO
    l4.setFont(new Font("Raleway",Font.BOLD,18));
    l4.setBounds(100,300,200,30);
    add(l4);
     panel.add(l4);

    JLabel l5=new JLabel("16 Card Digit no");  // 16 DIGIT
    l5.setFont(new Font("Raleway",Font.BOLD,18));
    l5.setBounds(100,330,200,20);
    add(l5);
     panel.add(l5);

    JLabel l6=new JLabel("XXXX-XXXX-XXXX-1111");  // 
    l6.setFont(new Font("Raleway",Font.BOLD,18));
    l6.setBounds(330,300,250,30);
    add(l6);
     panel.add(l6);

    JLabel l7=new JLabel("(It would appear on ATM card)");  // Text as written
    l7.setFont(new Font("Raleway",Font.BOLD,18));
    l7.setBounds(330,330,500,20);
    add(l7);
     panel.add(l7);

JLabel l8=new JLabel("PIN");  // PIN wriiten
    l8.setFont(new Font("Raleway",Font.BOLD,18));
    l8.setBounds(100,370,200,30);
    add(l8);
     panel.add(l8);

    JLabel l9=new JLabel("XXXX");  // PIN Hiddien
    l9.setFont(new Font("Raleway",Font.BOLD,18));
    l9.setBounds(330,370,200,30);
    add(l9);
     panel.add(l9);

    JLabel l10=new JLabel("(4-Digit Password)");  // 4 digit password
    l10.setFont(new Font("Raleway",Font.BOLD,12));
    l10.setBounds(100,400,200,20);
    add(l10);
     panel.add(l10);

     JLabel l11=new JLabel("Service Required");  // 4 digit password
    l11.setFont(new Font("Raleway",Font.BOLD,12));
    l11.setBounds(100,450,200,30);
    add(l11);
     panel.add(l11);


    c1=new JCheckBox("ATM Card");
    c1.setBackground(new Color(215,252,252));
    c1.setFont(new Font("Raleway",Font.BOLD,16));
    c1.setBounds(100,500,200,30);
    add(c1);
     panel.add(c1);

    c2=new JCheckBox("Internet Banking");
    c2.setBackground(new Color(215,252,252));
    c2.setFont(new Font("Raleway",Font.BOLD,16));
    c2.setBounds(350,500,200,30);
    add(c2);
     panel.add(c2);

    c3=new JCheckBox("Mobile Banking");
    c3.setBackground(new Color(215,252,252));
    c3.setFont(new Font("Raleway",Font.BOLD,16));
    c3.setBounds(100,550,200,30);
    add(c3);
     panel.add(c3);

c4=new JCheckBox("Cheque Book");
    c4.setBackground(new Color(215,252,252));
    c4.setFont(new Font("Raleway",Font.BOLD,16));
    c4.setBounds(350,550,200,30);
    add(c4);
     panel.add(c4);


    JCheckBox c5=new JCheckBox("I here by declare that all information is correct",true);
      c5.setBackground(new Color(215,252,252));
    c5.setFont(new Font("Raleway",Font.BOLD,12));
    c5.setBounds(100,600,600,20);
    add(c5);
     panel.add(c5);

    JLabel l12 =new JLabel("Form no:");
    l12.setBounds(700,10,100,30);
    l12.setFont(new Font("Raleway",Font.BOLD,14));
    add(l12);
     panel.add(l12);

    JLabel l13 =new JLabel();
    l13.setBounds(760,10,60,30);
    l13.setFont(new Font("Raleway",Font.BOLD,14));
    
    add(l13);
     panel.add(l13);

    s=new JButton("Submit");
    s.setFont(new Font("Raleway",Font.BOLD,14));
    s.setBackground(Color.WHITE);
    s.setForeground(Color.BLACK);
    s.setBounds(250,650,100,30);
    s.addActionListener(this);
    add(s);
     panel.add(s);

    c=new JButton("Cancel");
    c.setFont(new Font("Raleway",Font.BOLD,14));
    c.setBackground(Color.WHITE);
    c.setForeground(Color.BLACK);
    c.setBounds(420,650,100,30);
    c.addActionListener(this);
    add(c);
     panel.add(c);


    getContentPane().setBackground(new Color(215,252,252));
    setSize(850,900);
    setLayout(null);
    setLocation(400,20);
    setVisible(true);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
     String Atype=" ";
     if(r1.isSelected()){
        Atype="Saving Account";
     } else if(r2.isSelected()){
        Atype="Fixed Deposit Acoount";
     }else if(r3.isSelected()){
       Atype="Current Account";
     }else if(r4.isSelected()){
      Atype="Recurring Deposit Account";
     }
   Random ran=new Random();
   long firstseven=(ran.nextLong()%90000000L)+1409963000000000L;
   String cardno=""+Math.abs(firstseven);

   long first3=(ran.nextLong() % 9000L)+1000L;
   String pin="" +Math.abs(first3);

   String fac = "";
   if(c1.isSelected()){
     fac +="ATM Card";
   }else if(c2.isSelected()){
     fac +="Internet Banking";
   }else if(c3.isSelected()){
    fac += "Mobile Banking";
   }
   else if(c4.isSelected()){
    fac +=  "Cheque Book";
   }

  try {
    if(e.getSource()==s){
        if(Atype.equals("")){
            JOptionPane.showMessageDialog(null, "Fill All the Fields");
        }
        else{
             conn c1=new conn();
             String q1= "insert into signupthree values('"+formno+"','"+Atype+"','"+cardno+"','"+pin+"','"+fac+"')";
             String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
             c1.statement.executeUpdate(q1);
              c1.statement.executeUpdate(q2);
              JOptionPane.showMessageDialog(null, "Card Number :"+cardno+"\n Pin :  "+pin );
              setVisible(false);
        }

    }
    else if(e.getSource()==c){
     System.exit(0);
    }
    
  } catch (Exception E) {
    // TODO: handle exception
    E.printStackTrace();
  }


     
 }
    public static void main(String [] Args){

  new Signup3(" ");
    }
}



/// CHAT GPT CODE START HERE  @@@@@@@@@@@@@@@

// package bank.management.system;

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class Signup3 extends JFrame implements ActionListener {

//     JRadioButton r1, r2, r3, r4;
//     JCheckBox c1, c2, c3, c4, c5;
//     JButton s, c;
//     String formno;

//     public Signup3( String formno) {
//         this.formno=formno;

//         // Main panel inside scrollpane
//         JPanel panel = new JPanel();
//         panel.setLayout(null);
//         panel.setPreferredSize(new Dimension(800, 1000));
//         panel.setBackground(new Color(215, 252, 252));

//         JScrollPane scroll = new JScrollPane(panel);
//         scroll.setBounds(0, 0, 850, 900);
//         scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//         add(scroll);

//         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//         JLabel image = new JLabel(new ImageIcon(i2));
//         image.setBounds(150, 5, 100, 100);
//         panel.add(image);

//         JLabel l1 = new JLabel("Page 3");
//         l1.setFont(new Font("Raleway", Font.BOLD, 22));
//         l1.setBounds(280, 40, 400, 40);
//         panel.add(l1);

//         JLabel l2 = new JLabel("Account Details");
//         l2.setFont(new Font("Raleway", Font.BOLD, 22));
//         l2.setBounds(280, 70, 400, 40);
//         panel.add(l2);

//         JLabel l3 = new JLabel("Account Type");
//         l3.setFont(new Font("Raleway", Font.BOLD, 18));
//         l3.setBounds(100, 140, 200, 30);
//         panel.add(l3);

//         r1 = new JRadioButton("Saving Account");
//         r1.setFont(new Font("Raleway", Font.BOLD, 16));
//         r1.setBounds(100, 180, 200, 30);
//         r1.setBackground(new Color(215, 252, 252));
//         panel.add(r1);

//         r2 = new JRadioButton("Fixed Deposit Account");
//         r2.setFont(new Font("Raleway", Font.BOLD, 16));
//         r2.setBounds(350, 180, 250, 30);
//         r2.setBackground(new Color(215, 252, 252));
//         panel.add(r2);

//         r3 = new JRadioButton("Current Account");
//         r3.setFont(new Font("Raleway", Font.BOLD, 16));
//         r3.setBounds(100, 220, 200, 30);
//         r3.setBackground(new Color(215, 252, 252));
//         panel.add(r3);

//         r4 = new JRadioButton("Recurring Deposit Account");
//         r4.setFont(new Font("Raleway", Font.BOLD, 16));
//         r4.setBounds(350, 220, 280, 30);
//         r4.setBackground(new Color(215, 252, 252));
//         panel.add(r4);

//         ButtonGroup bg = new ButtonGroup();
//         bg.add(r1); bg.add(r2); bg.add(r3); bg.add(r4);

//         JLabel l4 = new JLabel("Card No:");
//         l4.setFont(new Font("Raleway", Font.BOLD, 18));
//         l4.setBounds(100, 300, 200, 30);
//         panel.add(l4);

//         JLabel l5 = new JLabel("16 Digit Card Number");
//         l5.setFont(new Font("Raleway", Font.BOLD, 14));
//         l5.setBounds(100, 330, 200, 20);
//         panel.add(l5);

//         JLabel l6 = new JLabel("XXXX-XXXX-XXXX-1111");
//         l6.setFont(new Font("Raleway", Font.BOLD, 18));
//         l6.setBounds(330, 300, 300, 30);
//         panel.add(l6);

//         JLabel l7 = new JLabel("(Will appear on ATM card)");
//         l7.setFont(new Font("Raleway", Font.PLAIN, 14));
//         l7.setBounds(330, 330, 300, 20);
//         panel.add(l7);

//         JLabel l8 = new JLabel("PIN:");
//         l8.setFont(new Font("Raleway", Font.BOLD, 18));
//         l8.setBounds(100, 370, 200, 30);
//         panel.add(l8);

//         JLabel l9 = new JLabel("XXXX");
//         l9.setFont(new Font("Raleway", Font.BOLD, 18));
//         l9.setBounds(330, 370, 200, 30);
//         panel.add(l9);

//         JLabel l10 = new JLabel("(4-Digit Password)");
//         l10.setFont(new Font("Raleway", Font.PLAIN, 14));
//         l10.setBounds(100, 400, 200, 20);
//         panel.add(l10);

//         JLabel l11 = new JLabel("Services Required");
//         l11.setFont(new Font("Raleway", Font.BOLD, 18));
//         l11.setBounds(100, 450, 200, 30);
//         panel.add(l11);

//         c1 = new JCheckBox("ATM Card");
//         c1.setBounds(100, 500, 200, 30);
//         c1.setBackground(new Color(215, 252, 252));
//         panel.add(c1);

//         c2 = new JCheckBox("Internet Banking");
//         c2.setBounds(350, 500, 200, 30);
//         c2.setBackground(new Color(215, 252, 252));
//         panel.add(c2);

//         c3 = new JCheckBox("Mobile Banking");
//         c3.setBounds(100, 550, 200, 30);
//         c3.setBackground(new Color(215, 252, 252));
//         panel.add(c3);

//         c4 = new JCheckBox("Cheque Book");
//         c4.setBounds(350, 550, 200, 30);
//         c4.setBackground(new Color(215, 252, 252));
//         panel.add(c4);

//         c5 = new JCheckBox("I hereby declare that all information is correct");
//         c5.setBounds(100, 600, 500, 20);
//         c5.setBackground(new Color(215, 252, 252));
//         c5.setSelected(true);
//         panel.add(c5);

//         s = new JButton("Submit");
//         s.setBounds(250, 650, 100, 30);
//         s.addActionListener(this);
//         panel.add(s);

//         c = new JButton("Cancel");
//         c.setBounds(420, 650, 100, 30);
//         c.addActionListener(this);
//         panel.add(c);

//         setSize(850, 900);
//         setLocation(400, 20);
//         setTitle("Account Signup Page 3");
//         setLayout(null);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         // Your logic here
       
//     }

//     public static void main(String[] args) {
//         new Signup3(" ");
//     }
// }

