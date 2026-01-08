class Road 
{
    private final String name;

    Road(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
}

class Car implements Runnable 
{
    private final Road from;
    private final Road to;

    Car(Road from, Road to) 
    {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() 
    {
        synchronized (from) 
        {
            System.out.println(Thread.currentThread().getName() + " locked " + from.getName());

            try 
            { 
                Thread.sleep(2000); 
            } 
            catch (InterruptedException e) 
            {

            }

            System.out.println(Thread.currentThread().getName() + " waiting for " + to.getName());

            synchronized (to) 
            {
                System.out.println(Thread.currentThread().getName() + " passed from " + from.getName() + " to " + to.getName());
            }
        }
    }
}

public class LaunchTrafficDeadlock 
{
    public static void main(String[] args) 
    {
        Road north = new Road("North Road");
        Road east  = new Road("East Road");
        Road south = new Road("South Road");
        Road west  = new Road("West Road");

        Thread car1 = new Thread(new Car(north, east),  "Car-1");
        Thread car2 = new Thread(new Car(east, south),  "Car-2");
        Thread car3 = new Thread(new Car(south, west),  "Car-3");
        Thread car4 = new Thread(new Car(west, north),  "Car-4");

        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }
}