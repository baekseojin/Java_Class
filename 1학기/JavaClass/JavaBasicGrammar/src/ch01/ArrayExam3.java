package ch01;

public class ArrayExam3 {
    public static void main(String[] args) {
        int a[];
        int[] b;
        int[] c = {31, 32, 33}; // 공간 3개 만듦
        a = new int[4]; // 공간 4개 만듦
        b = new int[] {21,22,23,24}; // 공간 4개
        c = b; // b의 주소를 c가 받음 => c가 b 배열객체를 가르킴 / c 배열의 크기는 4
        System.out.println(a.length + " " + b.length + " " + c.length); // 4 4 4 출력
    }
}
