package Calcul;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel panelMain;
    private JTextField txtMain;
    private JButton ACbtn;
    private JButton a2Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton a00Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton button15;
    private JButton a3Button;
    private JButton a2Button1;
    private JButton a5Button1;
    private JButton a8Button1;
    private JButton a0Button1;
    private JButton button6;
    private JButton a3Button1;
    private JButton a6Button;
    private JButton a9Button;
    private JButton button12;

    double a, b, result;

    String op;


    public Calculator() {
        ACbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText("");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a1Button.getText());
            }
        });
        a2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtMain.setText(txtMain.getText() + a2Button1.getText());

            }
        });
        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a3Button1.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a4Button.getText());
            }
        });
        a5Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a5Button1.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a7Button.getText());
            }
        });
        a8Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a8Button1.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a9Button.getText());
            }
        });
        a0Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a0Button1.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMain.setText(txtMain.getText() + a00Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtMain.getText().contains(".")) {
                    double pm = Double.parseDouble(txtMain.getText());
                    pm = pm * -1;
                    txtMain.setText(String.valueOf(pm));

                }
                else{
                    long PM = Long.parseLong(txtMain.getText());
                    PM = PM*-1;
                    txtMain.setText(String.valueOf(PM));
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtMain.getText().contains(".")){

                    txtMain.setText(txtMain.getText() + button12.getText());
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                a = Double.parseDouble(txtMain.getText());
                op = "+";
                txtMain.setText("");

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtMain.getText());
                op = "-";
                txtMain.setText("");

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtMain.getText());
                op = "×";
                txtMain.setText("");

            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtMain.getText());
                op = "÷";
                txtMain.setText("");

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(txtMain.getText().length() > 0){
                    StringBuilder Astring = new StringBuilder(txtMain.getText());

                    Astring.deleteCharAt(txtMain.getText().length() - 1);

                    backspace = String.valueOf(Astring);

                    txtMain.setText(backspace);


                }
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtMain.getText());

                if(op == "+"){

                  result = a+b;
                  txtMain.setText(String.valueOf(result));
                }

                else if(op == "-"){

                    result = a - b;
                    txtMain.setText(String.valueOf(result));

                }

                else if(op == "×"){

                    result = a * b;
                    txtMain.setText(String.valueOf(result));

                }
                else if(op == "÷"){

                    result = a / b;
                    txtMain.setText(String.valueOf(result));

                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
