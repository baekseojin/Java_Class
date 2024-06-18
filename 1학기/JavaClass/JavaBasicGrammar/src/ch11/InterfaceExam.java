package ch11;

public class InterfaceExam {
    public static void main(String[] args) {
        TV tv = new TV(); // 인터페이스가 위에 있으면(상위 개념이면) Sound 자료형으로 만들 수 있다
        Radio radio = new Radio();

        tv.soundUp();
        tv.soundUp();
        tv.showInfo();

        // 모든 클래스의 최상위 클래스는 Object
        // 모든 클래스는 Object의 기능을 쓸 수 있다

        tv.equals(radio);
    }
}
