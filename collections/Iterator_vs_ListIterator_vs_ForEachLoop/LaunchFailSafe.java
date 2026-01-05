import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFailSafe
{  
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<Integer> al= new CopyOnWriteArrayList<>();          // Demonstration of FAIL-SAFE behavior using CopyOnWriteArrayList
                                                                                 // Modifying collection during iteration DOES NOT throw exception
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

    System.out.println(" === Iterator Demo ===");
    
    // Iterator behaves FAIL-SAFE here due to CopyOnWriteArrayList  
     Iterator<Integer> itr = al.iterator();
                                                               // Iterator is fail-fast, structural modification causes ConcurrentModificationException
      while(itr.hasNext())
     {
       System.out.println(itr.next());
                 
       // al.add(44);  // uncomment to observe modification during iteration
     }
        System.out.println("After Iteration: "+ al);
    
     System.out.println(" === ListIterator Demo===");

     // ListIterator allows traversal + modification
      ListIterator<Integer> litr = al.listIterator(al.size());

      while(litr.hasPrevious())
     {
       System.out.println(litr.previous());
       al.add(50);   // Allowed: ListIterator supports safe modification during iteration ConcurrentModificationException
     }
        System.out.println("After ListIteration: "+ al);

      System.out.println(" === For-Each Loop Demo ===");
      // For-each internally uses Iterator (still safe here)
        for (Integer i : al)
        { 
           System.out.println(i);
        }
    }

}

/*
Summary:
- Iterator / ListIterator are FAIL-FAST by default
- CopyOnWriteArrayList makes them FAIL-SAFE
- Modification during iteration is allowed
*/