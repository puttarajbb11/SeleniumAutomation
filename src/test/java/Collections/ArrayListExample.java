package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);

        list.add(45);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(2, 13);
        list.set(3, 25);
        System.out.println(list);
        System.out.println("Printing Array list using for loop ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Printing Array list using for each loop ");
        for (int e : list) {
            System.out.println(e);
        }
        System.out.println(list.contains(5));


        List<String> list1 = new ArrayList<>();
        System.out.println(list1.getClass().getName());

        List<String> list2 = Arrays.asList("Monday", "Tuseday");
        System.out.println(list2);

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list3 = Arrays.asList(array);
        System.out.println(list3);

        List<Integer> list4 = List.of(1, 2, 3);


        List<Integer> list6 = new ArrayList<>(list4);
        list6.add(4);
        list6.add(5);
        list6.add(6);
        list6.add(null);
        list6.add(null);
        list6.add(null);
        list6.add(null);
        list6.add(null);
        list6.addAll(list);
        System.out.println(list6);

        Collections.sort(list);
        list.sort(null) ;


    }
}
