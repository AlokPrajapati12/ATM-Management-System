package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Balance_Enquery {
     private JFrame frame;
     private JLabel label,label2;
     private String pin;
     private JButton b1;
    Balance_Enquery(String pin){
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

        label=new JLabel("Your Current Balance is Rs ");
        label.setBounds(430,180,700,35);
        label.setFont(new Font("System",Font.BOLD,28));
        label.setForeground(Color.white);
        imglabel.add(label);

        label2=new JLabel();
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.white);
        label2.setFont(new Font("System",Font.BOLD,16));
        imglabel.add(label2);
        int Balance=0;
        try {
            config c=new config();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    Balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    Balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        label2.setText(""+Balance);
        b1=new JButton("BACK");
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(700,406,150,35);
        b1.setForeground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              frame.setVisible(false);
              new Main_Class(pin);
            }
        });
        imglabel.add(b1);


        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Balance_Enquery("");
    }
}
