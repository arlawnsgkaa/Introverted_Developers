package Score;

import java.util.Scanner;

public class Round {

    public static void RoundInput(Data data) {
        Scanner sc = new Scanner(System.in);


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
    }
}
