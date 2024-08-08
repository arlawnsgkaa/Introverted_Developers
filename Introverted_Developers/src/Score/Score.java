package Score;

import Student.Student_main;
import Student.Student;
import Subject.Subject_Act;

import java.util.ArrayList;
import java.util.Scanner;


public class Score {


    public void Score(Data data, Student_main std, Subject_Act sub) {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름을 입력해주세요");
        String name = sc.nextLine();
        for(String MapKey : data.map.keySet()){
            if(name.equals(MapKey)) {
                Student a = std.getStudentByName(name);
                if(a == null) {return;}
                ArrayList<Sub_name_score> Sub = data.map.get(a.getStudentName());

                System.out.println("과목이름을 입력해주세요");
                String Sub_Name = sc.nextLine();
                for(Sub_name_score Sub_ : Sub) {
                    if(Sub_.getName().equals(Sub_Name)){
                        int grade = sub.Sub_Map.get(Sub_.getName()).equals("M") ? Score_A(Sub_.getScore()) : Score_B(Sub_.getScore());

                    }
                }

            }

        }
        System.out.println(data.map);

    }
    public int Score_A(int Sc_A) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Sc_A = a;
        return Sc_A;
    }
    public int Score_B(int Sc_B) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Sc_B = a;
        return Sc_B;
    }

}


