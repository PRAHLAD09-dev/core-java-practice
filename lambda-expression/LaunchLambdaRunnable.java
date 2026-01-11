public class LaunchLambdaRunnable 
{
    public static void main(String[] args) 
    {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is running using lambda");
        };

        Thread t1 = new Thread(task, "Worker-1");
        Thread t2 = new Thread(task, "Worker-2");

        t1.start();
        t2.start();
    }
}