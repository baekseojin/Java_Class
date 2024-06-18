package ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterStream {
    public static void main(String[] args) {
        // 문자 단위로 쪼개서 보냄
        BufferedReader br = new BufferedReader( new InputStreamReader( (System.in) ) ); // 문자 단위로 받을 때

        try {
            String a = br.readLine();
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


// 시작 -> 사용자가 예상하는 위치를 받아옴 -> 위치 확인 -> 닷컴을 제거함(맞으면)      -> 닷컴이 안남아있으면 -> 점수 출력 -> 끝
//                                              -> 생물 제거함(요소 3개 다 제거하면)

// 1차원 맵이라고 가정한다
