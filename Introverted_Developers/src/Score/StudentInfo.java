package Score;

import java.util.ArrayList;

public class StudentInfo {
    private int studentId;
    private String studentName;
    private ArrayList<ArrayList<String>> subjectList;

    public StudentInfo(int studentId, String studentName, ArrayList<ArrayList<String>> subjectList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = subjectList;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<ArrayList<String>> getSubjectList() {
        return subjectList;
    }
}
