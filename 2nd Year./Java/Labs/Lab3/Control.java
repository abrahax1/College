// main class to practice inheritance
public class Control 
{
    public static void main(String[] args)
    {
        Employee E1 = new Employee("Abraham", "Izarra", 123456, 40000);
        System.out.println(E1.toString() + ", Monthly Salary: " + E1.calculatePay());

        HourlyEmployee E2 = new HourlyEmployee("John", "Smith", 13579, 0, 40, 12);
        System.out.println(E2.toString() + ", Salary: " + E2.calculatePay());

        SalesEmployee E3 = new SalesEmployee("Amanda", "Lee", 24680, 14000, 30000);
        System.out.println(E3.toString() + ", Salary: " + E3.calculatePay());

    }
}
