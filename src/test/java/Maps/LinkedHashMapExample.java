package Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();

        // Adding heterogeneous keys and values
        map.put(1, "One");
        map.put("Two", 2);
        map.put(3.14, true);
        map.put('A', null);
        map.put(null, "NullKey");
        map.put("NullValue", null);

        // Printing the map (Maintains insertion order)
        System.out.println(map);
    }

}
