package ch04;

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

}

