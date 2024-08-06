package Score;

import java.util.Scanner;


public class Score {

    public Score_Data SD = new Score_Data();

    public void Score_A() {

        Scanner sc = new Scanner(System.in);
        System.out.println("필수 과목과 선택 과목을 선택해주세요");
        String j = sc.next();
        System.out.println("점수를 기입해주세요");
        int i = sc.nextInt();
        SD.score(j, i);
    }

    public void Score_B() {




//    public void Score_A(){
//        Data data = new Data();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("회차를 입력해 주세요");
//        String j = sc.next();
//        System.out.println("점수를 기입해주세요");
//        int i = sc.nextInt();
//        data.score(j, i);
//    }


        }
    }
