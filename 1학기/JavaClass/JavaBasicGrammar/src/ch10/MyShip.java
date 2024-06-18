package ch10;

public class MyShip extends Ship {

    private String name;

    public MyShip(String name) {
        this.name = name;
    }
    @Override // 상위 메소드를 들고와서 새롭게 정의 : 오버라이딩
    public int maxPassengers() {
        return 100;
    }

    @Override
    public int maxLuggage() {
        return 1000;
    }

    // 뭔가를 강제하고 싶을 때는 abstract로 묶는다

}
