package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 {
    private JFrame frame;
    private String formNo;
    private JLabel page1,additionDetails;
    private JLabel religion,category,income,educational,occupation,adharNo,panNo,seniorS,ExistingAc,form;
    private JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    private JTextField adharNoText,panNoText;
    private JRadioButton r1,r2,m1,m2;
    private JButton next,back;
    Signup2(String formNo){
        frame=new JFrame("APPLICATION FORM 2");
        this.formNo=formNo;
        frame.setSize(850,770);
        frame.setUndecorated(true);
        frame.setLocation(360,40);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(252,208,76));

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image Img=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(Img);
        JLabel imgLabel=new JLabel(img2);
        imgLabel.setBounds(130,10,100,100);
        frame.add(imgLabel);

        page1=new JLabel("Page 2:-");
        page1.setFont(new Font("Raleway",Font.BOLD,22));
        page1.setBounds(300,40,600,30);
        frame.add(page1);

        additionDetails=new JLabel("Additional Details");
        additionDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionDetails.setBounds(250,70,600,30);
        frame.add(additionDetails);

        religion=new JLabel("Religion : ");
        religion.setBounds(100,150,100,30);
        religion.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(religion);
        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox1=new JComboBox(religion);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,150,320,30);
        frame.add(comboBox1);

        category=new JLabel("Category : ");
        category.setBounds(100,200,100,30);
        category.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(category);
        String category[]={"SC","ST","OBC","General","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,200,320,30);
        frame.add(comboBox2);

        income=new JLabel("Income : ");
        income.setBounds(100,250,100,30);
        income.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(income);
        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,250,320,30);
        frame.add(comboBox3);

        educational=new JLabel("Educational : ");
        educational.setBounds(100,300,150,30);
        educational.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(educational);
        String educational[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4=new JComboBox(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,300,320,30);
        frame.add(comboBox4);

        occupation=new JLabel("Occupation : ");
        occupation.setBounds(100,350,150,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,18));
        frame.add(occupation);
        String occupation[]={"Salaried","Self-Employee","Business","Student","Retired","Other"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,350,320,30);
        frame.add(comboBox5);

        panNo=new JLabel("PAN Number : ");
        panNo.setFont(new Font("Raleway",Font.BOLD,18));
        panNo.setBounds(100,400,150,30);
        frame.add(panNo);
        panNoText=new JTextField();
        panNoText.setFont(new Font("Raleway",Font.BOLD,14));
        panNoText.setBounds(350,400,320,30);
        frame.add(panNoText);

        adharNo=new JLabel("Aadhar Number : ");
        adharNo.setFont(new Font("Raleway",Font.BOLD,18));
        adharNo.setBounds(100,450,200,30);
        frame.add(adharNo);
        adharNoText=new JTextField();
        adharNoText.setFont(new Font("Raleway",Font.BOLD,14));
        adharNoText.setBounds(350,450,320,30);
        frame.add(adharNoText);

        seniorS=new JLabel("Senior Citizen : ");
        seniorS.setFont(new Font("Raleway",Font.BOLD,18));
        seniorS.setBounds(100,500,200,30);
        frame.add(seniorS);
        r1=new JRadioButton("Yes");
        r1.setBounds(350,500,100,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        frame.add(r1);
        r2=new JRadioButton("No");
        r2.setBounds(460,500,100,30);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        frame.add(r2);
        ButtonGroup group=new ButtonGroup();
        group.add(r1);
        group.add(r2);

        ExistingAc=new JLabel("Existing Account : ");
        ExistingAc.setFont(new Font("Raleway",Font.BOLD,18));
        ExistingAc.setBounds(100,550,200,30);
        frame.add(ExistingAc);
        m1=new JRadioButton("Yes");
        m1.setBounds(350,550,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(252,208,76));
        frame.add(m1);
        m2=new JRadioButton("No");
        m2.setBounds(460,550,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(252,208,76));
        frame.add(m2);
        ButtonGroup group1=new ButtonGroup();
        group1.add(m1);
        group1.add(m2);

        form=new JLabel("Form No : ");
        form.setFont(new Font("Raleway",Font.BOLD,14));
        form.setBounds(650,10,150,30);
        frame.add(form);
        JLabel formText=new JLabel(formNo);
        formText.setFont(new Font("Raleway",Font.BOLD,14));
        formText.setBounds(760,10,60,30);
        frame.add(formText);


        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rel = (String) comboBox1.getSelectedItem();
                String cate = (String) comboBox2.getSelectedItem();
                String income = (String) comboBox3.getSelectedItem();
                String edu = (String) comboBox4.getSelectedItem();
                String occ = (String) comboBox5.getSelectedItem();
                String span = panNoText.getText();
                String saadher = adharNoText.getText();
                String senior_c = null;
                if (r1.isSelected()) {
                    senior_c = "Yes";
                } else {
                    senior_c = "No";
                }
                String existin_Acc=null;
                if (m1.isSelected()) {
                    existin_Acc = "Yes";
                } else {
                    existin_Acc = "No";
                }
                 try {
                     if(panNoText.getText().equals("")||adharNoText.getText().equals("")){
                         JOptionPane.showMessageDialog(null,"Fill all the fields");
                     }else {
                         config c1=new config();
                         String q="insert into Signup2 values ('"+formNo+"','"+rel+"','"+cate+"','"+income+"','"+edu+"','"+occ+"','"+span+"','"+saadher+"','"+senior_c+"','"+existin_Acc+"')";
                         c1.statement.executeUpdate(q);
                         new Signup3(formNo);
                         frame.setVisible(false);
                     }

                 }catch (Exception ex){
                     ex.printStackTrace();
                 }

            }
        });
        frame.add(next);

        back=new JButton("Back");
        back.setFont(new Font("Raleway",Font.BOLD,14));
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setBounds(450,640,100,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new Signup();
            }
        });
        frame.add(back);


        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Signup2("");
    }
}
