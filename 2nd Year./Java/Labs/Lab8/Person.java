// Class to create a person object 
public class Person 
{
    private String firstName;
    private String surName;
    private String city; 

    // CONSTRUCTOR
    public Person(String firstName, String surName, String city)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.city = city;
                
    }

    // PRINT 
    public String toString()
    {
        return ("First Name: " + this.firstName + " Surname: " + this.surName + " City: " + this.city);
        
    }

    // GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
