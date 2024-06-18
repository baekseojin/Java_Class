package ch05;

public class Student {
    String name;
    static String group = "SW"; // 객체를 생성하지 않고 사용하는 속성 : static
    final static String school = "Busan software meister"; // final을 붙인 변수는 한 번 정의하면 값이 바뀌지 않음

    void showInfo() {
        System.out.println("이름은 " + name + "이고, 학과는 " + group + "입니다.");
    }
}
