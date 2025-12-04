package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.swing.ImageIcon;
// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
import javax.swing.*;

public class Signup2 extends JFrame  implements ActionListener{
   String formno;
   JComboBox combobox ,combobox2,combobox3,combobox4,combobox5;
   JTextField Pantext,Adhartext;
   JRadioButton r1,r2,e1,e2;
   JButton next;

 Signup2(String formno){

   super("Application FORM");

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png")); // BANK IMAGE
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150, 5, 100, 100);
    add(image);

    this.formno=formno;

    JLabel l1=new JLabel("Page 2 :-");  // PAGE 2 WRIITEN
    l1.setFont(new Font("Ralway",Font.BOLD,22));
    l1.setBounds(300,30,600,40);
    add(l1);

    JLabel l2=new JLabel("Additional dettails"); // ADDITIONAL DEATILS
    l2.setFont(new Font("Ralway",Font.BOLD,22));
    l2.setBounds(300,60,600,40);
    add(l2);



    JLabel l3=new JLabel("Religion"); // RELIGION
    l3.setFont(new Font("Ralway",Font.BOLD,18));
    l3.setBounds(100,120,100,30);
    add(l3);
   
    String religion[]={"Hindu","Muslim","Christian", // RELIGION ENTRYS
    "sikh","othsers"
    };
    combobox=new JComboBox(religion);
    combobox.setBackground(new Color(252,208,76));
    combobox.setFont(new Font("Ralway",Font.BOLD,14));
    combobox.setBounds(350,120,320,30);
    add(combobox);



     JLabel l4=new JLabel("Category : "); // CATEGORY
    l4.setFont(new Font("Ralway",Font.BOLD,18));
    l4.setBounds(100,170,100,30);
    add(l4);


    String Category[]={"Generel","OBC","SC",  // CATEGORY 
    "othsers"};
    combobox2=new JComboBox(Category);
    combobox2.setBackground(new Color(252,208,76));
    combobox2.setFont(new Font("Ralway",Font.BOLD,14));
    combobox2.setBounds(350,170,320,30);
    add(combobox2);




     JLabel l5=new JLabel("Income : "); // Income
    l5.setFont(new Font("Ralway",Font.BOLD,18));
    l5.setBounds(100,220,100,30);
    add(l5);


    String Income[]={"Null","<15,000","<2,50,000",  // Income
    "5,00,000","upto 10,00,000","Above 10,00,000"};
    combobox3=new JComboBox(Income);
    combobox3.setBackground(new Color(252,208,76));
    combobox3.setFont(new Font("Ralway",Font.BOLD,14));
    combobox3.setBounds(350,220,320,30);
    add(combobox3);





     JLabel l6=new JLabel("Education: "); // Education
    l6.setFont(new Font("Ralway",Font.BOLD,18));
    l6.setBounds(100,270,150,30);
    add(l6);


    String Education[]={"Non-Graduate","Graudate","Post Graduation",  // Education
    "Doctorate","Others"};
    combobox4=new JComboBox(Education);
    combobox4.setBackground(new Color(252,208,76));
    combobox4.setFont(new Font("Ralway",Font.BOLD,14));
    combobox4.setBounds(350,270,320,30);
    add(combobox4);



    JLabel l7=new JLabel("Occuption : "); // Occupation
    l7.setFont(new Font("Ralway",Font.BOLD,18));
    l7.setBounds(100,320,150,30);
    add(l7);


    String Occuption[]={"Goverment Servant","Businessman","Student","Retired","Self-Employed"  // Occuption ENTRY
    ,"Others"};
    combobox5=new JComboBox(Occuption);
    combobox5.setBackground(new Color(252,208,76));
    combobox5.setFont(new Font("Ralway",Font.BOLD,14));
    combobox5.setBounds(350,320,320,30);
    add(combobox5);




    JLabel l8=new JLabel("Pan No : "); // PanNO
    l8.setFont(new Font("Ralway",Font.BOLD,18));
    l8.setBounds(100,370,150,30);
    add(l8);

    Pantext =new JTextField("");
   // Pantext.setBackground(new Color(252,208,76));
    Pantext.setFont(new Font("Ralway",Font.BOLD,18));
    Pantext.setBounds(350,370,320,30);
    add(Pantext);
    




