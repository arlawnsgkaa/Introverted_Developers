package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Round extends Rank{

    public static void RoundInput() {
        ArrayList<String> ScoreList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("필수과목 점수 입력: ");
            int score = sc.nextInt();
            ScoreList.add(i + "회 차" + " " + getrsRank(score));
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("선택과목 점수 입력: ");
            int score = sc.nextInt();
            ScoreList.add(i + "회 차" + " " + getesRank(score));
        }

        for(String arr : ScoreList) {
            System.out.println(arr);
        }
    }
}
