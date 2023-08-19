// Program to create a guess the number game with a GUI 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GuessNumberGame extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;

    // ATTRIBUTES 
    JButton button1, button2;
    JLabel label1;
    JTextField Guess;

    private int randomNumber, numberOfGuesses = 1;
    private int Guess1;
    private boolean clicked = false;

    GuessNumberGame(String title)
    {
        super(title);
        setSize(300, 300); // Width & Height

        setLayout(new FlowLayout());

        // BUTTONS
        button1 = new JButton("Generate the random number");
        button1.setToolTipText("First Button, Creates a random number when clicked");
        add(button1);
        button1.addActionListener(this);

        // LABELS
        label1 = new JLabel("Then make a guess..");
        label1.setToolTipText("Just a label");
        add(label1);

        // TEXT FIELDS
        Guess = new JTextField("Enter your Guess");
        Guess.setToolTipText("Please type your guess here");
        add(Guess);
        Guess.addActionListener(this);

        // BUTTONS
        button2 = new JButton("Check your guess");
        button2.setToolTipText("Second Button, Checks if you guess the correct number when clicked");
        add(button2);
        button2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        // BUTTON 1 EVENTS
        if (e.getSource() == button1)
        {
            clicked = true;
            JOptionPane.showMessageDialog(this, "Generating random number");

            this.randomNumber = (int)(101 * Math.random());
            JOptionPane.showMessageDialog(this, "Random number, Generated"); 

            System.out.println("Random Number, Generated: " + randomNumber); 

        }

        // TEXTFIELD EVENTS 
        if (e.getSource() == Guess)
        {
            // ERROR CHECKING
            if (clicked == false)
            {
                JOptionPane.showMessageDialog(this, "Please generate number first");
            
            }
            else
            {
                boolean errorChecking = true;

                // ERROR CHECKING
                while (errorChecking == true)
                {
                    try 
                    {
                        this.Guess1 = Integer.parseInt(Guess.getText());
                    }
                    catch(Exception ex)
                    {                
                        JOptionPane.showMessageDialog(this, "Please enter a number"); 
                        
                    }
                    finally
                    {
                        errorChecking = false;
                        JOptionPane.showMessageDialog(this, "You entered: " + Guess1);
                        System.out.println("You Entered: " + Guess1);
                    }
                }
            }
        }

        // BUTTON 2 EVENTS
        if (e.getSource() == button2)
        {
            // ERROR CHECKING
            if (clicked == false)
            {
                JOptionPane.showMessageDialog(this, "Please generate number first");
            }
            else
            {
                System.out.println("button was clicked"); 

                if (this.randomNumber == this.Guess1)
                {
                    JOptionPane.showMessageDialog(this, "Well done! Your guess of " + this.Guess1 + " is equal to " + this.randomNumber + " and it took you " + this.numberOfGuesses + " guesses");
                    this.numberOfGuesses = 1;
                }
                else if (this.Guess1 > this.randomNumber)
                {
                    JOptionPane.showMessageDialog(this, "Your guess of " + this.Guess1 + " is too high. Guess again");
                    this.numberOfGuesses++;
                }
                else if (this.Guess1 < this.randomNumber)
                {
                    JOptionPane.showMessageDialog(this, "Your guess of " + this.Guess1 + " is too low. Guess again");
                    this.numberOfGuesses++;
                }
            }

        }
        
    }

}
