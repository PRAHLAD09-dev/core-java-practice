class Vehicle
{
    int speed;
    int wheels;
    

    public Vehicle(int speed, int wheels) {
        this.speed = speed;
        this.wheels = wheels;
    }

    void start()
    {
        System.out.println("Vehicle is starting");
    }

    void stop()
    {
        System.out.println("Vehicle is stopping");
    }
}
class Car extends Vehicle
{
    String fuelType;
    

    public Car(int speed, int wheels, String fuelType) {
        super(speed, wheels);
        this.fuelType = fuelType;
    }


    void carDetails()
    {
        System.out.println("Car speed: " + speed);
        System.out.println("Car wheels: " + wheels);
        System.out.println("Fuel type: " + fuelType);
    }
}
class Bike extends Vehicle
{
    boolean hasKickStart;

    public Bike(int speed, int wheels, boolean hasKickStart) {
        super(speed, wheels);
        this.hasKickStart = hasKickStart;
    }

    void bikeDetails()
    {
        System.out.println("Bike speed: " + speed);
        System.out.println("Bike wheels: " + wheels);
        System.out.println("Kick start available: " + hasKickStart);
    }
}
public class LaunchInheritance
{
    public static void main(String[] args)
    {
        Car car = new Car(120,4,"Petrol");
        // car.speed = 120;
        // car.wheels = 4;
        // car.fuelType = "Petrol";

        car.start();
        car.carDetails();
        car.stop();

        System.out.println("****************");

        Bike bike = new Bike(90,2,true);
        // bike.speed = 90;
        // bike.wheels = 2;
        // bike.hasKickStart = true;

        bike.start();
        bike.bikeDetails();
        bike.stop();
    }
}