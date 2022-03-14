public class InsufficientFundsException extends Exception {
    private final double amt;
    public InsufficientFundsException(double amt) {
        this.amt = amt;
        System.out.printf("Sorry, but your account is short by: $%.2f",amt);
    }

    public double getAmount()
    {
        return amt;
    }
}