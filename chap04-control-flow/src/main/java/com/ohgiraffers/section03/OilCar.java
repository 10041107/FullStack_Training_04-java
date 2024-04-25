package main.java.com.ohgiraffers.section03;

public class OilCar extends Car implements ParkingCar {

    @Override
    String charge() {
        return "기름 꿀꺽";
    }

    @Override
    public void parking() {
        System.out.println(this.getClass()+" parking~~!");
    }
}
