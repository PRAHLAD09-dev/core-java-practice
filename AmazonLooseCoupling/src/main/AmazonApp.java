package main;
import java.util.Scanner;
import services.*;

public class AmazonApp 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Delivery Partner:");
        System.out.println("1. FedEx");
        System.out.println("2. BlueDart");
        System.out.println("3. Delhivery");

        int choice = sc.nextInt();

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        IDeliveryService deliveryService;

        if (choice == 1) 
        {
            deliveryService = new FedEx();
        } 
        else if (choice == 2)
        {
            deliveryService = new BlueDart();
        }
        else 
        {
            deliveryService = new Delhivery();
        }

        Amazon amazon = new Amazon(deliveryService);
        amazon.placeOrder(amount);

        sc.close();
    }
}