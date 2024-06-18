package ch16;

public class NullPointExam {
    public static void main(String[] args) {
        // 참조하는게 아무것도 없을 경우 NullPointerException 에러 발생

        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException 에러
        } catch (NullPointerException npe) {
            System.out.println(npe); // log 남기기
        } finally {
            System.out.println("무조건 실행");
        }

    }
}
