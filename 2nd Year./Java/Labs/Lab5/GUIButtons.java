// Program to make a GUI with events and results to which events
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.w3c.dom.Text;

// GUI CLASS 
public class GUIButtons extends JFrame implements ActionListener, MouseListener
{
    // ATTRIBUTES
    JButton button1, button2;
    JPanel panel1;
    JLabel label1;
    JTextField Name;

    GUIButtons(String title)
    {
        super(title);
        setSize(300,300);

        setLayout(new FlowLayout());

        // BUTTONS
        button1 = new JButton("Click me?");
        button2 = new JButton("CLICK ME!");

        button1.setToolTipText("First Button, Displays a message when clicked");
        button2.setToolTipText("Second Button, Displays a message when clicked");
        
        add(button1);
        add(button2);

        button1.addActionListener(this);
        button2.addActionListener(this); 

        // PANELS
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(Color.RED);
        panel1.setToolTipText("Just a red panel with a label");
        panel1.add(label1 = new JLabel("the panel is here"));

        add(panel1);

        panel1.addMouseListener(this);

        // LABELS
        label1 = new JLabel("I'm a label");
        label1.setToolTipText("Just a label");
        add(label1);

        // TEXT FIELDS
        Name = new JTextField("Name");
        Name.setToolTipText("Please type your name here");
        add(Name);

        Name.addActionListener(this);

        // SHOW THE BUTTONS, TEXT FIELDS, ETC
        setVisible(true);

    }

    // USER RESULTS TO A PERFORMED ACTION
    public void actionPerformed(ActionEvent e)
    {
        // BUTTON EVENTS
        if (e.getSource() == button1)
        {
            JOptionPane.showMessageDialog(this, "Button 1 clicked");
            System.out.println("button was clicked"); 

        }
        else if (e.getSource() == button2)
        {
            JOptionPane.showMessageDialog(this, "Button 2 clicked");
            System.out.println("button was clicked"); 
        }
        
        if (e.getSource() == Name)
        {
            // TEXT EVENTS 
            String Name1 = Name.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + Name1);
            System.out.println("You Entered: " + Name1);
        }
    }

    // MOUSE EVENTS
    public void mouseEntered(MouseEvent e) 
    {
        if (e.getSource() == panel1)
        {
            JOptionPane.showMessageDialog(this, "Mouse entered the panel");
            System.out.println("Mouse entered the panel");
        }   
    }

    public void mouseExited(MouseEvent e) 
    {
        if (e.getSource() == panel1)
        {
            JOptionPane.showMessageDialog(this, "Mouse left the panel");
            System.out.println("Mouse left the panel");
        }
    }

    public void mouseClicked(MouseEvent e)
    {
        if (e.getSource() == panel1)
        {
            JOptionPane.showMessageDialog(this, "Panel was clicked");
            System.out.println("Panel was clicked");
        }
    }
}
