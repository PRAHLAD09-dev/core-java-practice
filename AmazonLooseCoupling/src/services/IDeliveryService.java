package services;

public interface IDeliveryService 
{
    boolean deliverProduct(Double amount);

    String getServiceName();
}