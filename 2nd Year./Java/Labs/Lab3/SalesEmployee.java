// Sub class of Employee
public class SalesEmployee extends Employee
{
    private double commissionEarned;

    public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary,
                         double commissionEarned) 
    {
        super(firstName, surName, staffNumber, annualSalary);
        this.commissionEarned = commissionEarned;
        
    }

    // Calculate payment (overwritting the already existing one) 
    public double calculatePay()
    {
        double payment = (this.getAnnualSalary() / 12) + this.commissionEarned;

        return payment;
    }

}
