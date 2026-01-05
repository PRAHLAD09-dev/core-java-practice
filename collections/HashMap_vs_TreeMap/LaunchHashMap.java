import java.util.HashMap;
import java.util.Scanner;

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
public class LaunchHashMap
{
    public static void main(String[] args)
    {  
        Passport pass1 = new Passport("Rohan", "Mumbai", "india");
        Passport pass2 = new Passport("Mohit", "Ranchi", "India");
        Passport pass3 = new Passport("Anil", "Jamshedour", "India");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(201);
        Integer id3 = Integer.valueOf(301);
        
        // HashMap dose not maintains sorted order of keys
        HashMap<Integer,Passport> hm = new HashMap<>();
        hm.put(id1,pass1);
        hm.put(id2, pass2);
        hm.put(id3, pass3);
      
       Scanner scan = new Scanner(System.in);
       System.out.println("Kindly enter Your passport No :");
       Integer userN= scan.nextInt();
        
         if(hm.containsKey(userN))
         {
            System.out.println("Passport details :");
            System.out.println(hm.get(userN));
         }
         else
         {
            System.out.println("Your data dose not matched with our passpor records.");
         }
         scan.close();
    }
}