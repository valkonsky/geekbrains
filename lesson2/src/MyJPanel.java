import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    private double firstOperand = 0.0;
    private double secondOperand = 0.0;
    private double result = 0.0;
    JTextField operationPanel;


    MyJPanel(){
        setLayout(null);
        setBackground(Color.BLACK);

        operationPanel = new JTextField();
        operationPanel.setEditable(false);

        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b0 = new JButton("0");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton divide = new JButton("/");
        JButton multiple = new JButton("*");
        JButton clear = new JButton("clear");
        JButton equal = new JButton("=");

        operationPanel.setBounds(50,20,380,50);
        b7.setBounds(50,100,70,70);
        b8.setBounds(150,100,70,70);
        b9.setBounds(250,100,70,70);
        b4.setBounds(50,180,70,70);
        b5.setBounds(150,180,70,70);
        b6.setBounds(250,180,70,70);
        b1.setBounds(50,260,70,70);
        b2.setBounds(150,260,70,70);
        b3.setBounds(250,260,70,70);
        b0.setBounds(50,340,70,70);

        divide.setBounds(350,100,70,70);
        multiple.setBounds(350,180,70,70);
        minus.setBounds(350,260,70,70);
        plus.setBounds(350,340,70,70);

        clear.setBounds(150,340,70,70);
        equal.setBounds(250,340,70,70);

        add(operationPanel);
        add(b7);
        add(b8);
        add(b9);
        add(b4);
        add(b5);
        add(b6);
        add(b1);
        add(b2);
        add(b3);
        add(b0);

        add(divide);
        add(multiple);
        add(minus);
        add(plus);
        add(clear);
        add(equal);

        b1.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 1);
        });

        b2.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 2);
        });

        b3.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 3);
        });

        b4.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 4);
        });
        b5.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 5);
        });
        b6.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 6);
        });
        b7.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 7);
        });
        b8.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 8);
        });
        b9.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 9);
        });
        b0.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + 0);
        });

        divide.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() +"/");


        });

        multiple.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + "*");


        });

        minus.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + "-");

        });

        plus.addActionListener(e -> {
            operationPanel.setText(operationPanel.getText() + "+");

        });

        clear.addActionListener(e -> {
            operationPanel.setText("");
        });

        equal.addActionListener(e -> {
            ExpressionManager expressionManager = new ExpressionManager(this);
            operationPanel.setText(String.valueOf(expressionManager.getResult()));
        });
    }


    String getExpressionString(){
        return operationPanel.getText();
    }

}
