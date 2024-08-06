package Score;

import java.util.Scanner;

public class Round {

    static public Round_Data RD = new Round_Data();

    public static void RoundInput() {


    public static void RoundInput(Data data) {
        Scanner sc = new Scanner(System.in);

        System.out.println("회차를 입력해 주세요");
        String s = sc.next();
        System.out.println("몇 회차 인지 입력해 주세요");
        int i = sc.nextInt();
        RD.round(s, i);



        while (true) {
            if(data.map.size() < 10) {
                System.out.println("회차를 입력해 주세요");
                String s = sc.next();
                System.out.println("점수를 입력해주세요");
                int i = sc.nextInt();
                data.score(s, i);

                System.out.println("이전 페이지로 넘어갈려면 END을 입력해 주세요.");
            }else{
                System.out.println("시험은 10회차까지 있습니다");
                break;
            }
                String end = sc.next();
            if (end.equals("END")) {
                break;
            }
        }



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
}
