import java.util.Scanner;
import java.util.TreeMap;

class Passport
{
    private String name;
    private String city;
    private String country;

    public Passport(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport [name=" + name + ", city=" + city + ", country=" + country + "]";
    }
}

public class LaunchTreeMap
{
    public static void main(String[] args)
    {
        Passport pass1 = new Passport("Rohan", "Mumbai", "India");
        Passport pass2 = new Passport("Mohit", "Ranchi", "India");
        Passport pass3 = new Passport("Anil", "Jamshedpur", "India");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(201);
        Integer id3 = Integer.valueOf(301);

        // TreeMap maintains sorted order of keys
        TreeMap<Integer, Passport> tm = new TreeMap<>();
        tm.put(id3, pass3);
        tm.put(id1, pass1);
        tm.put(id2, pass2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter your passport No :");
        Integer userN = scan.nextInt();

        if (tm.containsKey(userN))
        {
            System.out.println("Passport details :");
            System.out.println(tm.get(userN));
        }
        else
        {
            System.out.println("Your data does not match our passport records.");
        }

        scan.close();
    }
}