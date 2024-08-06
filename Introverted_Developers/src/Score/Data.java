package Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    public void score(String a, int b) {
       List<Map<String, Integer>> listMapInsert  = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(a, b);
        listMapInsert.add(map);
    }

}
