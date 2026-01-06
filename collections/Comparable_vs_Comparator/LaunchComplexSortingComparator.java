
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Cricketer
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
    public String toString() {
        return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
    }

}
class AgeComparator implements Comparator<Cricketer> 
{

     @Override
      public int compare(Cricketer c1, Cricketer c2)
     {
         return Integer.compare(c1.age, c2.age);   
     }

 
}  
class NameComparator implements Comparator<Cricketer> 
{

     @Override
      public int compare(Cricketer c1, Cricketer c2)
     {
         return c1.name.compareTo(c2.name);   
     }

 
} 
class AvgComparator implements Comparator<Cricketer> 
{

     @Override
      public int compare(Cricketer c1, Cricketer c2)
     {
         return Double.compare(c1.avg,c2.avg);   
     }

 
} 
public class LaunchComplexSortingComparator
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
 
    //Age wise
    Collections.sort(list,new AgeComparator());
    System.out.println("After sort (Age):");
    System.out.println(list);
    
    //Name wise
    Collections.sort(list,new NameComparator());
    System.out.println("After sort (Name):");
    System.out.println(list);
     
    //Avg wise
    Collections.sort(list,new AvgComparator());
    System.out.println("After sort (Avg):");
    System.out.println(list);
  }
}