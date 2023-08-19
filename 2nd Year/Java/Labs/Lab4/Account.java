public class Account implements ValidatedAccount
{
    private String accountName;
    private int accountNumber;
    private boolean inCredit;
    private double acctBalance;
    static int currentNumber = 1000;


    // Constructor
    public Account(String accountName, int accountNumber, boolean inCredit, double acctBalance) 
    {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.inCredit = inCredit;
        this.acctBalance = acctBalance;
        setCurrentNumber(currentNumber);
        currentNumber++;

    }

    // Deposit method
    public double deposit(double depAmount)
    {
        this.acctBalance += depAmount;
        
        return this.acctBalance;
    }

    // Withdraw method
    public double withdraw(double takeAmount)
    {
        this.acctBalance -= takeAmount;

        if (this.acctBalance < 0)
        {
            inCredit = false;

        }

        return this.acctBalance;
    }

    // Interface method to get name + balance
    public void getDetails() 
    {
        System.out.println("Name: " + this.accountName + ", Balance: " + this.acctBalance);

    }

    // Interface method to get balance
    public void validatedAccount() 
    {
        System.out.println("Balance: " + this.acctBalance);

    }

    // Getters and Setters
    public String getAccountName() 
    {
        return accountName;
    }

    public void setAccountName(String accountName) 
    {
        this.accountName = accountName;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public boolean isInCredit() 
    {
        return inCredit;
    }

    public void setInCredit(boolean inCredit) 
    {
        this.inCredit = inCredit;
    }

    public double getAcctBalance() 
    {
        return acctBalance;
    }

    public void setAcctBalance(double acctBalance) 
    {
        this.acctBalance = acctBalance;
    }

    public int getCurrentNumber() 
    {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) 
    {
        this.currentNumber = currentNumber;
    }

    public String toString() 
    {
        return "accountName: " + accountName + ", accountNumber: " + accountNumber + ", acctBalance: "
                + acctBalance + ", inCredit: " + inCredit + ", Current Number: " + currentNumber;
    }

}
