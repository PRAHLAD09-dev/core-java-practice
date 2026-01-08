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

class SafeCar implements Runnable 
{
    private final Road r1;
    private final Road r2;

    SafeCar(Road r1, Road r2) 
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() 
    {
        Road first = r1.getName().compareTo(r2.getName()) < 0 ? r1 : r2;
        Road second = first == r1 ? r2 : r1;

        synchronized (first) {
            System.out.println(Thread.currentThread().getName() + " locked " + first.getName());
            try 
            { 
                Thread.sleep(2000); 

            } 
            catch (InterruptedException e) 
            {

            }

            synchronized (second) 
            {
                System.out.println(Thread.currentThread().getName() + " locked " + second.getName());
                System.out.println(Thread.currentThread().getName() + " passed safely");
            }
        }
    }
}

public class LaunchTrafficDeadlockPrevention 
{
    public static void main(String[] args) 
    {
        Road north = new Road("North");
        Road east  = new Road("East");
        Road south = new Road("South");
        Road west  = new Road("West");

        Thread car1 = new Thread(new SafeCar(north, east), "Car-1");
        Thread car2 = new Thread(new SafeCar(east, south), "Car-2");
        Thread car3 = new Thread(new SafeCar(south, west), "Car-3");
        Thread car4 = new Thread(new SafeCar(west, north), "Car-4");

        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }
}