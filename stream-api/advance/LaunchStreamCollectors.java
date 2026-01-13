import java.util.*;
import java.util.stream.Collectors;

class EmployeeRecord
{
    int id;
    String name;
    String dept;

    EmployeeRecord(int id, String name, String dept) 
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() 
    {
        return "EmployeeRecord [id=" + id + ", name=" + name + ", dept=" + dept + "]";
    }
}

public class LaunchStreamCollectors
{

    public static void main(String[] args) 
    {

        List<EmployeeRecord> employees = Arrays.asList(
                new EmployeeRecord(1, "Rohan", "IT"),
                new EmployeeRecord(2, "Aman", "HR"),
                new EmployeeRecord(3, "Neha", "IT"),
                new EmployeeRecord(4, "Pooja", "Finance")
        );

    
        List<String> names = 
                   employees.stream()
                            .map(e -> e.name)
                            .collect(Collectors.toList());
        System.out.println("Names List: " + names);

        
        Map<String, List<EmployeeRecord>> groupByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(e -> e.dept));

        System.out.println("\nEmployees grouped by department:");
        System.out.println(groupByDept);
    }
}