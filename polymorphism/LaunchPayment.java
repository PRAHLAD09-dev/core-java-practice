class Payment 
{

    public void pay(double amount)
     {
        System.out.println("Processing payment of ₹" + amount);
     }
}
class UPI extends Payment 
{

    @Override
    public void pay(double amount)
    {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
class CreditCard extends Payment
 {

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
class NetBanking extends Payment 
{

    @Override
    public void pay(double amount) 
    {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

class Bank 
{

    public void permit(Payment p) 
    {
        System.out.println("Bank is processing payment...");

        int[] amounts = {500, 1500, 2500};
        for(int amt : amounts) 
        {
           p.pay(amt);
        }

    }
}

public class LaunchPayment
{

    public static void main(String[] args) 
    {
        
        Bank bank = new Bank();
        

        bank.permit(new UPI());
        bank.permit(new CreditCard());
        bank.permit(new NetBanking());
    }
}