package org.hufs.racing2;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    public int tryCount;
    public String nameOfCar;
    public List<Car> carSets;

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
        carSets = new ArrayList<>();
        for (String name : carsArray) {
            carSets.add(new Car(name)); // name 인자만 쓰기 위해 답안지처럼 Car 생성자2개를 만들었습니다.
        }
    }

    public List<Car> getCarSet() {
        return carSets;
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
        for (int i = 0; i < carSets.size(); i++) {
            Car currentCar = carSets.get(i);
            if (randomNum()) {
                currentCar.goStraight();
            }
        }
    }

}





