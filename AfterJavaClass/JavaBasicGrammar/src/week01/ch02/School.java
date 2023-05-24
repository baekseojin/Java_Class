package week01.ch02;

public class School {
    private static School instance = new School(); // 자기 자신 안에서 미리 객체를 생성
    private School() {

    }

    public static School getInstance() {
        if(instance == null) {
            instance = new School();
        }
        return instance; // 미리 생성한 객체를 리턴
    }
}
