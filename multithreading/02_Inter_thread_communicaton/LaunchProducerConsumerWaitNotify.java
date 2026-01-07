class Queue 
{
    private int data;
    private boolean flag = false;

    synchronized void produce(int value) throws InterruptedException 
    {
        while (flag) 
        {
            wait();
        }
        data = value;
        System.out.println("Produced: " + data);
        flag = true;
        notifyAll();
    }

    synchronized void consume() throws InterruptedException 
    {
        while (!flag) 
        {
            wait();
        }
        System.out.println("Consumed: " + data);
        flag = false;
        notifyAll();
    }
}

class Producer implements Runnable 
{
    private Queue queue;

    Producer(Queue queue) 
    {
        this.queue = queue;
    }

    public void run() 
    {
        int i = 1;
        try 
        {
            while (i <= 5) 
            {
                queue.produce(i++);
            }
        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable 
{
    private Queue queue;

    Consumer(Queue queue) 
    {
        this.queue = queue;
    }

    public void run() 
    {
        try 
        {
            for (int i = 1; i <= 5; i++) 
            {
                queue.consume();
            }
        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        }
    }
}

public class LaunchProducerConsumerWaitNotify
{
    public static void main(String[] args) 
    {
        Queue queue = new Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}