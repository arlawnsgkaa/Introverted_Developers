package Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round_Data {
    public void round(String a, int b) {
        List<Map<String, Integer>> Round_list  = new ArrayList();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(a,b);
        Round_list.add(map);
        System.out.println(Round_list);
    }

}
