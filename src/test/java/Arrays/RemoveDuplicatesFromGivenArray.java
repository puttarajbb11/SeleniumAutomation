package Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromGivenArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 3, 4, 3, 5, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(Integer e:arr)
        {
            set.add(e);
        }
        System.out.println(set);
    }
}
