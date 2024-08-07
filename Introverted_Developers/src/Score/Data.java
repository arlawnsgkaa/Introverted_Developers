package Score;

import java.util.*;

public class Data {
        Map<String, Integer> map = new HashMap<>();

    public void score(String a, int b) {
        map.put(a, b);
        System.out.println(map);
        map.forEach((k, v) -> System.out.println("회차: " + k + " " + v + "점수"));
    }
}