package Maps;

import java.util.TreeMap;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeMap<Object, Object> map = new TreeMap<>();
        map.put(1, 31);
        map.put(6, "41");
        map.put(5, 21);
        map.put(2, 22);
        map.put(3, 23);
        map.put(4, 24);
        map.put(7, null);


        System.out.println(map);
    }
}
