package bank_management_system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup {
    private JFrame frame;
    private JLabel applicationFormNo,page1,personalDetails,name,fName,dob,gender,email,mstatus,address,city,pincode,state;
    private JTextField nameText,fNameText,emailText,addressText,cityText,pincodeText,stateText;
    private Random random=new Random();
    private long first =(random.nextLong()%9000L)+1000L;
    private String first1=" "+Math.abs(first);
    private JDateChooser dateChooser;
    private JRadioButton r1,r2,r3,m1,m2,m3;
    private JButton next,back;

    Signup(){
      frame=new JFrame("APPLICATION FORM 1");
      frame.setSize(850,770);
      frame.setLocation(360,40);
      frame.setUndecorated(true);
      frame.setLayout(null);
      frame.getContentPane().setBackground(new Color(222,255,228));

      ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
      Image Img=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
      ImageIcon img2=new ImageIcon(Img);
      JLabel imgLabel=new JLabel(img2);
      imgLabel.setBounds(25,10,100,100);
      frame.add(imgLabel);

      applicationFormNo=new JLabel("APPLICATION FORM NO."+first1);
      applicationFormNo.setBounds(160,20,600,40);
      applicationFormNo.setFont(new Font("Raleway",Font.BOLD,38));
      frame.add(applicationFormNo);

      page1=new JLabel("Page 1:-");
      page1.setFont(new Font("Raleway",Font.BOLD,22));
      page1.setBounds(330,70,600,30);
      frame.add(page1);

      personalDetails=new JLabel("Personal Details");
      personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
      personalDetails.setBounds(290,90,600,30);
      frame.add(personalDetails);

      name=new JLabel("Name :");
      name.setFont(new Font("Raleway",Font.BOLD,20));
      name.setBounds(100,190,100,30);
      frame.add(name);
      nameText=new JTextField();
      nameText.setFont(new Font("Raleway",Font.BOLD,14));
      nameText.setBounds(300,190,400,30);
      frame.add(nameText);

      fName=new JLabel("Father's Name : ");
      fName.setFont(new Font("Raleway",Font.BOLD,20));
      fName.setBounds(100,240,200,30);
      frame.add(fName);
      fNameText=new JTextField();
      fNameText.setBounds(300,240,400,30);
      fNameText.setFont(new Font("Raleway",Font.BOLD,14));
      frame.add(fNameText);

      dob=new JLabel("DOB : ");
      dob.setBounds(100,290,200,30);
      dob.setFont(new Font("Raleway",Font.BOLD,20));
      frame.add(dob);
      dateChooser=new JDateChooser();
      dateChooser.setForeground(new Color(105,105,105));
      dateChooser.setBounds(300,290,400,30);
      frame.add(dateChooser);

      gender=new JLabel("Gender : ");
      gender.setFont(new Font("Raleway",Font.BOLD,20));
      gender.setBounds(100,340,200,30);
      frame.add(gender);
      r1=new JRadioButton("Male");
      r1.setFont(new Font("Raleway",Font.BOLD,14));
      r1.setBackground(new Color(222,255,228));
      r1.setBounds(300,340,100,30);
      frame.add(r1);
      r2=new JRadioButton("Female");
      r2.setFont(new Font("Raleway",Font.BOLD,14));
      r2.setBackground(new Color(222,255,228));
      r2.setBounds(450,340,100,30);
      frame.add(r2);
      r3=new JRadioButton("Other");
      r3.setFont(new Font("Raleway",Font.BOLD,14));
      r3.setBackground(new Color(222,255,228));
      r3.setBounds(600,340,100,30);
      frame.add(r3);
      ButtonGroup group=new ButtonGroup();
      group.add(r1);
      group.add(r2);
      group.add(r3);

      email=new JLabel("Email address : ");
      email.setBounds(100,390,200,30);
      email.setFont(new Font("Raleway",Font.BOLD,20));
      frame.add(email);
      emailText=new JTextField();
      emailText.setBounds(300,390,400,30);
      emailText.setFont(new Font("Raleway",Font.BOLD,14));
      frame.add(emailText);

      mstatus=new JLabel("Marital Status : ");
      mstatus.setFont(new Font("Raleway",Font.BOLD,20));
      mstatus.setBounds(100,440,200,30);
      frame.add(mstatus);
      m1=new JRadioButton("Unmarried");
      m1.setFont(new Font("Raleway",Font.BOLD,14));
      m1.setBackground(new Color(222,255,228));
      m1.setBounds(300,440,100,30);
      frame.add(m1);
      m2=new JRadioButton("Married");
      m2.setFont(new Font("Raleway",Font.BOLD,14));
      m2.setBackground(new Color(222,255,228));
      m2.setBounds(450,440,100,30);
      frame.add(m2);
      m3=new JRadioButton("Other");
      m3.setFont(new Font("Raleway",Font.BOLD,14));
      m3.setBackground(new Color(222,255,228));
      m3.setBounds(600,440,100,30);
      frame.add(m3);
      ButtonGroup group1=new ButtonGroup();
      group1.add(m1);
      group1.add(m2);
      group1.add(m3);

      address=new JLabel("Address : ");
      address.setFont(new Font("Raleway",Font.BOLD,20));
      address.setBounds(100,490,200,30);
      frame.add(address);
      addressText=new JTextField();
      addressText.setFont(new Font("Raleway",Font.BOLD,14));
      addressText.setBounds(300,490,400,30);
      frame.add(addressText);

      city=new JLabel("City : ");
      city.setFont(new Font("Raleway",Font.BOLD,20));
      city.setBounds(100,540,200,30);
      frame.add(city);
      cityText=new JTextField();
      cityText.setFont(new Font("Raleway",Font.BOLD,14));
      cityText.setBounds(300,540,400,30);
      frame.add(cityText);

      state=new JLabel("State : ");
      state.setFont(new Font("Raleway",Font.BOLD,20));
      state.setBounds(100,590,200,30);
      frame.add(state);
      stateText=new JTextField();
      stateText.setFont(new Font("Raleway",Font.BOLD,14));
      stateText.setBounds(300,590,400,30);
      frame.add(stateText);

      pincode=new JLabel("Pin Code : ");
      pincode.setFont(new Font("Raleway",Font.BOLD,20));
      pincode.setBounds(100,640,200,30);
      frame.add(pincode);
      pincodeText=new JTextField();
      pincodeText.setFont(new Font("Raleway",Font.BOLD,14));
      pincodeText.setBounds(300,640,400,30);
      frame.add(pincodeText);

      next=new JButton("Next");
      next.setBounds(620,690,80,30);
      next.setFont(new Font("Raleway",Font.BOLD,14));
      next.setForeground(Color.white);
      next.setBackground(Color.BLACK);
      next.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             String formNo=first1;
             String sname=nameText.getText();
             String sfName=fNameText.getText();
             String sdob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
             String sgender=null;
             if(r1.isSelected()){
               sgender="Male";
             } else if (r2.isSelected()) {
               sgender="Female";
             }
             else {
               sgender="Other";
             }
             String semail=emailText.getText();
             String smerited=null;
             if(m1.isSelected()){
                smerited="Unmarried";
             } else if (m2.isSelected()) {
               smerited="Married";
             }else {
               smerited="Other";
             }
             String saddress=addressText.getText();
             String scity=cityText.getText();
             String sstate=stateText.getText();
             String spincode=pincodeText.getText();

             try {
               if(nameText.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
               }
               else {
                 config config=new config();
                 String query="insert into Signup values ('"+formNo+"','"+sname+"','"+sfName+"','"+sdob+"','"+sgender+"','"+semail+"','"+smerited+"','"+saddress+"','"+scity+"','"+sstate+"','"+spincode+"')";
                 config.statement.executeUpdate(query);
                 new Signup2(first1);
                 frame.setVisible(false);

               }
             }catch (Exception ex){
               ex.printStackTrace();
             }
          }
      });
      frame.add(next);

        back=new JButton("Back");
        back.setBounds(530,690,80,30);
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setForeground(Color.white);
        back.setBackground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Login();
            }
        });
        frame.add(back);

      frame.setVisible(true);
    }
    public static void main(String[] args){
        new Signup();
    }

}
