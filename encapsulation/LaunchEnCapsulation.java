class BankAccount
{
    private String accountNumber;
    private double balance ;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

     public String getAccountNumber() 
    {   
        return accountNumber;
    }
    public double getBalance() 
    {   
        return balance;
    }

    public void setBalance(double amount) {
        
        if(amount >0)
        {
            balance += amount;
        }
    }
    
}

class LaunchEnCapsulation
{
    public static void main(String[] args)
    {
        BankAccount ba= new BankAccount("1234", 5000);
        ba.setBalance(2000);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
    }
}