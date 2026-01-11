@FunctionalInterface
interface Calculator 
{
    int operate(int a, int b);
}

public class LaunchFunctionalInterface 
{
    public static void main(String[] args) 
    {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
         
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + sub.operate(a, b));
    }
}