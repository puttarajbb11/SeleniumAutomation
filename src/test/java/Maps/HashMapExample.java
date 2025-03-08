package Maps;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("Name", "Puttaraja");
        map.put("Last Name", "Baradeli");
        map.put("Middle Name", 'M');
        map.put("PnoneNumber", 8867);
        map.put("Location", "Banglore");
        map.put(null, null);
//        map.put(null, null);

        System.out.println(map);
        System.out.println(map.get("Location"));

    }
}
