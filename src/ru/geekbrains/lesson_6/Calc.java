package ru.geekbrains.lesson_6;

import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {

    private double result;

    public Calc(){

        super("Calculator");
        setSize(500, 500);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel insert = new JPanel(new GridLayout(1, 2, 10, 0));
        insert.add(new JTextField(15));
        insert.add(new JTextField(15));

        JPanel operations = new JPanel(new GridLayout(1, 5, 5, 0));
        operations.add(new JButton("+"));
        operations.add(new JButton("-"));
        operations.add(new JButton("*"));
        operations.add(new JButton("/"));
        operations.add(new JButton("exponentiation"));

        JPanel oper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        oper.add(operations);

        JPanel contents = new JPanel(new BorderLayout());
        contents.add(insert, BorderLayout.NORTH);
        contents.add(oper, BorderLayout.CENTER);
        //contents.add(new JLabel("Result: " + result), BorderLayout.SOUTH);

        Container container = getContentPane();
        container.add(contents);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new Calc();
    }
}
