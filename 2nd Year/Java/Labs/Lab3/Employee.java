// Program to practice inheritance 
public class Employee 
{
    private String firstName;
    private String surName;
    private int staffNumber;
    private double annualSalary;

    // Constructor
    public Employee(String firstName, String surName, int staffNumber, double annualSalary)
    {
        this.firstName = firstName;
        this.surName = surName; 
        this.staffNumber = staffNumber; 
        this.annualSalary = annualSalary;
    }

    // calculate monthly salary
    public double calculatePay()
    {
        double monthlySalary = this.annualSalary / 12;
        return monthlySalary;

    }

    // print method
    public String toString()
    {
        String output = "Name: " + this.firstName + ", Surname: " + this.surName + 
                        ", Staff Number: " + this.staffNumber + ", Annual Salary: " + this.annualSalary;
    
        return output;
    }

    // Getters and setters
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

    public int getStaffNumber() 
    {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) 
    {
        this.staffNumber = staffNumber;
    }

    public double getAnnualSalary() 
    {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) 
    {
        this.annualSalary = annualSalary;
    }

}
