import java.util.Scanner;

abstract class Payment
{
    double amount;

    Payment(double amount)
    {
        this.amount = amount;
    }

     abstract public void pay();

     public void receipt()
    {
        System.out.println("Payment of ₹" + amount + " completed");
    }
}

class UPI extends Payment
{
    UPI(double amount)
    {
        super(amount);
    }
       
    @Override
     public void pay()
    {
        System.out.println("Paying ₹" + amount + " using UPI");
    }
}

class CreditCard extends Payment
{
    CreditCard(double amount)
    {
        super(amount);
    }

    @Override
    public void pay()
    {
        System.out.println("Paying ₹" + amount + " using Credit Card");
    }
}

class NetBanking extends Payment
{
    NetBanking(double amount)
    {
        super(amount);
    }

    @Override
     public void pay()
    {
        System.out.println("Paying ₹" + amount + " using Net Banking");
    }
}

class Bank
{   
   public void process(Payment p) 
   {
      p.pay();
      p.receipt();
   }

}

public class LaunchPayment
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Enter payment mode (1-UPI, 2-CreditCard , 3 NetBanking): ");
        int choice = sc.nextInt();

        System.out.println("Enter amount: ");
        double amount = sc.nextDouble();

        Payment p;

        if (choice == 1)
         {
            p = new UPI(amount);
         } 
        if (choice==2) 
        {
            p = new CreditCard(amount);
        }
        else
        {
           p = new NetBanking(amount);   
        }

        bank.process(p);
    }
}