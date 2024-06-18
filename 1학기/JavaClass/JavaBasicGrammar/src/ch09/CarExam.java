package ch09;


public class CarExam {
    public static void main(String[] args) {
        Car k3 = new Car("white", "kia", "k3");


        k3.showInfo();
        k3.startCar();
        k3.speedUp();
        k3.stopCar();
        System.out.println();

        Taxi taxi = new Taxi("black", "tesla", "model 3");

        taxi.startMeter();
        taxi.stopMeter();

        Truck truck = new Truck("blue", "hyundai", "bongo");

        truck.load();
        truck.offload();
    }
}
