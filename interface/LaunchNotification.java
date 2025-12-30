import java.util.Scanner;

interface Notification
{
    void send(String message);
}

class EmailNotification implements Notification
{
    public void send(String message)
    {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification
{
    public void send(String message)
    {
        System.out.println("SMS sent: " + message);
    }
}

class WhatsAppNotification implements Notification
{
    public void send(String message)
    {
        System.out.println("WhatsApp message sent: " + message);
    }
}

class NotificationService
{
    public void notifyUser(Notification notification , String msg)
    {
        notification.send(msg);
    }
}

public class LaunchNotification
{
    public static void main(String[] args)
    {   
        Scanner scan = new Scanner(System.in);
        NotificationService service = new NotificationService();
        Notification notification;

         System.out.println("Choose Notification Mode :");
         System.out.println("1.Email");
         System.out.println("2.SMS");
         System.out.println("3.Whatsaap");
         int choice = scan.nextInt();
         scan.nextLine();

         System.out.println("Enter Message :");
         String msg = scan.nextLine();
                        
         
         if (choice == 1)
         {  
          notification = new EmailNotification();
         }
         else if (choice == 2)
         {
           notification = new SMSNotification();
         }
         else
         {
         notification = new WhatsAppNotification();
         }

         service.notifyUser(notification, msg);

         scan.close();
    }
}
