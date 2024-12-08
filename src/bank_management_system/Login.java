package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login {
    private JFrame frame;
    private JLabel label1,cardNo,pin;
    private JTextField cardNoText;
    private JPasswordField pinText;
    private JButton signin,clear,signup;
    Login(){
       frame=new JFrame("Bank Management System");
       frame.setSize(850,480);
       frame.setLocation(400,200);
       frame.setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image Img=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imgLable=new JLabel(img2);
        imgLable.setBounds(350,10,100,100);
        frame.add(imgLable);

        ImageIcon iimg=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image IImg=iimg.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon iimg2=new ImageIcon(IImg);
        JLabel iimgLable=new JLabel(iimg2);
        iimgLable.setBounds(650,350,100,100);
        frame.add(iimgLable);

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        frame.add(label1);

        cardNo=new JLabel("Card No: ");
        cardNo.setFont(new Font("Ralway",Font.BOLD,28));
        cardNo.setBounds(150,190,375,30);
        cardNo.setForeground(Color.white);
        frame.add(cardNo);
        cardNoText=new JTextField(15);
        cardNoText.setBounds(325,190,230,30);
        cardNoText.setFont(new Font("Arial",Font.BOLD,14));
        frame.add(cardNoText);

        pin=new JLabel("PIN:");
        pin.setForeground(Color.white);
        pin.setFont(new Font("Ralway",Font.BOLD,28));
        pin.setBounds(150,250,375,30);
        frame.add(pin);
        pinText=new JPasswordField(15);
        pinText.setBounds(325,250,230,30);
        pinText.setFont(new Font("Arial",Font.BOLD,14));
        frame.add(pinText);

         signin=new JButton("SIGN IN");
         signin.setFont(new Font("Arial",Font.BOLD,14));
         signin.setForeground(Color.white);
         signin.setBackground(Color.black);
         signin.setBounds(300,300,100,30);
         frame.add(signin);
         signin.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     config c=new config();
                     String carno=cardNoText.getText();
                     String pin=pinText.getText();
                     String q="select * from login where card_no = '"+carno+"' and pin = '"+pin+"'";
                     ResultSet resultSet =c.statement.executeQuery(q);
                     if(resultSet.next()){
                         frame.setVisible(false);
                         new Main_Class(pin);
                     }else {
                         JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                     }

                 } catch (Exception ex) {
                     ex.printStackTrace();
                 }
             }
         });


         clear=new JButton("CLEAR");
         clear.setFont(new Font("Arial",Font.BOLD,14));
         clear.setForeground(Color.white);
         clear.setBackground(Color.black);
         clear.setBounds(430,300,100,30);
         frame.add(clear);
         clear.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 cardNoText.setText("");
                 pinText.setText("");
             }
         });

         signup=new JButton("SIGN UP");
         signup.setForeground(Color.white);
         signup.setFont(new Font("Arial",Font.BOLD,14));
         signup.setBackground(Color.black);
         signup.setBounds(300,350,230,30);
         frame.add(signup);
         signup.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               new Signup();
               frame.setVisible(false);
             }
         });

        ImageIcon iiimg=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image IIImg=iiimg.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iiimg2=new ImageIcon(IIImg);
        JLabel iiimgLable=new JLabel(iiimg2);
        iiimgLable.setBounds(0,0,850,480);
        frame.add(iiimgLable);


        frame.setVisible(true);
    }
    public static  void main(String[] args){
        new Login();
    }
}
