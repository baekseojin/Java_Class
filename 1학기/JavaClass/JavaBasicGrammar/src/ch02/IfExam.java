package ch02;

public class IfExam { // 클래스 명은 항상 대문자로 시작해야 한다
    public static void main(String[] args) {
        int a = args.length; // 0
        if(a == 0) {
            System.out.println("명령형 매개변수를 입력하세요");
        }
        else if (a == 1) {
            System.out.println("입력된 매개변수는 " + args[0] + "입니다.");
        }
        else if (a == 2) {
            System.out.println("입력된 명령형 매개변수는 " + args[0] + ", " + args[1] + "입니다.");
        }
        else {
            System.out.println("2개까지만 입력하세요.");
        }
    }
}
