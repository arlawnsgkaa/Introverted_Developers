
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
     static List<Integer>  subject_score = new ArrayList<Integer>();

    static List<Integer> student_number = new ArrayList<Integer>();
    // 수강생관리

    //점수관리
    public static void scoreManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("==================================");
            System.out.println("점수 관리 실행 중...");
            System.out.println("1. 수강생의 과목별 시험 회차 및 점수 등록");
            System.out.println("2. 수강생의 과목별 회차 점수 수정");
            System.out.println("3. 수강생의 특정 과목 회차별 등급 조회");
            System.out.println("4. 메인 화면 이동");
            System.out.print("관리 항목을 선택하세요...");
            int input = sc.nextInt();


            switch (input) {
                case 1 -> createScore(); // 수강생의 과목별 시험 회차 및 점수 등록
                case 2 -> updateRoundScoreBySubject(); // 수강생의 과목별 회차 점수 수정
                /*case 3 -> inquireRoundGradeBySubject(); // 수강생의 특정 과목 회차별 등급 조회*/
                case 4 -> flag = false; // 메인 화면 이동
                default -> {
                    System.out.println("잘못된 입력입니다.\n메인 화면 이동...");
                    flag = false;
                }
            }
        }
    }

    public static void createScore() {
        String studentId = getStudentId(); // 받아옴
        System.out.println("수강생 번호 :" + studentId);

        System.out.println("시험 점수를 등록합니다.");
        int answer = sc.nextInt();
        subject_score.add(answer);


        System.out.println("등록 성공!");
    }
    public static String getStudentId() {
        System.out.print("\n관리할 수강생의 번호를 입력하시오...");
        return sc.next();
    }
    public static void updateRoundScoreBySubject() {// 수강생의 과목별 회차 점수 수정
        String studentId = getStudentId(); // 관리할 수강생 고유 번호
        // 기능 구현 (수정할 과목 및 회차, 점수)
        System.out.println("수강생 번호" + studentId);
        System.out.println("시험 점수를 수정합니다...");



    // 클래스 선언 및 필드
public class Student {
    private int studentId; // 수강생 고유 번호
    private String studentName; // 수강생 이름
    private String subjectList; // 과목 목록

    //생성자

    public void Student(int studentId, String studentName, String subjectList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = subjectList;
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
