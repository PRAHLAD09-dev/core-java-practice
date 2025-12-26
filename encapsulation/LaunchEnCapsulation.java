class BankAccount
{
    private String accountNumber;
    private double balance ;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount)
     {
        if(amount >0)
        {
            balance += amount;
        }
    }
     public void withdraw(double amount)
     {
        if(amount >0 && amount <= balance)
        {
            balance -= amount;
        }
    }

     @Override
     public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
     }
    
}

class LaunchEncapsulation
{
    public static void main(String[] args)
    {
        BankAccount ba= new BankAccount("1234", 5000);
         
        System.out.println(ba); 
        ba.deposit(2000);
        ba.withdraw(500.05);
        System.out.println(ba);
        
    }
}