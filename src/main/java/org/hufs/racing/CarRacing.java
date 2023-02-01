package org.hufs.racing;

import java.util.Random;

public class CarRacing {
    int carCount;
    int tryCount;
    int[] carPoint;
    public CarRacing(int carCount, int tryCount){
        this.carCount = carCount;
        this.tryCount = tryCount;
        carPoint = new int[this.carCount];
    }

    public void Run(){
        CarStartPoint();

        while (tryCount >= 1){
            GoStraight();
            ResultView.ResultCarPoint();
            tryCount--;
        }
    }
    public void CarStartPoint(){
        for (int i=0; i<carCount; i++){
            carPoint[i] = 1; //1,1,1
        }
    }

    public void GoStraight(){
        Random random = new Random();
        for(int i=0; i<carCount; i++){
            int randomNum = random.nextInt(10);
            if (randomNum >= 4){
                carPoint[i] = carPoint[i] + 1;
            }
        }
    }


    }

