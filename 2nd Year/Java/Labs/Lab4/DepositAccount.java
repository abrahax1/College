class DepositAccount extends Account
{
    private double interestRate;

    public DepositAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance,
                          double interestRate) 
    {
        super(accountName, accountNumber, inCredit, acctBalance);
        this.interestRate = interestRate;
        
    }

    public double withdraw(double takeAmount)
    {
        System.out.println("You cannot withdraw from a deposit account!");
        return 0;
        
    }
    
}
