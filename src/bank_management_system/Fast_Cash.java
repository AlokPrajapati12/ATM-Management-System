package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fast_Cash implements ActionListener{
       private JFrame frame;
       private JLabel label;
       private JButton b1,b2,b3,b4,b5,b6,b7;
       private String pin;
    Fast_Cash(String pin){
     frame=new JFrame();
     frame.setSize(1550,1080);
     this.pin=pin;
     frame.setLocation(0,0);
     frame.setUndecorated(true);
     frame.setLayout(null);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image Img=img.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imglabel=new JLabel(img2);
        imglabel.setBounds(0,0,1550,830);
        frame.add(imglabel);

        label=new JLabel("SELECT WITHDRAWAL AMOUNT");
        label.setBounds(434,180,700,35);
        label.setFont(new Font("System",Font.BOLD,24));
        label.setForeground(Color.white);
        imglabel.add(label);

        b1=new JButton("Rs. 100");
        b1.setBounds(410,270,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        imglabel.add(b1);

        b2=new JButton("Rs. 500");
        b2.setBounds(700,270,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        imglabel.add(b2);

        b3=new JButton("Rs. 1000");
        b3.setBounds(410,318,150,35);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        imglabel.add(b3);

        b4=new JButton("Rs. 2000");
        b4.setBounds(700,318,150,35);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        imglabel.add(b4);

        b5=new JButton("Rs. 5000");
        b5.setBounds(410,362,150,35);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        imglabel.add(b5);

        b6=new JButton("Rs. 10000");
        b6.setBounds(700,362,150,35);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        imglabel.add(b6);

        b7=new JButton("BACK");
        b7.setBounds(700,408,150,35);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        imglabel.add(b7);

        frame.setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b7) {
             frame.setVisible(false);
             new Main_Class(pin);
         }
         else {
             String amount =((JButton)e.getSource()).getText().substring(4);
             config c=new config();
             Date date=new Date();
             try {
                 ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                 int Balance=0;
                 while (resultSet.next()){
                     if(resultSet.getString("type").equals("Deposit")){
                         Balance += Integer.parseInt(resultSet.getString("amount"));
                     }else {
                         Balance -= Integer.parseInt(resultSet.getString("amount"));
                     }
                 }
                 if(e.getSource()!= b7 && Balance<Integer.parseInt(amount)){
                     JOptionPane.showMessageDialog(null,"Insufficient Balance");
                     return;
                 }
                 c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                 JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfully");

             }catch (Exception ex){
                 ex.printStackTrace();
             }

             frame.setVisible(false);
             new Main_Class(pin);

         }

    }


    public static void main(String[] args ){
        new Fast_Cash("");
    }
}
