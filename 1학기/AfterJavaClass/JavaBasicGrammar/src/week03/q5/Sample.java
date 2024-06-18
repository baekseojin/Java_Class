package week03.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        // 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size()); // 4 출력

        // b는 a가 참조하고 있는 객체를 가르키고 있기때문에 4 출력
    }
}
