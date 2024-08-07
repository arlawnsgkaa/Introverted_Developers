package Score;


import java.util.Scanner;

public class Rank {
    Scanner sc = new Scanner(System.in);

    public void Rank_must(Data data, Student_main std) {
        while (true) {
            System.out.println("학생 이름을 입력해주세요");
            String name = sc.next();
            for (Student a : std.stuList) {
                if (a.getStudentName().equals(name)) {
                    System.out.println(a.getStudentId() + ". 학번 " + "수강생: " + a.getStudentName());
                    System.out.println("필수 과목: " + a.getSubjectList().getFirst());
                    System.out.println("선택 과목: " + a.getSubjectList().get(1));


                    for (String key : data.map.keySet()) {
                        getrsRank(key, data.map.get(key));
                    }


                }
            }
        }
    }

    public static void getrsRank(String s, int score) {
        if (s.equals("1회차")) {
            if (score >= 95) {
                System.out.println("A");
            } else if (score >= 90) {
                System.out.println("B");
            } else if (score >= 80) {
                System.out.println("C");
            } else if (score >= 70) {
                System.out.println("D");
            } else if (score >= 60) {
                System.out.println("F");
            } else {
                System.out.println("N");

            }
        }
    }

    public static String getesRank(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "F";
        } else {
            return "N";
        }
    }
}
