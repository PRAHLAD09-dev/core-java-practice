import java.util.*;

public class LaunchListSetMap {

    public static void main(String[] args) {

        System.out.println("===== LIST =====");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);   // duplicate allowed
        list.add(30);
        System.out.println(list); // maintains insertion order

        System.out.println("\n===== SET =====");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);    // duplicate NOT allowed
        set.add(30);
        System.out.println(set); // no guarantee of order

        System.out.println("\n===== MAP =====");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rohan");
        map.put(2, "Rahul");
        map.put(1, "Amit"); // key duplicate → value replace
        System.out.println(map);
    }
}