package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 {
    private JFrame frame;
    private JLabel accountType,accountNo,pin,sr;
    private JRadioButton r1,r2,r3,r4;
    private JCheckBox s1,s2,s3,s4,s5,s6;
    private JButton submit,cancel;
    private String formNo;
    Signup3(String formNo){
        frame=new JFrame("APPLICATION FORM 3");
        this.formNo=formNo;
        frame.setSize(850,770);
        frame.setUndecorated(true);
        frame.setLocation(360,40);
        frame.getContentPane().setBackground(new Color(215,252,252));
        frame.setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image Img=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imgLabel=new JLabel(img2);
        imgLabel.setBounds(130,10,100,100);
        frame.add(imgLabel);

        JLabel page3=new JLabel("Page 3");
        page3.setBounds(300,40,400,40);
        page3.setFont(new Font("Raleway",Font.BOLD,22));
        frame.add(page3);

        JLabel accountDetails=new JLabel("Account Details");
        accountDetails.setFont(new Font("Raleway",Font.BOLD,22));
        accountDetails.setBounds(250,70,400,40);
        frame.add(accountDetails);

        accountType=new JLabel("Account type : ");
        accountType.setFont(new Font("Raleway",Font.BOLD,18));
        accountType.setBounds(100,140,200,30);
        frame.add(accountType);
        r1=new JRadioButton("Saving Account");
        r1.setBackground(new Color(215,252,252));
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(100,180,150,30);
        frame.add(r1);
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(215,252,252));
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(350,180,250,30);
        frame.add(r2);
        r3=new JRadioButton("Current Account");
        r3.setBackground(new Color(215,252,252));
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(100,220,150,30);
        frame.add(r3);
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBackground(new Color(215,252,252));
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(350,220,250,30);
        frame.add(r4);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        accountNo=new JLabel("Card Number : ");
        accountNo.setBounds(100,300,150,30);
        accountNo.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(accountNo);
        JLabel l2=new JLabel("(Your 16-digit Card Number)");
        l2.setFont(new Font("Raleway",Font.BOLD,12));
        l2.setBounds(100,330,200,20);
        frame.add(l2);

        JLabel l3=new JLabel("XXXX-XXXX-XXXX-2085");
        l3.setBounds(330,300,250,30);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(l3);
        JLabel l4=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l4.setFont(new Font("Raleway",Font.BOLD,12));
        l4.setBounds(330,330,500,20);
        frame.add(l4);

        pin=new JLabel("PIN : ");
        pin.setBounds(100,370,200,30);
        pin.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(pin);
        JLabel l5=new JLabel("(4-digit password)");
        l2.setFont(new Font("Raleway",Font.BOLD,12));
        l2.setBounds(100,400,200,20);
        frame.add(l2);

        JLabel pincode=new JLabel("XXXX");
        pincode.setFont(new Font("Raleway",Font.BOLD,18));
        pincode.setBounds(330,370,200,30);
        frame.add(pincode);

        sr=new JLabel("Services Required : ");
        sr.setFont(new Font("Raleway",Font.BOLD,18));
        sr.setBounds(100,440,200,30);
        frame.add(sr);

        s1=new JCheckBox("ATM CARD");
        s1.setBackground(new Color(215,252,252));
        s1.setFont(new Font("Raleway",Font.BOLD,16));
        s1.setBounds(100,480,150,30);
        frame.add(s1);
        s2=new JCheckBox("Internet Banking");
        s2.setBackground(new Color(215,252,252));
        s2.setFont(new Font("Raleway",Font.BOLD,16));
        s2.setBounds(350,480,250,30);
        frame.add(s2);
        s3=new JCheckBox("Mobile Banking");
        s3.setBackground(new Color(215,252,252));
        s3.setFont(new Font("Raleway",Font.BOLD,16));
        s3.setBounds(100,520,150,30);
        frame.add(s3);
        s4=new JCheckBox("EMAIL Alerts");
        s4.setBackground(new Color(215,252,252));
        s4.setFont(new Font("Raleway",Font.BOLD,16));
        s4.setBounds(350,520,250,30);
        frame.add(s4);
        s5=new JCheckBox("Cheque Book");
        s5.setBackground(new Color(215,252,252));
        s5.setFont(new Font("Raleway",Font.BOLD,16));
        s5.setBounds(100,560,150,30);
        frame.add(s5);
        s6=new JCheckBox("E-Statement");
        s6.setBackground(new Color(215,252,252));
        s6.setFont(new Font("Raleway",Font.BOLD,16));
        s6.setBounds(350,560,250,30);
        frame.add(s6);

        JCheckBox l6=new JCheckBox("I here by decleares that the above entered details correct to the best of my knowledge.",true);
        l6.setBackground(new Color(215,252,252));
        l6.setFont(new Font("Raleway",Font.BOLD,16));
        l6.setBounds(100,620,700,30);
        frame.add(l6);

        JLabel l7=new JLabel("Form No : ");
        l7.setBounds(640,10,100,30);
        l7.setFont(new Font("Raleway",Font.BOLD,14));
        frame.add(l7);
        JLabel l8=new JLabel();
        l8.setBounds(680,10,100,30);
        l8.setFont(new Font("Raleway",Font.BOLD,14));
        frame.add(l8);

        submit=new JButton("Submit");
        submit.setBounds(250,680,100,30);
        submit.setFont(new Font("Raleway",Font.BOLD,18));
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String acc_type=null;
                if(r1.isSelected()){
                    acc_type="Saving Account";
                } else if (r2.isSelected()) {
                    acc_type="Fixed Deposit Account";
                } else if (r3.isSelected()) {
                    acc_type="Current Account";
                }else {
                    acc_type="Recurring Deposit Account";
                }

                Random ran=new Random();
                long first1=(ran.nextLong()%90000000L)+1409963000000000L;
                String cardno=""+Math.abs(first1);
                long first2=(ran.nextLong()%9000L)+1000L;
                String pinno=""+Math.abs(first2);

                String fac="";
                if(s1.isSelected()){
                    fac +="ATM CARD";
                } else if (s2.isSelected()) {
                    fac +="Internet Banking";
                } else if (s3.isSelected()){
                    fac += "Mobile Banking";
                } else if (s4.isSelected()) {
                    fac +="EMAIL Alerts";
                } else if (s5.isSelected()) {
                    fac +="Cheque Book";
                }else {
                    fac +="E-Statement";
                }
                try {
                    if(e.getSource()==submit) {
                        if (acc_type.equals("")) {
                            JOptionPane.showMessageDialog(null, "Fill all the fields");
                        }else{
                            config c=new config();
                            String q1="insert into Signup3 values('"+formNo+"','"+acc_type+"','"+cardno+"','"+pinno+"','"+fac+"')";
                            String q2="insert into login values('"+formNo+"','"+cardno+"','"+pinno+"')";
                            c.statement.executeUpdate(q1);
                            c.statement.executeUpdate(q2);
                            JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\nPin :"+pinno);
                            new Deposit(pinno);
                            frame.setVisible(false);
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        frame.add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(420,680,100,30);
        cancel.setFont(new Font("Raleway",Font.BOLD,18));
        cancel.setForeground(Color.white);
        cancel.setBackground(Color.black);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              new Login();
            }
        });
        frame.add(cancel);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Signup3("");
    }
}
