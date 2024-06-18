package ch16.generic2;

public class Powder implements Material {
    @Override
    public void doPrinting() {
        System.out.println("파우더로 출력합니다");
    }

    @Override
    public String toString() {
        return "재료는 powder입니다.";
    }
}
