package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main {
    Subject sub = new Subject();
    Subject_Act subjectAct = new Subject_Act();
    Scanner sc = new Scanner(System.in);


    private final ArrayList<Student> stuList = new ArrayList<>();
//    ArrayList<Integer> Student_Id = new ArrayList<Integer>();
//    ArrayList<String> Student_Name = new ArrayList<>();
//    ArrayList<ArrayList<String>> Subject_Name = new ArrayList<>();


    private static int id = 1;
    public  ArrayList<Student> getStuList(){
        return  stuList;
    }
    public void Std(Student stud) {
        // Score.Student 객체 생성
        Student std = new Student();

        //입력 값 저장


        while (true) {
            System.out.println("수강생 이름 작성: ");
            String name = sc.next();
//            Student_Name.add(name);

//            if (!Student_Name.equals(null)) {
//                Student_Id.add(id);
//                id = id + 1;
//            }
            Student st = new Student(id++, name, new ArrayList<>() );
            subjectAct.Subject_Act(st);
//            Subject_Name.add(subjectAct.Subject_Name_M);
//            Subject_Name.add(subjectAct.Subject_Name_C);
//            stud.Student(Student_Id.get(id - 2), Student_Name.get(id - 2), Subject_Name);
            stuList.add(st);

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


        ArrayList<String> subjectList = new ArrayList<String>();

        System.out.print("수강생 이름을 입력하세요: ");
        String st = sc.next();
        for (Student a: stuList) {
            if(a.getStudentName().equals(st)){

                int STid = a.getStudentId();
                String STname = a.getStudentName();

                ArrayList<ArrayList<String>> SBname = a.getSubjectList();
                System.out.println("학번 : "+STid);
                System.out.println("이름 : "+STname);
                System.out.println("수강 과목(필수)  : "+SBname.get(0));
                System.out.println("수강 과목(선택)  : "+SBname.get(1));


            }
        }

    }
}

