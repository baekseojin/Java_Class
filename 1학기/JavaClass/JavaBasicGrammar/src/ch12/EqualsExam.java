package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        Student s1 = new Student(1, "choi");
        Student s2 = new Student(1, "choi");
        // System.out.println( s1.equals(s2) ); // 객체의 메모리 주소가 달라서 false 출력

        String str1 = "busan";
        String str2 = "busan";
        System.out.println( str1.equals(str2) ); // 값이 같기 때문에 true 출력
        System.out.println(str1 == str2); // ture

        String str3 = new String("software");
        String str4 = new String("software");

        System.out.println( str3.equals(str4) ); // ture
        System.out.println(str3 == str4); // false

        // new를 이용해 객체를 생성하면
    }
}
