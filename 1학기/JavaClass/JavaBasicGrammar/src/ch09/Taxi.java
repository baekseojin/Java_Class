package ch09;

public class Taxi extends Car {
    // 하위 클래스에서는 상위 클래스 생성자를 부른다. 무조건
    private int meter;

    public Taxi(String color, String company, String model) {
        super(color, company, model); // 하위 클래스에서 상위 클래스를 부를 땐 super() 키워드를 쓴다
    }

    public void startMeter() {
        meter++;
        System.out.println("미터기를 올립니다.");
        startCar();
        System.out.println("택시가 출발합니다.");

    }

    public void stopMeter() {
        System.out.println("미터기를 멈추다.");
        stopCar();
    }

}
