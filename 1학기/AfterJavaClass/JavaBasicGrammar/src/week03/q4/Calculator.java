package week03.q4;

public class Calculator {
    /*
    다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가해 보자.
     */
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] a) {
        int sum = 0;
        for(int i=0; i < a.length; i++) {
            sum += a[i];
        }
        return sum/a.length;
    }
}

