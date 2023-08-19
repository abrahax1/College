// Class to create a person 
public class Person 
{
    private String firstName;
    private String surName; 
    private String gender;
    private Date dateOfBirth;

    // CONSTRUCTOR
    public Person(String firstName, String surName, String gender, Date dateOfBirth)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;

    }

    // GETTERS & SETTERS
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getSurName() 
    {
        return surName;
    }
    public void setSurName(String surName) 
    {
        this.surName = surName;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    public Date getDateOfBirth() 
    {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }
    
}
