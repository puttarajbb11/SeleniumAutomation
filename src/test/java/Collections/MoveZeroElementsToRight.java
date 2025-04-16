package Collections;

import java.util.List;
import java.util.stream.Stream;

public class MoveZeroElementsToRight {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 0, 3, -4 ,- 1, 7, 0, 8, -2, 0, 0);

        List<Integer> moveElements = Stream.concat(list.stream().filter(n -> n != 0).sorted(),
                        list.stream().filter(n -> n == 0))
                .toList();
        System.out.println(moveElements);
    }
}
