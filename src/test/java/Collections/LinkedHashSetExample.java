package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Object> set = new LinkedHashSet<>();
        set.add("Puttaraj");
        set.add("Baradeli");
        set.add('B');
        set.add(20);
        set.add(null);
        set.add(null);

        System.out.println(set);
    }
}
