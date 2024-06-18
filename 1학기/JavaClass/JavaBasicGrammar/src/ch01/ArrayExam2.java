package ch01;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] str = new String[3]; // 참조 자료형(클래스)
        str[0] = "Hello";
        str[1] = "Java";
        str[2] = "World";

        // iter(단축키)
        for(String s:str) { // for(자료형 : 배열이름)
            System.out.println(s);
        }
    }
}
