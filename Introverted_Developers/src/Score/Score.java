package Score;

import java.util.Scanner;


public class Score {

    public void Score_A(Data data) {

        Scanner sc = new Scanner(System.in);
        System.out.println("회차를 선택해주세여");
        String j = sc.next();
        for(String MapKey : data.map.keySet()){
            if(j.equals(MapKey)) {
                System.out.println(data.map.get(MapKey));
                System.out.println("수정할 점수 기입");
                int i = sc.nextInt();
               // data.map.put(MapKey,i);
            }

        }
        System.out.println(data.map);

    }

}


