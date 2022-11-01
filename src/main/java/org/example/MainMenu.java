package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu;         // One menu
    JMenuItem item;     // Which has one item
    public MainMenu(){
        menu=new JMenu("The Menu");
        item=new JMenuItem("Item 1");
        item.addActionListener(this);
        add(menu);                          // Add the JMenu to the JMenuBar
        menu.add(item);                     // Add the JMenuItem to the JMenu
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
