package week03.q4;

public class Q4Exam {
    public static void main(String[] args) {
        /*
        다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가해 보자.
         */
        int[] data = { 1,3,5,7,9 };
        Calculator cal = new Calculator();

        int result = cal.avg(data);
        System.out.println(result);
    }
}
