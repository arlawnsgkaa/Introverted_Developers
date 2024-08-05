package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {
    public  void Score_A(){

        ArrayList<Integer> ScoreList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("회차를 입력해 주세요");
        int j = sc.nextInt();
        System.out.println("점수를 기입해주세요");
        int i = sc.nextInt();
        ScoreList.add(i);
    }
    public void Score_B(){

    }


}
