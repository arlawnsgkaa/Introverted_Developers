package Score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Subject_Act {
    public int i;
    Set<Integer> uniques_must = new HashSet<>();
    Set<Integer> uniques_choice = new HashSet<>();
    ArrayList<Integer> Subject_ID = new ArrayList<Integer>();
    ArrayList<String> Subject_Name_M = new ArrayList<String>();
    ArrayList<String> Subject_Name_C = new ArrayList<String>();
    final String[] Sub_must = {"1. Java", "2. 객체 지향", "3. Spring", "4. JPA", "5. MySQL"};
    final String[] Sub_choice = {"1. 디자인 패턴", "2. Spring Security", "3. Redis", "4. MongoDB", "5. 선택안함"};
    Subject sub = new Subject();

    public void Subject_Act(Student student) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 101; i <= 105; i++) {
            Subject_ID.add(i);
        }

        boolean p = true;

        while (p) {
            System.out.println("3가지 필수과목과 2가지 선택과목을 고르십시오");
            String Subject_Type = "필수";
            System.out.println("필수 과목");
            for (int i = 0; i < 3; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.println(Arrays.toString(Sub_must));
                    num = sc.nextInt();
                    if (num < 1 || num > 5) {
                        System.out.println("없는 과목입니다. 다시 선택하세요");
                    } else if (uniques_must.add(num)) {
                        validInput = true;
                        switch (num) {
                            case 1:
                                Subject_Name_M.add("Java");
                                break;
                            case 2:
                                Subject_Name_M.add("객체 지향");
                                break;
                            case 3:
                                Subject_Name_M.add("Spring");
                                break;
                            case 4:
                                Subject_Name_M.add("JPA");
                                break;
                            case 5:
                                Subject_Name_M.add("MySQL");
                                break;
                        }
                    } else {
                        System.out.println("이미 선택된 과목입니다. 다시 선택하세요");
                    }
                }
            }

            uniques_must.clear();
            String Subject_Type_S = "선택";
            System.out.println("선택 과목");

            System.out.println("선택을 안하려면 5번을 선택해주세요");
            for (i = 0; i < 2; i++) {
                boolean validInput2 = false;
                while (!validInput2) {
                    System.out.println(Arrays.toString(Sub_choice));
                    num = sc.nextInt();
                    if (num < 1 || num > 5) {
                        System.out.println("없는 과목입니다. 다시 선택하세요");
                    } else if (uniques_choice.add(num)) {
                        validInput2 = true;
                        switch (num) {
                            case 1:
                                Subject_Name_C.add("디자인 패턴");
                                break;
                            case 2:
                                Subject_Name_C.add("Spring Security");
                                break;
                            case 3:
                                Subject_Name_C.add("Redis");
                                break;
                            case 4:
                                Subject_Name_C.add("MongoDB");
                                break;
                            case 5:
                                i = i + 2;
                                break;
                            default:
                                System.out.println("없는 과목입니다");
                                break;
                        }
                    } else System.out.println("이미 선택한 과목입니다. 다시 선택하세요");

                }

            }

            student.getSubjectList().add(Subject_Name_M);
            student.getSubjectList().add(Subject_Name_C);

            System.out.println("과목 선택이 완료 되었습니다");
            p = false;
            uniques_choice.clear();
        }
    }
}