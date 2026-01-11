import java.util.*;

public class LaunchLambdaForEach
{
    public static void main(String[] args) 
    {

        List<String> languages = Arrays.asList( "Java", "Spring", "Hibernate", "Microservices");

        languages.forEach(lang ->System.out.println("Learning: " + lang));
    }
}