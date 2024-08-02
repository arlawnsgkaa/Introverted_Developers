import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Subject_Act {

    public static void Subject_Act() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Subject_Name = new ArrayList<String>();
        ArrayList<Integer> Subject_ID = new ArrayList<Integer>();
        Subject sub = new Subject();

        String[] Sub_must = {"1. Java", "2. 객체 지향", "3. Spring", "4. JPA", "5. MySQL"};
        String[] Sub_choice = {"1. 디자인 패턴", "2. Spring Security", "3. Redis", "4. MongoDB"};
        int num = 0;
        for (int i = 101; i <= 105; i++) {
            Subject_ID.add(i);
        }
        System.out.println("필수, 선택을 고르십시오");
        String Subject_Type = sc.next();
        if (Subject_Type.equals("필수")) {
            Collections.addAll(Subject_Name, Sub_must);
            System.out.println(Subject_Name);
            num = sc.nextInt();
            switch (num) {
                case 1:
                    sub.Subject(Subject_ID.get(0), Subject_Name.get(0), Subject_Type);
                    return;
                case 2:
                    sub.Subject(Subject_ID.get(1), Subject_Name.get(1), Subject_Type);
                    return;
                case 3:
                    sub.Subject(Subject_ID.get(2), Subject_Name.get(2), Subject_Type);
                    return;
                case 4:
                    sub.Subject(Subject_ID.get(3), Subject_Name.get(3), Subject_Type);
                    return;
                case 5:
                    sub.Subject(Subject_ID.get(4), Subject_Name.get(4), Subject_Type);
                    return;
                default:
                    break;
            }
        } else if (Subject_Type.equals("선택")) {
            Collections.addAll(Subject_Name, Sub_choice);
            System.out.println(Subject_Name);
            num = sc.nextInt();
            switch (num) {
                case 1:
                    sub.Subject(Subject_ID.get(0), Subject_Name.get(0), Subject_Type);
                case 2:
                    sub.Subject(Subject_ID.get(1), Subject_Name.get(1), Subject_Type);
                case 3:
                    sub.Subject(Subject_ID.get(2), Subject_Name.get(2), Subject_Type);
                case 4:
                    sub.Subject(Subject_ID.get(3), Subject_Name.get(3), Subject_Type);
            }
        }
    }
}
