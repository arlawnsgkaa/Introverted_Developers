package Score;


import Score.Sub_name_score;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Rank {
    Scanner sc = new Scanner(System.in);

    public void Rank_must(Data data, Student_main std){
        boolean flag= true;
        String s_S;
        while (flag) {
            System.out.println("학생 이름을 입력해주세요");
            String name = sc.next();
            for (Student a : std.stuList) {
                if (a.getStudentName().equals(name)) {
                    System.out.println(a.getStudentId()+". 학번 " + "수강생: " + a.getStudentName());
                    System.out.println("필수 과목: " + a.getSubjectList().getFirst());
                    System.out.println("선택 과목: " + a.getSubjectList().get(1));

                    for (String key : data.map.keySet()) {
                        getrsRank( key,data.map.get(key));
                    }

                    flag = false;

                }
            }
        }
    }

    public static void getrsRank( String s, ArrayList<Sub_name_score> score) {
            if (s.equals("1회차")) {
                if (score.get(1).getScore() >= 95) {
                    System.out.println(score.get(0).getName() + " : A");
                } else if (score >= 90) {
                    System.out.println(score + " : B");
                } else if (score >= 80) {
                    System.out.println(score + " : C");
                } else if (score >= 70) {
                    System.out.println(score + " : D");
                } else if (score >= 60) {
                    System.out.println(score + " : F");
                } else {
                    System.out.println("N");
                }
            }

    }

}
