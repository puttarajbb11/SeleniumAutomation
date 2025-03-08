package Maps;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {

        Hashtable<String, String> set = new Hashtable<>();
        set.put("Name", "Puttaraja");
        set.put("Last Name", "Baradeli");
        set.put("Age", "35");
        set.put("Place", "Puttaraja");
        set.put("Location", "Banglore");
//        set.put(null, "pin");
//        set.put("pin", null);

        System.out.println(set);
    }

}
