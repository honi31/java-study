package org.hufs.racing;

import java.util.Random;

public class CarRacing {
    int carCount;
    int tryCount;
    int[] carPoint;
    public CarRacing(int carCount, int tryCount){
        this.carCount = carCount;
        this.tryCount = tryCount;
        validate(carCount, tryCount);
        carPoint = new int[this.carCount];
    }
    private void validate(int carCount, int tryCount) {
        if (carCount <= 0 || tryCount <= 0)
            throw new IllegalArgumentException();
    }
    public void run(){
        carStartPoint();

        while (tryCount >= 1){
            goStraight();

            tryCount--;
        }
    }
    public void carStartPoint(){
        for (int i=0; i<carCount; i++){
            carPoint[i] = 1; //1,1,1
        }
    }

    public void goStraight(){
        Random random = new Random();
        for(int i=0; i<carCount; i++){
            int randomNum = random.nextInt(10);
            if (randomNum >= 4){
                carPoint[i] = carPoint[i] + 1;
            }
        }
    }


    }

