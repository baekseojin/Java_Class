package week01.ch03;

public class Subway implements take {
    private int number;
    private int passengerCount;
    private int money;
    @Override
    public void take(int money) {
        this.passengerCount++;
        this.money += money;

    }

    public Subway(int number) {
        this.number = number;
    }
    @Override
    public void showInfo() {
        System.out.println(number + "번 지하철의 누적 승객 수는 " + passengerCount + "이고, 수입은 " + money + "원 입니다.");
    }
}
