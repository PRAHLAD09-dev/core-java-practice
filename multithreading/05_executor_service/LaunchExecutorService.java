import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OfficeTask implements Runnable
{
    private String taskName;

    public OfficeTask(String taskName)
    {
        this.taskName = taskName;
    }

    @Override
    public void run()
    {
           System.out.println(Thread.currentThread().getName() + " started " + taskName);
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
         System.out.println(Thread.currentThread().getName() + " completed " + taskName);
    }
}

public class LaunchExecutorService
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(new OfficeTask("Print Invoice"));
        service.execute(new OfficeTask("Generate Report"));
        service.execute(new OfficeTask("Email Client"));
        service.execute(new OfficeTask("Backup Data"));
        service.execute(new OfficeTask("Upload Files"));

        service.shutdown();
    }
}