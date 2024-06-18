package week03.q2;

public class Q2Exam {
    public static void main(String[] args) {
        /*
        객체변수 value가 100 이상의 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자.
        즉 다음과 같이 동작해야 한다.
        단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator 클래스를 상속해서 만들어야 한다.
         */
        MaxLimitCalculator cal1 = new MaxLimitCalculator();
        cal1.add(50);
        cal1.add(60);
        System.out.println(cal1.getValue()); // 100 출력
    }
}
