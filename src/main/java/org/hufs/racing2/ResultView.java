package org.hufs.racing2;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    public int maxCarPosition = 0;
    public String maxCarName;

    public void startRacing(List<Car> carSet) {
        for (Car car : carSet) {
            showCurrCarRacing(car);
        }
        System.out.println();
    }

    public void showCurrCarRacing(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i <= car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void findWinnerCarName(List<Car> carSet) {
        for (Car car : carSet) {
            if (car.getPosition() > maxCarPosition) {
                maxCarName = car.getName();
                maxCarPosition = car.getPosition();
            } else if (car.getPosition() == maxCarPosition) {
                maxCarName += ", " + car.getName();
            }
        }
    }
    public void printWinner() {
        System.out.println(maxCarName+"가 최종 우승했습니다.");
    }
}
