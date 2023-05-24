package week01.ch02;

public class SingleTonExam {
    public static void main(String[] args) {
        // 싱글 톤 패턴 : 이미 생성된 객체를 사용하는 방식 ( 스프링 부트에서 계속 사용 )
        // 사용자가 객체를 생성하는 것이 아닌 스프링이 알아서 객체를 관리
        // 사용자는 getInstance()를 사용하여 생성된 객체만 관리

        School busan = School.getInstance();
        School soft = School.getInstance();

        System.out.println(busan);
        System.out.println(soft);
    }
}
