package org.hufs.racing2;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    public int tryCount;
    public String nameOfCar;
    public List<Car> carSet;

    public CarRacing(String nameOfCar, int tryCount) {
        this.nameOfCar = nameOfCar;
        this.tryCount = tryCount;
        String[] carsArray = makeArray(nameOfCar);
        prepareCars(carsArray);
    }

    public String[] makeArray(String nameOfCar) {
        return nameOfCar.split(",");
    }

    public void prepareCars(String[] carsArray) {
        carSet = new ArrayList<>();
        for (String name : carsArray) {
            carSet.add(new Car(name)); // name 인자만 쓰기 위해 답안지처럼 Car 생성자2개를 만들었습니다.
        }
    }

    public List<Car> getCarSet() {
        return carSet;
    }

    public boolean randomNum() {
        Random random = new Random();
        int randnum = random.nextInt(10);

        if (randnum >= 4) {
            return true;
        }
        return false;
    }

    public void goCar() {
        for (int i = 0; i < carSet.size(); i++) {
            Car currentCar = carSet.get(i);
            if (randomNum()) {
                currentCar.goStraight();
            }
        }
    }

}





