import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet 
{
    HashSet<String> countries = new HashSet<String>(20);
    private String[] euContries = {"Albania", "Andorra", "Austria", "Belarus", "Belgium","Bosnia Herzegovina", 
                                   "Bulgaria", "Croatia", "Cyprus", "Czech Republic",  "Denmark", "Estonia",    
                                   "Hungary",  "Iceland",  "Ireland",  "Italy",  "Kosovo",  "Latvia",  "Liechtenstein", 
                                   "Lithuania",  "Luxemburg",  "Macedonia",  "Malta",  "Moldova",  "Monaco",  
                                   "Montenegro",  "Norway",  "Poland", "Portugal", "Romania", "Russia", "San Marino", "Serbia", 
                                   "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "the Netherlands", "the United Kingdom", 
                                   "Turkey", "Ukraine"};

    // CONSTRUCTOR 
    public TestHashSet()
    {
        for(String element: euContries)
        {
            countries.add(element);
        }
  
    }

    public void printSet()
    {
        Iterator<String> setElements = countries.iterator();
        while (setElements.hasNext())
        {
            System.out.println(setElements.next());
        }
        
    }

    public void addEntry(String newCountry)
    {
        countries.add(newCountry);
    }

    public void matchEntry (String matchCountry)
    {
        boolean check = false;
        Iterator<String> setElements = countries.iterator();

        while (setElements.hasNext())
        {
            if(matchCountry.equals(setElements.next()))
            {
                check = true;
            }

            // System.out.println(setElements.next());
        }

        if(check == true)
        {
            System.out.println("\nTrue\n");
        }
        else
        {
            System.out.println("\nFalse\n");
        }
         
    }

    public void clearSet()
    {
        countries.clear();
    }

    public void sortSet()
    {
        String[] orderedArray = new String[countries.size()];

        countries.toArray(orderedArray);

        Arrays.sort(orderedArray);

        for(String element : orderedArray)
        {
            System.out.println(element);
        }

    }
}
