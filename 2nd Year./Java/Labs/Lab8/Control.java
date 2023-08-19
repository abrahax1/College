// Program to practice GUI and storing values from GUI to ArrayList
import java.util.ArrayList;

public class Control 
{
    static ArrayList<Person> people = new ArrayList<Person>();
    public static void main(String[] args)
    {
        // POPULATE ARRAYLIST
        Person p1 = new Person("Abraham", "Izarra", "Caracas");
        Person p2 = new Person("John", "Smith", "Hawaii");
        Person p3 = new Person("Laura", "Moonshine", "Dublin");
        people.add(p1);
        people.add(p2);
        people.add(p3);

        // PRINT SIZE
        System.out.println("Array Size: " + people.size()); 

        // PRINT CONTENTS WITH A LOOP
        for(Person element: people)
        {
            System.out.println(element);
        }
        
        // COPY ARRAYLIST 
        Object copyOfPeople = people.clone();
        System.out.println("\nCOPY:\n" + copyOfPeople);
        
        // GUI
        new GUI("GUI 1", people);
    }
}
