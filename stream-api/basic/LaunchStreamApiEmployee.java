import java.util.*;
import java.util.stream.*;

class Employee 
{
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) 
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return id + " " + name + " " + dept + " " + salary;
    }
}

public class LaunchStreamApiEmployee
{

    public static void main(String[] args) 
    {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Rohit", "IT", 60000),
            new Employee(102, "Virat", "HR", 45000),
            new Employee(103, "Dhoni", "IT", 80000),
            new Employee(104, "Rahul", "Finance", 50000),
            new Employee(105, "Hardik", "IT", 40000)
        );

        System.out.println("=== All Employees ===");
        employees.forEach(System.out::println);

        // filter() → IT department
        System.out.println("\n=== IT Department Employees ===");
        employees.stream()
                 .filter(e -> e.dept.equals("IT"))
                 .forEach(System.out::println);

        // filter + map → names of employees with salary > 50000
        System.out.println("\n=== Employees with salary > 50000 (Names) ===");
        employees.stream()
                 .filter(e -> e.salary > 50000)
                 .map(e -> e.name)
                 .forEach(System.out::println);

        // sorted() → salary ascending
        System.out.println("\n=== Employees sorted by salary (ASC) ===");
        employees.stream()
                 .sorted(Comparator.comparingDouble(e -> e.salary))
                 .forEach(System.out::println);

        // sorted() → salary descending
        System.out.println("\n=== Employees sorted by salary (DESC) ===");
        employees.stream()
                 .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                 .forEach(System.out::println);

        // Terminal operations
        long countIT = employees.stream()
                                .filter(e -> e.dept.equals("IT"))
                                .count();
        System.out.println("\nIT Employees count: " + countIT);

        boolean anyHighSalary = employees.stream()
                                         .anyMatch(e -> e.salary > 90000);
        System.out.println("Any employee salary > 90000? " + anyHighSalary);

        Employee firstIT = employees.stream()
                                    .filter(e -> e.dept.equals("IT"))
                                    .findFirst()
                                    .orElse(null);

        System.out.println("First IT employee: " + firstIT);
    }
}