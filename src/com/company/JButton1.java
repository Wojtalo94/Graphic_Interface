package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton1 extends JButton implements ActionListener
    {
    int counter = 0;

    JButton1()
    {
        this.setText("Clicker");
        this.addActionListener(this);
    }

    public void actionPerformed (ActionEvent e)
    {
        counter++;
        this.setText("Clicked " + counter + " times");
    }
}
