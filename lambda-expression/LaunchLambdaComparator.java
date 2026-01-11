import java.util.*;

class Employee 
{
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) 
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return id + " " + name + " " + salary;
    }
}

public class LaunchLambdaComparator
 {
    public static void main(String[] args) 
    {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Rohit", 50000));
        list.add(new Employee(102, "Virat", 70000));
        list.add(new Employee(103, "Dhoni", 60000));

        list.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Employees sorted by salary:");
        list.forEach(System.out::println);
    }
}