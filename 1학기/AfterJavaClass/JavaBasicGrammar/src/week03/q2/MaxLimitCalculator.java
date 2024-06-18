package week03.q2;

public class MaxLimitCalculator extends Calculator {
    // 상속받으면 다시 메서드 안적어줘도 된다


    @Override
    void add(int val) {
        super.add(val);
        if(getValue() > 100) {
            super.value = 100;
        }
    }
}
