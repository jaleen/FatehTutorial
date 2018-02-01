package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {
    public JFrame frame;
    public JButton b1, b2, b3, b4;
    public JTextField t1, t2;
    public JLabel l1, l2, l3;
    public Container con;

    public void GUI() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
        frame.setResizable(false);
        con = frame.getContentPane();
        frame.setLayout(null);

        t1 = new JTextField();
        t2 = new JTextField();
        con.add(t1);
        con.add(t2);

        t1.setBounds(300, 200, 150, 30);
        t2.setBounds(300, 250, 150, 30);

        b1 = new JButton("Addtion");
        b2 = new JButton("Subtraction");
        b3 = new JButton("Multpication");
        b4 = new JButton("Devision");

        b1.setBounds(100, 400, 100, 30);
        b2.setBounds(200, 400, 100, 30);
        b3.setBounds(300, 400, 100, 30);
        b4.setBounds(400, 400, 100, 30);
        con.add(b1);
        con.add(b2);
        con.add(b3);
        con.add(b4);

        l1 = new JLabel("Fist Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel();

        l1.setBounds(200, 200, 100, 30);
        l2.setBounds(200, 250, 100, 30);
        l3.setBounds(200, 300, 100, 30);

        con.add(l1);
        con.add(l2);
        con.add(l3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String a = t1.getText();
        String b = t2.getText();

        int n1, n2;
        n1 = Integer.parseInt(a);
        n2 = Integer.parseInt(b);

        if (e.getSource() == b1) {
            int sum = n1 + n2;
            l3.setText(n1 + " + " + n2 + " = " + sum);
        }
        if (e.getSource() == b2) {
            int sub = n1 - n2;
            l3.setText(n1 + " - " + n2 + " = " + sub);
        }
        if (e.getSource() == b3) {
            int mul = n1 * n2;
            l3.setText(n1 + " * " + n2 + " = " + mul);
        }
        if (e.getSource() == b4) {
            int div = n1 / n2;
            l3.setText(n1 + "/" + n2 + "=" + div);
        }

    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.GUI();

    }
}