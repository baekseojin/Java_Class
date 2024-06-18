package ch15.dotcom;

import java.io.IOException;
import java.util.ArrayList;


public class SimpleDotComGame {
    public static void main(String[] args) {
        // 1. SimpleDotCom 클래스의 인스턴스 만들기
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        // 2. 위치 대입하기
//        int[] location = { 1, 2, 3 };
//        SimpleDotCom.setLocation(location);
        ArrayList<Integer> location = new ArrayList<>();
        simpleDotCom.setLocation(location);
        location.add(1);
        location.add(2);
        location.add(3);

        // 3. 사용자가 추측한 위치를 나타내는 String 변수
        String guess = "2";

        // 4. 3단계에서 만든 변수 전달 : checkYourself()
        String result1 = simpleDotCom.checkYourself("1");
        String result2 = simpleDotCom.checkYourself("1");
        String result3 = simpleDotCom.checkYourself("1");
        // 5. 결과 출력 ( hit / miss )
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

