package Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(35);
        set.add(25);
        set.add(5);
//        set.add(null); // null value is not acceptable
                        // Homogeneous data can be stored
                        // Provide the sorted data in aces ending order
        set.add(500);
//        set.add(null);
        System.out.println(set);

    }
}
