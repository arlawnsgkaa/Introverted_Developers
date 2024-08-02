

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
