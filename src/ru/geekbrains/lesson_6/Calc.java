package ru.geekbrains.lesson_6;

import javax.swing.*;

public class Calc extends JFrame {

    public Calc(){

        super("Calculator");
        setSize(500, 500);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
	// write your code here
        Calc app = new Calc();
        app.setVisible(true);
        app.pack();
    }
}
