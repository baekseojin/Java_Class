package week03.q1;

public class Q1Exam {
    public static void main(String[] args) {
        /*
        Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자.
        즉 다음과 같이 동작하는 클래스를 만들어야 한다.
         */
        Calculator cal1 = new Calculator();
        cal1.add(10);
        System.out.println(cal1.getValue());

        UpgradeCalculator cal2 = new UpgradeCalculator();
        cal2.add(10);
        cal2.minus(7);
        System.out.println(cal2.getValue());
    }

}
