package services;

public class Delhivery implements IDeliveryService 
{
    @Override
    public boolean deliverProduct(Double amount) 
    {
      System.out.println("Product delivered through Delhivery and amount paid is " + amount);
     
        return true;
    }

    @Override
    public String getServiceName() 
    {
        return "Delhivery";
    }
}
