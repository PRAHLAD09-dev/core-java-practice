import java.util.Scanner;
class UnderAgeException extends Exception
{
    public UnderAgeException (String msg)
    {
        super(msg);
    }
}
class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }
}


class Application
{    
    int age ;
    public void input()
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter your age :");
        age = scan.nextInt();
        
    }
    public void verify() throws UnderAgeException , OverAgeException
    {
        if(age>=18 && age<=60)
        {
            System.out.println("Proceed with the Application :");
        }
        else if(age<18)
        {
         UnderAgeException uae= new UnderAgeException("Have patience kiddo ! your time will come.");
         System.out.println(uae.getMessage());
         throw uae;
        }
        else
        {  
            
         OverAgeException oae= new OverAgeException("your time is near! rest in home");
         System.out.println(oae.getMessage());
         throw oae;
        
        }
    }
}
class Rto
{  
    public void initiate()
    {   
         
        Application app = new Application();
         int attempts = 0;

        while (attempts < 3) {
            try
             {
                 app.input();
                 app.verify();
                return;
             } 
                catch (UnderAgeException | OverAgeException  e)   
             {
                 System.out.println("Try again !");
                 attempts++;
             }
        }

        System.out.println("You are Blocked! due to age related restrictions.");
    }
}

public class LaunchEH2
{
    public static void main(String[] args)
    {  
        Rto rto= new Rto();
        rto.initiate();
    }
}