import javax.swing.*;

public class Calculator extends JFrame {

    Calculator(){
        setTitle("Calculator");
        add(new MyJPanel());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
}