class BankAccount1
{
    private String accountNumber;
    private double balance ;

    public BankAccount1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
     public String getAccountNumber() {
         return accountNumber;
     }


     public double getBalance() {
         return balance;
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

     
}
class LaunchEncapsulation1
{
    public static void main(String[] args)
    {
        BankAccount1 ba= new BankAccount1("1234", 5000);
          
        ba.deposit(1500.50);
        ba.withdraw(700.40);
        System.out.println("Account Number : "+ba.getAccountNumber());
        System.out.println("Balance : "+ba.getBalance());
        
    }
}