package Score;

import java.util.*;

public class Score_Data {
    public void score(String a, int b) {
        List<Map<String, Integer>> Score_list = new ArrayList();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(a, b);
        Score_list.add(map);
        System.out.println(Score_list);
    }
public class Data {
    List<Map<String, Integer>> listMapInsert = new ArrayList();
    Map<String, Integer> map = new HashMap<>();

    public void score(String a, int b) {
        map.put(a, b);

        if (listMapInsert.size() == 0) {
            listMapInsert.add(map);
        }

        System.out.println("List: " + listMapInsert);
        map.forEach((k, v) -> System.out.println("MAP: " + k + " " + v + "점수"));
    }

}
}

