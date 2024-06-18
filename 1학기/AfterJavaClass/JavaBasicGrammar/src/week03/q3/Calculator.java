package week03.q3;

public class Calculator {
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

    boolean isOdd(int a) {
        if(a%2==0) {
            System.out.println("짝수입니다");
            return true;
        } else {
            System.out.println("홀수입니다");
            return false;
        }
    }
}
