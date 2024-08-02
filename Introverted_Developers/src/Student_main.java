import javax.security.auth.Subject;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_main {
    public static void main(String[] args) {
        // Student 객체 생성
        Student std = new Student();
//

        //입력 값 저장
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Student_Id = new ArrayList<Integer>();
        ArrayList<String> Student_Name = new ArrayList<String>();


        while (true) {
            int id = sc.nextInt();
            Student_Id.add(id);
            String name = sc.next();
            Student_Name.add(name);
            System.out.println("end 입력시 종료");
            String a = sc.next();
            if (a.equals("end")) {
                break;
            }
            std.Student();
        }

//        std.getStudentId();
//        std.getSubjectList();


    }
}