package ch06;

public class Student {
    String name; // 이름
    int num; // 학번
    String gender; // 성별
    void study() {
        System.out.println("공부하기");
    }
    void sleeping() {
        System.out.println("잠자기");
    }
    void morning() {
        System.out.println("아침 운동");
    }

    void showInfo() {
        System.out.println("이름은 " + name + "이고, 학번은 " + num + "이고, 성별은 " + gender + "입니다.");
    }

    Student(String name, String gender) {
        this.name = name; // 매개변수로 받은 걸 전역변수에 저장해놔야 생성자가 사라져도 값이 name에 유지가 됨
        this.gender = gender;
    }

    Student(int num, String name, String gender) {
        this(name, gender); // this() : 생성자를 부름
        this.num = num;
    }

}