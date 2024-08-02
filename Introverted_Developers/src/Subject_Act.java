import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Subject_Act {

    public void Subject_Act() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Subject_Name_M = new ArrayList<String>();
        ArrayList<String> Subject_Name_C = new ArrayList<String>();
        ArrayList<Integer> Subject_ID = new ArrayList<Integer>();
        Subject sub = new Subject();

        String[] Sub_must = {"1. Java", "2. 객체 지향", "3. Spring", "4. JPA", "5. MySQL"};
        String[] Sub_choice = {"1. 디자인 패턴", "2. Spring Security", "3. Redis", "4. MongoDB"};
        int num = 0;
        for (int i = 101; i <= 105; i++) {
            Subject_ID.add(i);
        }
        boolean p = true;
        while (p) {
            System.out.println("필수, 선택을 고르십시오");
            String Subject_Type = sc.next();
            if (Subject_Type.equals("필수")) {
                Collections.addAll(Subject_Name_M, Sub_must);
                System.out.println(Subject_Name_M);
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        sub.Subject(Subject_ID.get(0), Subject_Name_M.get(0), Subject_Type);
                        break;
                    case 2:
                        sub.Subject(Subject_ID.get(1), Subject_Name_M.get(1), Subject_Type);
                        break;
                    case 3:
                        sub.Subject(Subject_ID.get(2), Subject_Name_M.get(2), Subject_Type);
                        break;
                    case 4:
                        sub.Subject(Subject_ID.get(3), Subject_Name_M.get(3), Subject_Type);
                        break;
                    case 5:
                        sub.Subject(Subject_ID.get(4), Subject_Name_M.get(4), Subject_Type);
                        break;
                    default:
                        System.out.println("없는 과목입니다");
                        break;
                }
                Subject_Name_M.clear();

            } else if (Subject_Type.equals("선택")) {
                Collections.addAll(Subject_Name_C, Sub_choice);
                System.out.println(Subject_Name_C);
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        sub.Subject(Subject_ID.get(0), Subject_Name_C.get(0), Subject_Type);
                        break;
                    case 2:
                        sub.Subject(Subject_ID.get(1), Subject_Name_C.get(1), Subject_Type);
                        break;
                    case 3:
                        sub.Subject(Subject_ID.get(2), Subject_Name_C.get(2), Subject_Type);
                        break;
                    case 4:
                        sub.Subject(Subject_ID.get(3), Subject_Name_C.get(3), Subject_Type);
                        break;
                    default:
                        System.out.println("없는 과목입니다");
                        break;
                }
                Subject_Name_C.clear();

            }
            System.out.println("종료를 원하시면 END를 입력해주세여");
            String s = sc.next();
            if (s.equals("END")) {
                p = false;
            }
        }
    }
}