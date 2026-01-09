import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CalculationTask implements Callable<Integer>
{
    private int num;

    public CalculationTask(int num)
    {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception
    {
        System.out.println(Thread.currentThread().getName()
                + " calculating square of " + num);
        Thread.sleep(2000);
        return num * num;
    }
}

public class LaunchCallableFuture
{
    public static void main(String[] args) throws Exception
    {
        ExecutorService service = Executors.newFixedThreadPool(3);

        Future<Integer> f1 = service.submit(new CalculationTask(5));
        Future<Integer> f2 = service.submit(new CalculationTask(10));
        Future<Integer> f3 = service.submit(new CalculationTask(15));

        System.out.println("Result 1: " + f1.get());
        System.out.println("Result 2: " + f2.get());
        System.out.println("Result 3: " + f3.get());

        service.shutdown();
    }
}