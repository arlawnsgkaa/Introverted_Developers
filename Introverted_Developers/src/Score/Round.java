package Score;


import Student.Student;
import Student.Student_main;
import java.util.ArrayList;
import java.util.Scanner;


public class Round {
    public static void RoundInput(Data data, Student_main std) {
        Scanner sc = new Scanner(System.in);

        for(Student a : std.stuList) {
            ArrayList<ArrayList<String>> S_list = a.getSubjectList();
            System.out.println(S_list);

            while (true) {
                if (data.map.size() < 10) {
                    System.out.println("회차를 입력해 주세요");
                    String s_1 = sc.next();
                    System.out.println("과목 선택");
                    System.out.println("필수 과목 : " + S_list.get(0));
                    System.out.println("선택 과목 : " + S_list.get(1));

                    String s_2 = sc.next();

                    if (s_2.equals(S_list.get(0).get(0))) {
                        System.out.println("점수를 입력해주세요");
                        int i = sc.nextInt();
                        data.score(s_1, i);

                    } else if ((s_2.equals(S_list.get(0).get(1)))) {
                        System.out.println("점수를 입력해주세요");
                        int i = sc.nextInt();
                        data.score(s_1, i);

                    } else if ((s_2.equals(S_list.get(0).get(2)))) {
                        System.out.println("점수를 입력해주세요");
                        int i = sc.nextInt();
                        data.score(s_1, i);

                    } else if ((s_2.equals(S_list.get(1).get(0)))) {
                        System.out.println("점수를 입력해주세요");
                        int i = sc.nextInt();
                        data.score(s_1, i);

                    } else if ((s_2.equals(S_list.get(1).get(1)))) {
                        System.out.println("점수를 입력해주세요");
                        int i = sc.nextInt();
                        data.score(s_1, i);

                    } else {
                        System.out.println("과목명이 정확히 일치 하지 않습니다.");
                    }

                    System.out.println("이전 페이지로 넘어갈려면 END을 입력해 주세요.");
                } else {
                    System.out.println("시험은 10회차까지 있습니다");
                    break;
                }
                String end = sc.next();
                if (end.equals("END")) {
                    break;
                }
            }
        }
    }
}

