package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement {
    private JFrame frame;
    private JLabel label1,label2,label3,label4;
    private String pin;
    private JButton button;
    MiniStatement(String pin){
        frame=new JFrame();
        this.pin=pin;
        frame.setSize(400,600);
        frame.setUndecorated(true);
        frame.setLocation(20,20);
        frame.getContentPane().setBackground(new Color(255,204,204));
        frame.setLayout(null);

        label1=new JLabel();
        label1.setBounds(20,140,400,200);
        frame.add(label1);

        label2=new JLabel("Mini Statement");
        label2.setBounds(150,20,200,20);
        label2.setFont(new Font("System",Font.BOLD,15));
        frame.add(label2);

        label3=new JLabel();
        label3.setBounds(20,80,300,20);
        frame.add(label3);

        label4=new JLabel("");
        label4.setBounds(20,400,300,20);
        label4.setFont(new Font("System",Font.BOLD,15));
        frame.add(label4);

        try {
            config c=new config();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_no").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int Balance=0;
            config c=new config();
            ResultSet resultSet=c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><br><html>");

                if(resultSet.getString("type").equals("Deposit")){
                    Balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    Balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs "+Balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        button=new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
            }
        });
        frame.add(button);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        new MiniStatement("");
    }
}
