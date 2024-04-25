package main.java.com.ohgiraffers.section03;

import java.util.ArrayList;
import java.util.List;

public class Application01 {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        OilCar oilCar = new OilCar();

        // 다형성
        List<ParkingCar> parkingCar = new ArrayList<>();
        parkingCar.add(electricCar);
        parkingCar.add(oilCar);

        for (int i = 0; i < parkingCar.size(); i++) {
            parkingCar.get(i).parking();
        }

        for (ParkingCar p: parkingCar) {
            p.parking();
        }

        electricCar.run();
        electricCar.charge();

        oilCar.run();
        oilCar.charge();

    }
}
