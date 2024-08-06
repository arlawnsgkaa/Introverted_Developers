
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    static List<Integer>  subject_score = new ArrayList<>();
    static List<Integer> student_number = new ArrayList<>();
    // 수강생관리

    private int studentId; // 수강생 고유 번호
    private String studentName; // 수강생 이름
    private String subjectList; // 과목 목록

    //생성자

    public void Student(int Id, String Name, String List) {
        this.studentId = Id;
        this.studentName = Name;
        this.subjectList = List;

    }



    // 메서드

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubjectList() {
        return subjectList;
    }

}