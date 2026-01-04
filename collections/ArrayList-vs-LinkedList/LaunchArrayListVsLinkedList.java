import java.util.*;

public class LaunchArrayListVsLinkedList {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Add at beginning
        arrayList.add(0, 5);   // costly (shifting)
        linkedList.add(0, 5);  // fast (node change)

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Access by index
        System.out.println("ArrayList get(2): " + arrayList.get(2)); // fast
        System.out.println("LinkedList get(2): " + linkedList.get(2)); // slow
    }
}