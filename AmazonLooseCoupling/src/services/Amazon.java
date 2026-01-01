package services;

public class Amazon 
{

    private IDeliveryService deliveryService;

    public Amazon(IDeliveryService deliveryService) 
    {
        this.deliveryService = deliveryService;
    }

    public void placeOrder(double amount) 
    {

        System.out.println("Order placed on Amazon");
        System.out.println("Using delivery partner: "
                + deliveryService.getServiceName());

        boolean status = deliveryService.deliverProduct(amount);

        if (status) 
        {
            System.out.println("Order delivered successfully.");
        }
         else 
        {
            System.out.println("Delivery failed...");
        }
    }
}
