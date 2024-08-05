package Score;

import java.util.ArrayList;
import java.util.Scanner;

public class Score extends Round{
    public  void Score_A(){


        Scanner sc = new Scanner(System.in);
        System.out.println("회차를 입력해 주세요");
        String j = sc.next();
        System.out.println("점수를 기입해주세요");
        int i = sc.nextInt();
        data.score(j, i);
    }
    public void Score_B(){

    }


}
