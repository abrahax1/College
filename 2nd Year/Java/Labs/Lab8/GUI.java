// Program to make a GUI with events, stores entered text from GUI into an array and then displays it 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// GUI CLASS 
public class GUI extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;
    
    // ATTRIBUTES
    JButton Save, showAll, delete;
    JTextField firstName, surName, city;
    JTextArea result;
    String firstName1, surName1, city1; 
    boolean event1 = false, event2 = false, event3 = false;
    ArrayList<Person> people;

    GUI(String title, ArrayList<Person> people)
    { 
        super(title);
        setSize(300,300);
        setLayout(new FlowLayout());

        this.people = people;

        // TEXT FIELDS
        firstName = new JTextField("First name");
        surName = new JTextField("Surname");
        city = new JTextField("City");

        firstName.setToolTipText("Please type your name here");
        surName.setToolTipText("Please type your surname here");
        city.setToolTipText("Please type the city where you are from here");

        add(firstName);
        add(surName);
        add(city);

        firstName.addActionListener(this);
        surName.addActionListener(this);
        city.addActionListener(this);

        // BUTTONS
        Save = new JButton("Save");
        showAll = new JButton("Show all");
        delete = new JButton("Delete all");

        Save.setToolTipText("First Button, Saves data entered into array");
        showAll.setToolTipText("Second Button, Displays all data in array");  
        delete.setToolTipText("Third Button, Deletes all data of array");

        Save.setForeground(Color.BLUE);
        showAll.setForeground(Color.BLUE);
        delete.setForeground(Color.BLUE);

        add(Save);
        add(showAll);
        add(delete);

        Save.addActionListener(this);
        showAll.addActionListener(this); 
        delete.addActionListener(this);

        // RESULT TXT FIELD
        result = new JTextArea("Results");
        add(result);

        // SHOW THE BUTTONS, TEXT FIELDS
        setVisible(true);

    }

    // USER RESULTS TO A PERFORMED ACTION
    public void actionPerformed(ActionEvent e)
    {
        // TEXT EVENTS
        if (e.getSource() == firstName)
        {
            firstName1 = firstName.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + firstName1);
            System.out.println("You Entered: " + firstName1);
            event1 = true;
        }

        if (e.getSource() == surName)
        {
            surName1 = surName.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + surName1);
            System.out.println("You Entered: " + surName1);
            event2 = true;

        }

        if (e.getSource() == city)
        {
            city1 = city.getText();
            JOptionPane.showMessageDialog(this, "You entered: " + city1);
            System.out.println("You Entered: " + city1);
            event3 = true;
        }

        // BUTTON EVENTS
        if (e.getSource() == Save)
        {
            if (event1 == true && event2 == true && event3 == true)
            {
                Person p4 = new Person(firstName1, surName1, city1);
                JOptionPane.showMessageDialog(this, "just added This person is called " + firstName1 + " " + surName1 + " and is from " + city1);
                System.out.println(p4); 
                people.add(p4);
            }
            else
            {
                if (event1 == false)
                {
                    JOptionPane.showMessageDialog(this, "Please enter First Name"); 
                }
                if (event2 == false)
                {
                    JOptionPane.showMessageDialog(this, "Please enter Surname");  
                }
                if (event3 == false)
                {
                    JOptionPane.showMessageDialog(this, "Please enter City");  
                } 
            }
        }
        if (e.getSource() == showAll)
        {
            int i = 1;
            JOptionPane.showMessageDialog(this, "Display data");

            result.setText(""); 

            for(Person element: people)
            {  
                result.append("Result: " + i + " " + element + "\n");
                i++;
            }

            System.out.println("button was clicked"); 
        }
        if (e.getSource() == delete)
        {
            result.setText("Results");
            people.clear();
            JOptionPane.showMessageDialog(this, "All data deleted");
            System.out.println("All data deleted");  
        }
    }
}
