public class Control 
{
    public static void main(String[] args) 
    {
        TestHashSet mySet = new TestHashSet();
        
        mySet.addEntry("vatican city");
        mySet.printSet();

        mySet.matchEntry("de");
        mySet.matchEntry("Spain");
         
        mySet.clearSet();
        mySet.addEntry("NEW SET");
        mySet.printSet();

        mySet.sortSet();

    }
}
