package ch02;

// 해당 월별 일 수 출력 단, 2월은 28일 고정
public class SwitchExam {
    public static void main(String[] args) {
        int month = 5;
        int day = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
        }
        System.out.println("이번 달은 " + day + "일 까지 입니다.");
    }
}
