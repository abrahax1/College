class CurrentAccount extends Account
{
    private double penaltyAmount;

    public CurrentAccount(String accountName, int accountNumber, boolean inCredit, double acctBalance,
                          double penaltyAmount) 
    {
        super(accountName, accountNumber, inCredit, acctBalance);
        this.penaltyAmount = penaltyAmount;
       
    }

    public double withdraw(double takeAmount)
    {
        super.withdraw(takeAmount);
        this.penaltyAmount += 10;

        System.out.println("Balance: " + this.getAcctBalance() + " (Penalty Amount: " + this.penaltyAmount + ")");
        return 0;
    }

    public double checkCredit()
    {
        if (this.getAcctBalance() > 0)
        {
            System.out.println("In credit");
        }
        else
        {
            System.out.println("Off credit");
        }
    
        return 0;
    }

    public double checkCredit(String warningMessage)
    {
        if (this.getAcctBalance() < 101)
        {
            System.out.println("Your account has less that 100");
        }
        
        return 0;
    }
}

