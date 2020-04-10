package com.example.awtSample;

import java.awt.*;
// java.awt.event is a separate package
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SanSerif", Font.BOLD, 18);
        Font sanSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sanSerifSmall);
        g.drawString("by Peter McCreadie", 60, 100);

    }
}
