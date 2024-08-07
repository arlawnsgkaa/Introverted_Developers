package Score;

import Student.Student;

import java.util.*;

public class Data {

    Set<String> listMapInsert  = new HashSet<>();
    Map<String, ArrayList<Sub_name_score>> map = new HashMap<>();
   // ArrayList<ArrayList<String>> D_list = new ArrayList<>();
    ArrayList<Sub_name_score> Q_list = new ArrayList<>();

    public void score(String name, int round, String Sub_name, int Sub_score) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(new Sub_name_score(round, Sub_name, Sub_score));
        map.forEach((k, v) -> System.out.println("학생이름 : " + k + " " + v ));
    }
}