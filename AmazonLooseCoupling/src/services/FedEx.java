package services;

public class FedEx implements IDeliveryService 
{

    @Override
    public boolean deliverProduct(Double amount) 
    {
        System.out.println("Product delivered through FedEx and amount paid is " + amount);
        return true;
    }

    @Override
    public String getServiceName() 
    {
        
        return "FedEx";
    }
}