import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student_main {
    Subject sub = new Subject();
    Subject_Act subjectAct = new Subject_Act();
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> Student_Id = new ArrayList<Integer>();
    ArrayList<String> Student_Name = new ArrayList<String>();

    public void Std() {
        // Student 객체 생성
        Student std = new Student();
        int id = 1;
//

        //입력 값 저장


        while (true) {
            System.out.println("수강생 이름 작성: ");
            String name = sc.next();
            Student_Name.add(name);

            if (!Student_Name.equals(null)) {
                Student_Id.add(id);
                id = id + 1;
                System.out.println(Student_Id);
            }

            subjectAct.Subject_Act();
            sub.getSub_id();
            String subject = sub.getSub_name();

            std.Student(Student_Id.get(id - 2), Student_Name.get(id - 2), subject);

            System.out.println("End 입력시 등록종료!");
            String a = sc.next();
            if (a.equals("end")) {
                break;
            }
        }

//        std.getStudentId();
//        std.getSubjectList();


    }

    public void selectST() {
        String st = sc.next();
        if(st.equals(Student_Name.contains(st))){
            System.out.println(Student_Name);
        }
    }
}

