package ch10;

public abstract class Ship { // 추상 클래스(class 앞에 "abstract" 를 붙여준다)
    public abstract int maxPassengers();
    public abstract int maxLuggage(); // 최대 적재량

    public void startShip() {
        System.out.println("배가 출항합니다");
    }

}
