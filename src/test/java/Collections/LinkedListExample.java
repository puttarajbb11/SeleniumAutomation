package Collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(2, 25);
        System.out.println(list.get(3));

        List<Integer> list1 = Arrays.asList(130, 80, 90, 100, 110, 120);
        list.addAll(list1);

//        Collections.sort(list);
//        list.sort(null);
//        list.removeIf(Objects::isNull);
//        list.sort(Collections.reverseOrder());
        for (Integer e : list) {
            System.out.print(e + " ");
        }
    }
}