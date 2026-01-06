
import java.util.ArrayList;
import java.util.Collections;

class Cricketer implements Comparable<Cricketer> 
{
    int age;
    String name;
    double avg;

    Cricketer(int age, String name, double avg) 
    {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

     @Override
      public int compareTo(Cricketer c)
     {
         return  Integer.compare(this.age, c.age);   // age ascending
     }

 
    @Override
    public String toString() {
        return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }
}
public class LaunchComplexSortingcomparable
{

  public static void main(String[] args)
  {
    Cricketer c1 = new Cricketer(35,"Virat",88.8);
    Cricketer c2 = new Cricketer(34,"Rohit",68.8);
    Cricketer c3 = new Cricketer(40,"Dhoni",78.8);

    ArrayList<Cricketer> list= new ArrayList<>();
    list.add(c1);
    list.add(c2);
    list.add(c3);
  
    System.out.println("Before sort:");
    System.out.println(list);
 
    Collections.sort(list);
 
    System.out.println("After sort:");
    System.out.println(list);
  }
}