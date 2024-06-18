package ch10;

public class AbstractExam { // 클래스 이름 클릭하고 shift + F6 누르면 클래스명 바꿀 수 있음
    public static void main(String[] args) {
        MyShip myShip = new MyShip("동해선");
        System.out.println(myShip.maxPassengers());
        System.out.println(myShip.maxLuggage());

        myShip.startShip();
    }
}
