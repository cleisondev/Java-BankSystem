package BankManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton login, reg;
    JTextField cardTextField;
    JPasswordField pinTextField;


    Login(){

        setTitle("My Bank");
        setLayout(null);

        ImageIcon imageOne = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.jpg"));
        Image imageTwo = imageOne.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(imageTwo);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to BDC");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);

        //CARD
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(350,150,250,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);


        //PIN
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,220,250,30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350,220,250,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        //Button sign in
        login = new JButton("SIGN IN");
        login.setBounds(350,300,100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        //Button SignUp
        reg = new JButton("SIGN UP");
        reg.setBounds(500,300,100, 30);
        reg.setBackground(Color.BLACK);
        reg.setForeground(Color.WHITE);
        reg.addActionListener(this);
        add(reg);


        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);//Tamanho da tela
        setVisible(true);//Tornar visivel
        setLocation(350,200);//Localização
    }

    public void  actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){

        }else if (ae.getSource() == reg){

        }
    };

    public  static void main(String args[]){
        new Login();

    }
}
