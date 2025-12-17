class Bank
{
    double amount;

    Bank(double amount)
    {
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount)
    {
        String message = (withdrawalAmount <= amount)
                ? "Withdrawal successful"
                : "Insufficient balance";

        System.out.println(message);


        amount = (withdrawalAmount <= amount)
                ? amount - withdrawalAmount
                : amount;
    }

    void deposit(double depositAmount) 
    {
        amount += depositAmount;
        System.out.println("After deposit, available balance: " + amount);
    }

    public static void main(String[] args)
    {
        Bank b = new Bank(10000);

        b.withdraw(5000);

        b.deposit(5000);
    }
}
