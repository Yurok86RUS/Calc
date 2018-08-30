package ru.geekbrains.lesson_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    private double result;
    private JButton sum;
    private JButton difference;
    private JButton myltiply;
    private JButton division;
    private JButton exponentiation;
    private JPanel contents;

    public Calc(){

        super("Calculator");
        setSize(500, 500);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel insert = new JPanel(new GridLayout(1, 2, 10, 0));
        insert.add(new JTextField(15));
        insert.add(new JTextField(15));

        JPanel operations = new JPanel(new GridLayout(1, 5, 5, 0));
        JButton sum = new JButton("+");
        JButton difference = new JButton("-");
        JButton myltiply = new JButton("*");
        JButton division = new JButton("/");
        JButton exponentiation = new JButton("exponentiation");

//        sum.setName("+");
//        difference.setName("-");
//        myltiply.setName("*");
//        division.setName("/");
//        exponentiation.setName("exp");

        operations.add(sum);
        operations.add(difference);
        operations.add(myltiply);
        operations.add(division);
        operations.add(exponentiation);

        JPanel oper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        oper.add(operations);

        JPanel contents = new JPanel(new BorderLayout());
        contents.add(insert, BorderLayout.NORTH);
        contents.add(oper, BorderLayout.CENTER);
        //contents.add(new JLabel("Result: " + result), BorderLayout.SOUTH);

        Container container = getContentPane();
        container.add(contents);

        double a = 3;
        int b = 4;

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = a + b;
                output(result);
            }
        });
        difference.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = a - b;
                output(result);
            }
        });
        myltiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = a * b;
                output(result);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (b != 0){
                    result = a / b;
                    output(result);
                }
                else JOptionPane.showMessageDialog(contents, "div 0", "Error", JOptionPane.ERROR_MESSAGE);

            }
        });
        exponentiation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут будем возводить в степень
                double result = 1;
                for (int i = 1; i <= b; i++){
                    result = result * a;
                }
                output(result);
            }
        });

    }

    private void output(double result){
        //System.out.println("Result: " + result);
        JOptionPane.showMessageDialog(contents,"Result = " + result, "Result", JOptionPane.OK_CANCEL_OPTION);
    }

    public static void main(String[] args) {
	// write your code here
        Calc app = new Calc();
        app.pack();
        app.setVisible(true);
    }

}
