package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Round extends Rank{
    static ArrayList<String> RoundList = new ArrayList<>();
    public static void RoundInput() {

        Scanner sc = new Scanner(System.in);
        System.out.println("회차를 입력해 주세요");
        int j = sc.nextInt();
        if(j>0) {
            RoundList.add(j + "회 차");
        }
        else
        {
            System.out.println("회차에 기입이 이상합니다");
        }
        System.out.println(RoundList.get(j-1));
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
