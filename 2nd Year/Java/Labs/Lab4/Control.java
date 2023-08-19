// Simple Program to create a bank account with deposit/withdraw, error messages and other things
public class Control 
{
    public static void main(String[] args) throws Exception 
    {
        // Deposit
        Account A1 = new Account("Abe", 12345, true, 40);
        System.out.println(A1.deposit(60));
        System.out.println("-------------------------");
        
        // Withdraw
        DepositAccount A2 = new DepositAccount("John", 13689, true, 50, 0);
        A2.withdraw(30);
        System.out.println("-------------------------");

        // Withdraw + Penalty amount
        CurrentAccount A3 = new CurrentAccount("Maria", 24681, true, 100, 0);
        A3.withdraw(50);
        System.out.println("-------------------------");

        // in-out credit
        CurrentAccount A4 = new CurrentAccount("Leonard", 213456, true, 100, 10);
        A4.checkCredit();
        System.out.println("-------------------------");

        // Wanrning 
        CurrentAccount A5 = new CurrentAccount("Pepe", 145325, true, 50, 20);
        A5.checkCredit("Check warning");
        System.out.println("-------------------------");

        // Check account name + balance
        Account A6 = new Account("Abe", 12345, true, 40);
        A6.getDetails();
        System.out.println("-------------------------");
        
        // Check account balance
        Account A7 = new Account("Abe", 123567, true, 50);
        A7.validatedAccount();
        System.out.println("-------------------------");

        Account A8 = new Account("Juan", 45786, true, 100);
        System.out.println(A8.toString());
        System.out.println("-------------------------");

        Account A9 = new Account("Sinead", 45231, true, 800);
        System.out.println(A9.toString());      
        System.out.println("-------------------------");

        Account A10 = new Account("Laura", 12345, true, 900); 
        System.out.println(A10.toString());
    }
}
