public class CheckingAccount{
    private int accNum;
    private double bal;

    public CheckingAccount(int accNum)
    {
        this.accNum = accNum;
        this.bal = 0;
    }

    public CheckingAccount(int accNum, double bal)
    {
        this.accNum = accNum;
        this.bal = bal;
    }
    public void deposit(double amt) throws Exception
    {
        if(amt<0)
        {
            throw new Exception("cannot deposit negative amount!");
        }
        this.bal += amt;
    }

    public void withdraw(double amt) throws InsufficientFundsException
    {
        if(this.bal < amt)
        {
            throw new InsufficientFundsException(amt-this.bal);
        }
        this.bal -= amt;
    }

    public double getbalance()
    {
        return this.bal;
    }

    public int getNumber()
    {
        return this.accNum;
    }
}
