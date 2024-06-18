package ch05;

public class StaticExam {
    public static void main(String[] args) {
        Student s1;

        System.out.println(Student.group);

        Student.group = "embedded";
        System.out.println(Student.group);

        System.out.println(Student.school);
        // Student.school = "busan"; -> final로 선언된 변수는 값을 바꿀 수 없다
    }
}
