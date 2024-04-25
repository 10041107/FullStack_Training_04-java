package main.java.com.ohgiraffers.section03;

public class ElectricCar extends Car implements ParkingCar {

    @Override
    String charge() {
        
        return "전기 꿀꺽";
    }

    @Override
    public void parking() {
        System.out.println(this.getClass()+" parking~~!");
    }
}
