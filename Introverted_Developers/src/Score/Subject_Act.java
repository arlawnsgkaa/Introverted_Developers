package Score;

import java.util.*;

public class Subject_Act {
    public int i;
    Set<Integer> uniques_must = new HashSet<>();
    Set<Integer> uniques_choice = new HashSet<>();
    ArrayList<String> Subject_Name_M = new ArrayList<String>();
    ArrayList<String> Subject_Name_C = new ArrayList<String>();
    ArrayList<Integer> Subject_ID = new ArrayList<Integer>();
    final String[] Sub_must = {"1. Java", "2. 객체 지향", "3. Spring", "4. JPA", "5. MySQL"};
    final String[] Sub_choice = {"1. 디자인 패턴", "2. Spring Security", "3. Redis", "4. MongoDB", "5. 선택안함"};

    public void Subject_Act(Subject sub) {
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
            for (int k = 0; k < 3; k++) {
                sub.Subject(Subject_ID.get(k), Subject_Name_M.get(k), Subject_Type);
            }

            // if 문
            System.out.println("선택 과목");
            String Subject_Type_S = "선택";
            System.out.println("선택을 안하려면 5번을 선택해주세요");

            for (i = 0; i < 2; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.println(Arrays.toString(Sub_choice));
                    num = sc.nextInt();
                    if (num < 1 || num > 5) {
                        System.out.println("없는 과목입니다. 다시 선택하세요");
                    } else if (uniques_choice.add(num)) {
                        validInput = true;
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
                                i = i + 1;
                                break;
                        }
                    } else {
                        System.out.println("이미 선택한 과목입니다. 다시 선택하세요");
                    }
                }
            }
            for (int q = 0; q < 2; q++) {
                sub.Subject(Subject_ID.get(q), Subject_Name_M.get(q), Subject_Type_S);
            }
            System.out.println("과목 선택이 완료 되었습니다");
            p = false;

        }// 전체적인 while 문
    }

} // 생성자

