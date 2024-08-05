package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Round extends Rank{
    public static Data data = new Data();

    public static void RoundInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("회차를 입력해 주세요");
        String s = sc.next();
        int i = sc.nextInt();
       data.score(s, i);
    /*    for (int i = 1; i <= 10; i++) {
            System.out.print("필수과목 점수 입력: ");
            int score = sc.nextInt();
            ScoreList.add(j + "회 차" + " " + getrsRank(score));
        }



        for (int i = 1; i <= 10; i++) {
            System.out.print("선택과목 점수 입력: ");
            int score = sc.nextInt();
            ScoreList.add(j + "회 차" + " " + getesRank(score));
        }

        for(String arr : ScoreList) {
            System.out.println(arr);
        }

     */
    }

}
