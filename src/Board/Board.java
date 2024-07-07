package Board;

import java.util.*;

public class Board {
    private Map<Integer, Integer> map = new HashMap<>();

    public Board() {
        // Snakes
        map.put(17, 7);
        map.put(54, 34);
        map.put(62, 19);
        map.put(64, 60);
        map.put(87, 36);
        map.put(93, 73);
        map.put(95, 75);
        map.put(98, 79);

        // Ladders
        map.put(1, 38);
        map.put(4, 14);
        map.put(9, 31);
        map.put(21, 42);
        map.put(28, 84);
        map.put(51, 67);
        map.put(72, 91);
        map.put(80, 99);
    }

    public int getValue(int num) {
        if (map.containsKey(num))
            return map.get(num);

        return -1;
    }
}
