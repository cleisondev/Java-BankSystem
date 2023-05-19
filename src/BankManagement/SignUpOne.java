package BankManagement;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUpOne extends JFrame {

    JTextField nameInput, fnameInput,dobInput,emailInput,addressInput,cityInput,pinInput,stateInput;
        SignUpOne(){

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel form = new JLabel("Cadastro No. " + random);
        form.setFont(new Font("Raleway", Font.BOLD, 38));
        form.setBounds(250,20,600,40);
        add(form);

        JLabel personDetails = new JLabel("Página 1: Informações pessoais");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(250,80,400,30);
        add(personDetails);

        JLabel name = new JLabel("Nome: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);

        nameInput = new JTextField();
        nameInput.setBounds(350,140,350,30);
        nameInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameInput);


        JLabel fname = new JLabel("Nome do pai: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameInput = new JTextField();
        fnameInput.setBounds(350,190,350,30);
        fnameInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(fnameInput);


        JLabel dob = new JLabel("Data de nascimento: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);

        JDateChooser dobChoose = new JDateChooser();
        dobChoose.setBounds(350,240,350,30);
        dobChoose.setForeground(new Color(105,105,105));
        add(dobChoose);



        JLabel gender = new JLabel("Genêro: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JRadioButton male = new JRadioButton("Masculino");
        JRadioButton female = new JRadioButton("Feminino");
        JRadioButton others = new JRadioButton("Outros");

        male.setBounds(350,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);

        female.setBounds(470,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);

        others.setBounds(590,290,100,30);
        others.setBackground(Color.WHITE);
        add(others);


        JLabel email = new JLabel("E-mail: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);

        emailInput = new JTextField();
        emailInput.setBounds(350,340,350,30);
        emailInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailInput);

        JLabel marital = new JLabel("Estado civil: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JRadioButton married = new JRadioButton("Casado");
        JRadioButton unmarried = new JRadioButton("Solteiro");
        JRadioButton othersMarital = new JRadioButton("Outros");

            married.setBounds(350,390,100,30);
            married.setBackground(Color.WHITE);
        add(married);

            unmarried.setBounds(470,390,100,30);
            unmarried.setBackground(Color.WHITE);
        add(unmarried);

            othersMarital.setBounds(590,390,100,30);
            othersMarital.setBackground(Color.WHITE);
        add(othersMarital);




        JLabel address = new JLabel("Endereço: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);

        addressInput = new JTextField();
        addressInput.setBounds(350,440,350,30);
        addressInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(addressInput);


        JLabel City = new JLabel("Cidade: ");
        City.setFont(new Font("Raleway", Font.BOLD, 20));
        City.setBounds(100,490,200,30);
        add(City);

        cityInput = new JTextField();
        cityInput.setBounds(350,490,350,30);
        cityInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityInput);


        JLabel state = new JLabel("Estado: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);

        stateInput = new JTextField();
        stateInput.setBounds(350,540,350,30);
        stateInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateInput);


        JLabel pin = new JLabel("Cód Pin: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100,590,200,30);
        add(pin);

        pinInput = new JTextField();
        pinInput.setBounds(350,590,350,30);
        pinInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinInput);

        JButton nextBtn = new JButton("Próximo");
        nextBtn.setBounds(600,650,100,31);
        nextBtn.setBackground(Color.BLACK);
        nextBtn.setForeground(Color.WHITE);
        add(nextBtn);


        getContentPane().setBackground(Color.WHITE);


        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }


    public  static  void main(String args[]){
        new SignUpOne();
    }
}
