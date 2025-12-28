// Payment.java
class Payment 
{

    public void pay(double amount)
     {
        System.out.println("Processing payment of ₹" + amount);
     }
}
// UPI.java
class UPI extends Payment 
{

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
// CreditCard.java
class CreditCard extends Payment
 {

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
// NetBanking.java
class NetBanking extends Payment 
{

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}


// Bank.java
class Bank 
{

    public void permit(Payment p) 
    {
        System.out.println("Bank is processing payment...");

        // p.pay(500);
        // p.pay(1500);
        // p.pay(2500);
        int[] amounts = {500, 1500, 2500};
        for(int amt : amounts) 
        {
           p.pay(amt);
        }

    }
}
// LaunchBank.java
public class LaunchPayment
{

    public static void main(String[] args) 
    {
        
        // UPI upi = new new UPI();
        // CreditCard cc= new CreditCard();
        // NetBanking nb = new NetBanking();
        Bank bank = new Bank();
        

        bank.permit(new UPI());
        bank.permit(new CreditCard());
        bank.permit(new NetBanking());
    }
}