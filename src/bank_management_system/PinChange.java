package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PinChange {
    private JFrame frame;
    private JLabel title,label1,label2;
    private JButton b1,b2;
    private JPasswordField p1,p2;
    private String pin;
    PinChange(String pin){
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

        title=new JLabel("CHANGE YOUR PIN");
        title.setFont(new Font("System",Font.BOLD,16));
        title.setForeground(Color.white);
        title.setBounds(460,180,400,35);
        imglabel.add(title);

        label1=new JLabel("New PIN : ");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(430,220,400,35);
        imglabel.add(label1);

        p1=new JPasswordField();
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setBounds(600,220,180,25);
        imglabel.add(p1);

        label2=new JLabel("Re-Enter New PIN : ");
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(430,260,400,35);
        imglabel.add(label2);

        p2=new JPasswordField();
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setBounds(600,260,180,25);
        imglabel.add(p2);




        b1=new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String pin1=p1.getText();
                    String pin2=p2.getText();
                    if(!pin1.equals(pin2)){
                        JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                        return;
                    }
                    if(p1.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Enter New PIN");
                        return;
                    } else if (p2.getText().equals("")) {
                        JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                        return;
                    }
                    config c=new config();
                    String q1="update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                    String q2="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                    String q3="update Signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";

                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
                    frame.setVisible(false);
                    new Main_Class(pin1);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        imglabel.add(b1);

        b2=new JButton("Back");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,406,150,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main_Class(pin);
                frame.setVisible(false);
            }
        });
        imglabel.add(b2);


        frame.setVisible(true);
    }
    public static void main(String[] args){
        new PinChange("");
    }
}
