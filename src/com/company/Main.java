package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame Window = new JFrame("Graphic_Interface");

        Dimension Size = new Dimension();
        Size.setSize(50, 50);
        FlowLayout Handle = new FlowLayout();

        JButton1 Button = new JButton1();
        JButton Button2 = new JButton("Button 2");

        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setMinimumSize(Size);
        Window.setMaximumSize(new Dimension(800,600));
        Window.setPreferredSize(new Dimension(400, 200));

        Window.setLayout(Handle);
        Handle.setAlignment(FlowLayout.CENTER);
        Window.add(Button);
        Window.add(Button2);

        JPanel Panel = new JPanel();
        for (int i = 1; i<=4; i++)
        {
            Panel.add (new JButton("Button " + i));
        }
        Panel.setPreferredSize(new Dimension(100,130));
        Panel.setBackground(new Color(0,0,254));

        JScrollPane Stripes = new JScrollPane(Panel);
        Stripes.setPreferredSize(new Dimension(100,150));
        Panel.setVisible(true);
        Stripes.setVisible(true);

        Window.add(Panel, FlowLayout.CENTER);

        Window.setVisible(true);
        Window.pack();
    }
}
