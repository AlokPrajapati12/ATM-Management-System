package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit {
    private JFrame frame;
    private JLabel title;
    private JTextField textField;
    private JButton depositB,back;
    private String pin;
    Deposit(String pin){
        frame=new JFrame("Deposit");
        this.pin=pin;
        frame.setSize(1550,1080);
        frame.setLocation(0,0);
        frame.setUndecorated(true);
        frame.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image Img=img.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imglabel=new JLabel(img2);
        imglabel.setBounds(0,0,1550,830);
        frame.add(imglabel);

        title=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        title.setFont(new Font("System",Font.BOLD,16));
        title.setForeground(Color.white);
        title.setBounds(460,180,400,35);
        imglabel.add(title);
        textField=new JTextField();
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        imglabel.add(textField);

        depositB=new JButton("Deposit");
        depositB.setBounds(700,362,150,35);
        depositB.setBackground(new Color(65,125,128));
        depositB.setForeground(Color.white);
        depositB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String amount = textField.getText();
                    Date date = new Date();
                    if (textField.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                    }else {
                        config c=new config();
                        c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                        frame.setVisible(false);
                        new Main_Class(pin);
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        });
        imglabel.add(depositB);

        back=new JButton("Back");
        back.setForeground(Color.white);
        back.setBackground(new Color(65,125,128));
        back.setBounds(700,406,150,35);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               frame.setVisible(false);
               new Main_Class(pin);
            }
        });
        imglabel.add(back);




        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Deposit("");
    }
}
