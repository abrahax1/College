public class Born
{
    private String city;
    private String country;
    private String born;

    // Constructor
    public Born(String city, String country)
    {   
        this.city = city;
        this.country = country;
        this.born = this.city + " " + this.country;

    }

    // Print
    public String toString() 
    {
        return this.born;
    }

    // Getter & Setters
    public String getCity() 
    {
        return this.city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCountry() 
    {
        return this.country;
    }

    public void setCountry(String country) 
    {
        this.country = country;
    }

}
