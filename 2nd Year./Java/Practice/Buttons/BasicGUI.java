// Program to practice Buttons in GUI
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BasicGUI extends JFrame implements ActionListener 
{
    // attributes
    JButton button1;
    JButton button2;
    JPanel panel;

    // Constructor - sets up screen as it first appears when you open it
    BasicGUI(String title) 
    {
        super(title);
        setSize(300, 300); // Width & Height

        // layout
        setLayout(new FlowLayout());

        // Create buttons
        button1 = new JButton("Click me");
        button2 = new JButton("Click me 2");
        button1.setToolTipText("This is the first button, and show a message when clicked");
		button2.setToolTipText("This is the second button, and show a message when clicked");

        // Make button clickable
        button1.addActionListener(this); // "Listen" to the button

        // Allow us to move/change the buttons (colours)
        panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.red);

        // add buttons to the frame
        panel.add(button1);
        panel.add(button2);
        add(panel);
        
        setVisible(true); // This needs to be true in order to be able to see the GUI

    }

    // Makes event do something
    public void actionPerformed(ActionEvent e) 
    {
        // Behaviour that should happen when the event happens
        JOptionPane.showMessageDialog(this, "Button clicked");
        System.out.println("button was clicked");
        
    }

}
