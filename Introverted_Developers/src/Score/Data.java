package Score;

import java.util.*;

public class Data {

    Student_main stm = new Student_main();
    List<Map<String, Integer>> listMapInsert  = new ArrayList<>();
    Map<String, Integer> map = new HashMap<String, Integer>();



    public void score(String a, int b) {

        map.put(a, b);
        listMapInsert.add(map);



        if (listMapInsert.size() == 0) {
            listMapInsert.add(map);
        }

        System.out.println("List: " + listMapInsert);
        map.forEach((k, v) -> System.out.println("회차: " + k + " " + v + "점수"));
    }


}