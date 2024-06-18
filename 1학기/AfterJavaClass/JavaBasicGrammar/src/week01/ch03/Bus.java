package week01.ch03;

public class Bus {
    private String number;
    private int passengetCount;
    private int money;

    public Bus(String number) { // alt + insert -> constructor
        this.number = number;
    }

    public void take(int money) {
        this.passengetCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println(number + "번 버스의 누적 승객 수는 " + passengetCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
