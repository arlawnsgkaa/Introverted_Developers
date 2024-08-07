package Score;

import java.util.*;

public class Data {

    Set<String> listMapInsert  = new HashSet<>();
    Map<String, ArrayList<Sub_name_score>> map = new HashMap<>();
   // ArrayList<ArrayList<String>> D_list = new ArrayList<>();
    ArrayList<Sub_name_score> Q_list = new ArrayList<>();

    public void score(String round, String Sub_name, int Sub_score) {
        map.put(round, new ArrayList<>());
        map.get(round).add(new Sub_name_score(Sub_name,Sub_score));
        map.forEach((k, v) -> System.out.println("과목: " + k + " " + v + "점수"));

    }
}