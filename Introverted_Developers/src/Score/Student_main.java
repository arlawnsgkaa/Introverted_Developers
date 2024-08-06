package Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student_main {
    Subject sub = new Subject();
    Subject_Act subjectAct = new Subject_Act();
    Scanner sc = new Scanner(System.in);

    Student stud = new Student();
    ArrayList<Integer> Student_Id = new ArrayList<Integer>();

    ArrayList<String> Student_Name = new ArrayList<>();
    ArrayList<ArrayList<String>> Subject_Name = new ArrayList<>();
    ArrayList<StudentInfo> students = new ArrayList<>();

    private static int id = 1;

    public void Std(Student stud) {

        while (true) {
            System.out.println("수강생 이름 작성: ");
            String name = sc.next();
            Student_Name.add(name);
            System.out.println("조회 하기전" + Student_Name);

            if (!Student_Name.equals(null)) {
                Student_Id.add(id);
                id = id + 1;
            }

            subjectAct.Subject_Act(sub);
            Subject_Name.add(subjectAct.Subject_Name_M);
            Subject_Name.add(subjectAct.Subject_Name_C);

            stud.Student(Student_Id.get(id - 2), Student_Name.get(id - 2), Subject_Name);
            StudentInfo studentInfo = new StudentInfo(id-1, name, Subject_Name);
            students.add(studentInfo);


            System.out.println("End 입력시 등록종료!");
            String a = sc.next();
            if (a.equals("End")) {
                break;
            }
        }

//        std.getStudentId();
//        std.getSubjectList();


    }

    public void selectST(Student stud) {
        int STid = stud.getStudentId();
        ArrayList<ArrayList<String>> SBname = stud.getSubjectList();

        System.out.println("조회" + Student_Name);

        System.out.print("수강생 이름을 입력하세요: ");

        String st = sc.next();

        if(Student_Name.contains(st)){
            for (StudentInfo studentInfo : students) {
                if (studentInfo.getStudentName().equals(st)) {
                    System.out.println("학번 : " + studentInfo.getStudentId());
                    System.out.println("이름 : " + studentInfo.getStudentName());
                    System.out.println("수강 과목(필수)  : " + studentInfo.getSubjectList().get(0));
                    System.out.println("수강 과목(선택)  : " + studentInfo.getSubjectList().get(1));
                    return;
                }
            }
            System.out.println("학생을 찾을 수 없습니다.");

        }
    }

}


