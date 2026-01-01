package services;

public class BlueDart implements IDeliveryService 
{

    @Override
    public boolean deliverProduct(Double amount) 
    {
     System.out.println("Product delivered through BlueDart and amount paid is " + amount);
     
        
        return true;
     }

    @Override
    public String getServiceName() 
    {
    
        return "BlueDart";
    }  
}