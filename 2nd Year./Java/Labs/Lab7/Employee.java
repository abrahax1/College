// Extended class to create an employee 
public class Employee extends Person
{
    private Job Job;
    private int personnelNumber;
    private int nextNumber;
    private Date startDate;

    // CONSTRUCTOR
    public Employee(String firstName, String surName, String gender, Date dateOfBirth, Job Job, int personnelNumber, int nextNumber, Date startDate)
    {
        super(firstName, surName, gender, dateOfBirth);
        this.Job = Job;
        this.personnelNumber = personnelNumber;
        this.nextNumber = nextNumber;
        this.startDate = startDate;

        FileProcessor f1 = new FileProcessor("roles.txt");
        f1.openFile();

        f1.writeToFile(firstName, surName);

    }

    // PRINT
    public String toString() 
    {
        String employee = "Name: " + this.getFirstName() + ", Surname: " + this.getSurName() +
                          ", Gender: " + this.getGender() + ", DOB: " + this.getDateOfBirth() + " " +
                          this.Job + ", Personnel Number: " + this.personnelNumber + ", Next Number: " + this.nextNumber + ", Start Date: " + this.startDate;

        return employee;
    }

    // GETTERS & SETTERS
    public Job getJob() 
    {
        return Job;
    }
    public void setJob(Job job) 
    {
        Job = job;
    }
    public int getPersonnelNumber() 
    {
        return personnelNumber;
    }
    public void setPersonnelNumber(int personnelNumber) 
    {
        this.personnelNumber = personnelNumber;
    }
    public int getNextNumber() 
    {
        return nextNumber;
    }
    public void setNextNumber(int nextNumber) 
    {
        this.nextNumber = nextNumber;
    }
    public Date getStartDate() 
    {
        return startDate;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

}
