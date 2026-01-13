import java.util.Arrays;
import java.util.List;

public class LaunchStreamReduceMinMax 
{

    public static void main(String[] args) 
    {

        List<Integer> salaries = Arrays.asList(25000, 30000, 45000, 50000);

        int totalSalary = salaries.stream()
                                  .reduce(0, (a, b) -> a + b);
        System.out.println("Total Salary: " + totalSalary);

        int maxSalary = salaries.stream()
                                .max(Integer::compare)
                                .get();
        System.out.println("Max Salary: " + maxSalary);

        int minSalary = salaries.stream()
                                .min(Integer::compare)
                                .get();
        System.out.println("Min Salary: " + minSalary);
    }
}