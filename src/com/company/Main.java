//PRG 452 Object Oriented Programming III
//Week 4 Assignment
//Chapter 19, E19.4, pg 877
//Jerrie Pineda
//Courtnee Sullivan
package com.company;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

//This is where I have created my display window and check boxes
class ColorChangingWindowApplication extends JFrame implements ActionListener
{
        JPanel colorPanel;
        JPanel checkBoxPanel;
        JCheckBox red;
        JCheckBox green;
        JCheckBox blue;

        public ColorChangingWindowApplication()
        {
            super("Color Changing Window Application");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(350, 350);
            getContentPane().setLayout(null);
//Here I set the bounds and borders
            colorPanel = new JPanel();
            colorPanel.setBounds(50, 25, 209, 175);
            colorPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
            getContentPane().add(colorPanel);

            checkBoxPanel = new JPanel();
            checkBoxPanel.setBounds(15, 265, 360, 55);
            getContentPane().add(checkBoxPanel);
//Here is the primary check boxes with there designated colors
            red = new JCheckBox("Red");
            green = new JCheckBox("Green");
            blue = new JCheckBox("Blue");

            checkBoxPanel.add(red);
            checkBoxPanel.add(green);
            checkBoxPanel.add(blue);
//These listen to which box the user has checked
            red.addActionListener(this);
            green.addActionListener(this);
            blue.addActionListener(this);

            this.setVisible(true);

        }
//This which create the change based on the boxes that are checked
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource().equals(red) || e.getSource().equals(green) || e.getSource().equals(blue)){

                int redComponent = 0;
                int greenComponent = 0;
                int blueComponent = 0;
                if(red.isSelected())
                    redComponent = 255;
                if(green.isSelected())
                    greenComponent = 255;
                if(blue.isSelected())
                    blueComponent = 255;

                colorPanel.setBackground(new Color(redComponent, greenComponent, blueComponent));
                this.repaint();

            }

        }

        public static void main(String[] args) {
//This will display my results
            new ColorChangingWindowApplication();

        }

}