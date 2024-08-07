package Score;


import Student.Student;
import Student.Student_main;
import java.util.ArrayList;
import java.util.Scanner;


public class Round {
    public static void RoundInput(Data data, Student_main std) {
        Scanner sc = new Scanner(System.in);
        // 1. 학생이름 받아오기
        // 2. 학생 객체 선언
        // 3. for을 돌면서 학생 객체를 찾아 2번 객체에 할당해주기
        // 4. for을 다돌고 학생 객체가 null일 경우 roundinput 나가기
        System.out.println("학생의 이름을 입력해주세요");
        String s = sc.nextLine();
        Student a= std.getStudentByName(s);
        if(a==null){return;}
        // 5. While문을 열고 조건문에 data.map.size()<10 때가지 반복 
        while(data.map.size()<10) {
            System.out.println("회차를 입력해 주세요");
            int round = sc.nextInt();
            sc.nextLine();
            System.out.println("필수 과목 : " + a.getSubjectList().get(0));
            System.out.println("선택 과목 : " + a.getSubjectList().get(1));
            String subName_2 = sc.nextLine();

            if(a.getSubjectList().get(0).contains(subName_2)||a.getSubjectList().get(1).contains(subName_2)) {
                System.out.println("점수를 입력해주세요");
                int i = sc.nextInt();
                sc.nextLine();
                data.score(a.getStudentName(), round, subName_2, i);
            }
            else
                System.out.println("그런 과목 없습니다.");
            System.out.println("나가 시려면 0번을 입력해주세요");

            if(sc.nextLine().equals("0"))
            {
                break;
            }
        }
        System.out.println("10회차 입니다.");
      /*  for(Student a : std.stuList) {

            String name = a.getStudentName();
            ArrayList<ArrayList<String>> S_list = a.getSubjectList();
         //   ArrayList<Integer> I_list = new ArrayList<>();
            boolean flag = true;
            while (flag) {
                if (data.map.size() < 10) {
                    if (s.equals(name)) {
                        System.out.println("회차를 입력해 주세요");
                        String s_1 = sc.nextLine();
                        for(int q=0; q<3; q++) {
                            System.out.println("과목 선택");
                            System.out.println("필수 과목 : " + S_list.get(0));
                            System.out.println("선택 과목 : " + S_list.get(1));
                            String subName_2 = sc.nextLine();
                            System.out.println(subName_2);
                            if (subName_2.equals(S_list.get(0).get(0))) {
                                System.out.println("점수를 입력해주세요");
                                int i = sc.nextInt();
                                data.score(s_1, subName_2, i);
                            } else if ((subName_2.equals(S_list.get(0).get(1)))) {
                                System.out.println("점수를 입력해주세요");
                                int i = sc.nextInt();
                                data.score(s_1, subName_2, i);
                            } else if ((subName_2.equals(S_list.get(0).get(2)))) {
                                System.out.println("점수를 입력해주세요");
                                int i = sc.nextInt();
                                data.score(s_1, subName_2, i);
                            } else if ((subName_2.equals(S_list.get(1).get(0)))) {
                                System.out.println("점수를 입력해주세요");
                                int i = sc.nextInt();
                                data.score(s_1, subName_2, i);
                            } else if ((subName_2.equals(S_list.get(1).get(1)))) {
                                System.out.println("점수를 입력해주세요");
                                int i = sc.nextInt();
                                data.score(s_1, subName_2, i);
                            } else {
                                System.out.println("과목명이 정확히 일치 하지 않습니다.");
                            }
                        }
                    } else {
                        System.out.println("시험은 10회차까지 있습니다");
                        break;
                    }
                }
                flag = false;
            }
        }*/

    }
}

