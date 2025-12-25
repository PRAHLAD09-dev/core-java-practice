import java.rmi.server.RemoteObjectInvocationHandler;

class Lerner
{
    private int id;
    private String name;
    private String city;

  
 public Lerner(int id, String name, String city) 
    {
        this.id = id;
        this.name = name;
        this.city = city;
    }

 public int getId()
 {
    return id;
 }
 public String getName() 
  {
    return name;
  }

 public String getCity() 
 {
    return city;
 }

 @Override
 public String toString() {
    return "Lerner [id=" + id + ", name=" + name + ", city=" + city + "]";
 }
 

}



public class LaunchLerner 
{
    public static void main (String[] args)
    {  
         Lerner l1 = new Lerner(1, "Rohan", "Bengaluru");
         Lerner l2 = new Lerner(2, "Rohit", "Mumbai");
         System.out.println(l1);
         System.out.println(l2);

   }
}