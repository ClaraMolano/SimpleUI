package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton but1;

    public ButtonPanel(String text) {
        but1=new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Printing but1");
            }
        });
    add(but1);
    setLayout(new GridLayout(1,1));    // One row, one column
    }
}