    JLabel l9=new JLabel("Adhar No : "); // adhar NO
    l9.setFont(new Font("Ralway",Font.BOLD,18));
    l9.setBounds(100,420,150,30);
    add(l9);

     Adhartext =new JTextField("");   // ADHAR ENTRY
   // Adhartext.setBackground(new Color(252,208,76));
    Adhartext.setFont(new Font("Ralway",Font.BOLD,18));
    Adhartext.setBounds(350,420,320,30);
    add(Adhartext);


    JLabel l10=new JLabel("Senior Citizen "); // SENIOR CITIZEN
    l10.setFont(new Font("Ralway",Font.BOLD,18));
    l10.setBounds(100,490,180,30);
    add(l10);

    r1=new JRadioButton("Yes");  // YES BUTTON  SENIOR CITIZEN
    r1.setFont(new Font("Raleway",Font.BOLD,14));
    r1.setBackground(new Color(252,208,76));
    r1.setBounds(350,490,100,30);
    add(r1);
    
     r2=new JRadioButton("No"); //NO BUTTON SENIOR CITIZEN
    r2.setFont(new Font("Raleway",Font.BOLD,14));
    r2.setBackground(new Color(252,208,76));
    r2.setBounds(460,490,100,30);
    add(r2);


    JLabel l11=new JLabel("Existing Account "); // Existing account
    l11.setFont(new Font("Ralway",Font.BOLD,18));
    l11.setBounds(100,540,180,30);
    add(l11);

    e1=new JRadioButton("Yes"); // Existing account YES
    e1.setFont(new Font("Raleway",Font.BOLD,14));
    e1.setBackground(new Color(252,208,76));
    e1.setBounds(350,540,100,30);
    add(e1);
    
     e2=new JRadioButton("No"); // Existing account NO
    e2.setFont(new Font("Raleway",Font.BOLD,14));
    e2.setBackground(new Color(252,208,76));
    e2.setBounds(460,540,100,30);
    add(e2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(r1);
     buttonGroup.add(r2);

     ButtonGroup buttonGroup1 = new ButtonGroup();
     buttonGroup1.add(e1);
     buttonGroup1.add(e2);

     JLabel l12=new JLabel("Form No: "); // form NO
    l12.setFont(new Font("Ralway",Font.BOLD,14));
    l12.setBounds(700,10,100,30);
    add(l12);

  
 JLabel l13=new JLabel(formno); 
    l13.setFont(new Font("Ralway",Font.BOLD,14));
    l13.setBounds(760,10,60,30);
    add(l13);

    next=new JButton("Next");
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBackground(Color.WHITE);
    next.setForeground(Color.BLACK);
    next.setBounds(570,550,90,30);
    next.addActionListener(this);
    add(next);

   setLayout(null);
    setSize(850,750);
    setLocation(450,80);
    getContentPane().setBackground(new Color(252,208,76));
    setVisible(true);
 }
 @Override
 public void actionPerformed(ActionEvent e) {
     // TODO Auto-generated method stub
     String  rel=(String) combobox.getSelectedItem();
     String cate=(String) combobox2.getSelectedItem();
     String inc=(String) combobox3.getSelectedItem();
     String edu=(String) combobox4.getSelectedItem();
     String occu=(String)combobox5.getSelectedItem();

     String pan= Pantext.getText();
     String Adhar=Adhartext.getText();

     String sCitizen=" ";
     if(r1.isSelected()){
      sCitizen="Yes";
     }else if(r2.isSelected()){
      sCitizen="NO";
     }

     String eAccount=" ";
     if(e1.isSelected()){
      eAccount ="Yes";
     }else if(e2.isSelected()){
      eAccount="NO";
     }

     try {
      if(Pantext.getText().equals("") || Adhartext.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Fill All the Fields" );
      }
      else{
        conn c1=new conn();
        String q="insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occu+"','"+pan+"','"+Adhar+"','"+sCitizen+"','"+eAccount+"')";
        c1.statement.executeUpdate(q);
        new Signup3(formno);
        setVisible(false);

      }
      
     } catch (Exception E) {
      E.printStackTrace();
     }
     
     
 }
    public static void main(String[]args){
  new Signup2("");
    }

}
