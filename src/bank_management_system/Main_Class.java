package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class {
    private JFrame frame;
    private JLabel label;
    private JButton b1,b2,b3,b4,b5,b6,b7;
    private String pin;
    Main_Class(String pin){
       frame=new JFrame();
       this.pin=pin;
       frame.setSize(1550,1080);
       frame.setUndecorated(true);
       frame.setLayout(null);
       frame.setLocation(0,0);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image Img=img.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imglabel=new JLabel(img2);
        imglabel.setBounds(0,0,1550,830);
        frame.add(imglabel);

        label=new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setFont(new Font("System",Font.BOLD,28));
        label.setForeground(Color.white);
        imglabel.add(label);

        b1=new JButton("DEPOSIT");
        b1.setBounds(410,270,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Deposit(pin);
               frame.setVisible(false);
            }
        });
        imglabel.add(b1);

        b2=new JButton("CASH WITHDRAWAL");
        b2.setBounds(700,270,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new Withdrawal(pin);
               frame.setVisible(false);
            }
        });
        imglabel.add(b2);

        b3=new JButton("FAST CASH");
        b3.setBounds(410,318,150,35);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new Fast_Cash(pin);
              frame.setVisible(false);
            }
        });
        imglabel.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setBounds(700,318,150,35);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new MiniStatement(pin);
              frame.setVisible(false);
            }
        });
        imglabel.add(b4);

        b5=new JButton("PIN CHANGE");
        b5.setBounds(410,362,150,35);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new PinChange(pin);
               frame.setVisible(false);
            }
        });
        imglabel.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setBounds(700,362,150,35);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Balance_Enquery(pin);
                   frame.setVisible(false);
            }
        });
        imglabel.add(b6);

        b7=new JButton("EXIT");
        b7.setBounds(700,408,150,35);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             frame.setVisible(false);
            }
        });
        imglabel.add(b7);



        frame.setVisible(true);
    }
    public static void main(String[] args ){
        new Main_Class("");
    }
}
