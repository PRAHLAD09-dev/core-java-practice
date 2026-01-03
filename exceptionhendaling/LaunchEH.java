import java.util.Scanner;

class InvalidCustomerException extends Exception 
{ 
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }

}

class Atm
{
    private int acc=4545;
    private int pw=1234;

    int accountNo;
    int password;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly enter the accountno :");
        accountNo=sc.nextInt();

        System.out.println("Kindly enter the passward :");
        password=sc.nextInt();

    }
    public void verify()  throws InvalidCustomerException 
    {   
        if(acc==accountNo && pw==password)
        {
            System.out.println("Proccess to withdrow cash :");
        }
        else
        {
            InvalidCustomerException ice= new InvalidCustomerException("Invalid creadintials !");
             System.out.println(ice.getMessage());
             throw ice ;
        }


    }
}

class Bank
{
    public void initiate() {
        Atm atm = new Atm();
        int attempts = 0;

        while (attempts < 3) {
            try
             {
                atm.input();
                atm.verify();
                System.out.println("Transaction successful");
                return;
             } 
                catch (InvalidCustomerException e)   
             {
                 System.out.println("Try again !");
                 attempts++;
             }
        }

        System.out.println("You are Blocked!");
    }
}


public class LaunchEH
{ 
    public static void main(String[] args)
    {  
        Bank bank = new Bank();
        bank.initiate();

    }

}