package Score;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Student_main {

    Subject_Act subjectAct = new Subject_Act();
    Scanner sc = new Scanner(System.in);

    ArrayList<String> Student_Name = new ArrayList<>();


    private static int id = 1;



    private final ArrayList<Student> stuList = new ArrayList<>();



    public  ArrayList<Student> getStuList(){
        return  stuList;
    }

    public void Std(Student stud) {

        while (true) {
            System.out.println("수강생 이름 작성: ");
            String name = sc.next();

            Student_Name.add(name);
            System.out.println("조회 하기전" + Student_Name);

            Student st = new Student(id++, name, new ArrayList<>() );
            subjectAct.Subject_Act(st);
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


