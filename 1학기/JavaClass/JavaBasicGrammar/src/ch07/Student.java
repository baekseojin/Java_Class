package ch07;

public class Student {
    private String name; // private : 접근 제어 지시자
    private int grade; // 학년
    private static int count;

    public Student() {
        count++;
    }

    public Student(String name) { // 생성자 오버로딩
        this.name = name;
    }


    public void setName(String name) { // setter를 통해 private 변수에 값을 주입할 수 있음
        this.name = name;
    }

    public String getName() { // getter를 통해 값을 받아옴
        return this.name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static int getCount() {
        return count;
    }
}
