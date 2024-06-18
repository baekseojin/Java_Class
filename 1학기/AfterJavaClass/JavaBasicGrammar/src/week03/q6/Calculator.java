package week03.q6;

public class Calculator {
    Integer value; // 속성, 기본 초기화가 0 or null값으로 초기화 됨
    // Integer value = 0; : 오류나지 않는 코드
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }

}
