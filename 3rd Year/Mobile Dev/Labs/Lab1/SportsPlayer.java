public class SportsPlayer implements PrintValues
{
    private int yearOfBirth;
    private String category;
    private String country;
    static int count;

    // Constructor
    public SportsPlayer(int yearOfBirth, String category, String country)
    {
        this.yearOfBirth = yearOfBirth;
        this.category = category;
        this.country = country;
        count += 1;

    }

    // Print
    public String toString()
    {
        String SportsPlayer = "Year of birth: " + this.getYearOfBirth() + ", category: " + this.getCategory() +
        ", country: " + this.getCountry();

        return SportsPlayer;
    }

    // Getters & Setters
    public int getYearOfBirth() 
    {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) 
    {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCategory() 
    {
        return this.category;
        
    }

    public void setCategory(String category) 
    {
        this.category = category;
       
    }

    public String getCountry() 
    {
        return this.country;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }
    
    public void ShowNationality() 
    {
        System.out.println("Country: " + this.getCountry() + "\n");
        
    }

    public void ShowAge() 
    {
        int Age = 2021 - this.getYearOfBirth();
        System.out.println("Age: " + Age + "\n");

    }

    public static void getCount() 
    {
        System.out.println("Players added: " + count); 
    }

}
