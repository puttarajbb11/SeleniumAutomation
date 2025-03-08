package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(15);
        set.add(25);
        set.add(35);
        set.add(45);
        set.add(55);
        set.add(65);
        set.add(null);
        set.add("Puttaraja");

        System.out.println(set);

        for (Object e : set) {
            System.out.print(e + " ");
        }

    }
}
