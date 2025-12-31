abstract class Order 
{
    protected int orderId;
    protected double price;

    Order(int orderId, double price) 
    {
        this.orderId = orderId;
        this.price = price;
    }

    abstract void prepareOrder();

    void printBill()
    {
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Bill: ₹" + price);
    }
}

class OnlineOrder extends Order 
{

    OnlineOrder(int orderId, double price) 
    {
        super(orderId, price);
    }

    @Override
    void prepareOrder() 
    {
        System.out.println("Preparing online food order...");
    }
}

interface DeliveryService 
{
    void deliver();
}
class ZomatoDelivery implements DeliveryService 
{

    @Override
    public void deliver() 
    {
        System.out.println("Order delivered using Zomato Delivery Partner");
    }
}

public class LaunchApp 
{
    public static void main(String[] args)
     {
        Order order = new OnlineOrder(101, 499);
        order.prepareOrder();
        order.printBill();

        System.out.println("**************************");

    
        DeliveryService delivery = new ZomatoDelivery();
        delivery.deliver();
    }
}
