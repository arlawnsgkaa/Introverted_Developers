package Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Score_Data {
    public void score(String a, int b) {
        List<Map<String, Integer>> Score_list = new ArrayList();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(a, b);
        Score_list.add(map);
        System.out.println(Score_list);
    }
}

