// Sub class of Employee
class HourlyEmployee extends Employee
{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, 
                          double hoursWorked, double hourlyRate) 
    {
        super(firstName, surName, staffNumber, annualSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        
    }

    // Calculate payment (overwritting the already existing one)
    public double calculatePay()
    {
        double payment = this.hoursWorked * this.hourlyRate;

        return payment;
    }

}
