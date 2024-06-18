//package week01.ch03;
//
//public class Person {
//    private String name;
//    private int money; // 가진 돈
//    private boolean transfer;
//
//    public Person(String name, int money) { // alt + insert : 생성자 생성
//        this.name = name;
//        this.money = money;
//        transfer = false; // 초기화는 보통 생성자에서 한다
//    }
//
//    public void takeSubway(Subway subway) {
//        if(money < 1300) {
//            System.out.println("잔액이 부족합니다.");
//            return ;
//        }
//        subway.take(1300); // 지하철을 탐
//        this.money -= 1300;
//        this.transfer = true;
//
//
//    }
//
//    public void showInfo() {
//        System.out.println(name + "의 잔돈은 " + money + "원 입니다.");
//    }
//
//    public void takeBus(Bus bus) {
//        if(transfer) {
//            bus.take(200);
//            this.money -= 200;
//        }
//
//    }
//
//    public void take(Take take) {
//        if(take instanceof Subway) {
//            takeSubway((Subway)take);
//        } else if (take instanceof Bus) {
//            takeBus(Bus(take));
//        }
//    }
//
//    public void takeCar(Car car, int km) {
//        if(car.getLiter() == 0) {
//            System.out.println("기름이 없습니다.");
//            return ;
//        }
//    }
//
//    public void oiling(Car myCar, int t, GasStation suyeong) {
//        this.money -= suyeong.oiling(myCar, liter);
//
//    }
//
//}
