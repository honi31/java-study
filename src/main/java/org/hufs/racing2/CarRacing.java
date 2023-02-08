package org.hufs.racing2;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CarRacing {
    public int tryCount;
    public String nameofCar;
    public int position;
    public List<Car> carManagers;
    public ResultView resultView = new ResultView();
    public CarRacing(String nameofCar, int tryCount){
        this.nameofCar = nameofCar;
        this.tryCount = tryCount;
        prepareCars();
    }
    Car car = new Car(position);
    public String getCurrCarName() {
        return nameofCar;
    }
    public int getCurrCarPosition() {
        return car.getPosition();
    }

    public boolean randomNum(){
        Random random = new Random();
        int randnum = random.nextInt(10);
        if ( randnum >= 4 ) {
            return true;
        }
        return false;
        }
    public void goCar() {
        if (randomNum()) {
            car.goStraight();
        }
    }

    public void prepareCars() {
        String[] carsArray = nameofCar.split(",");
        carManagers = new ArrayList<>();
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i]);
            Car car = new Car(position);
            carManagers.add(car);
        }
    }
    public void printResult(){
        for(int i=0; i< carManagers.size(); i++){
            resultView.showCurrCarRacing(getCurrCarName(), getCurrCarPosition());
            resultView.findWinCarName(getCurrCarName(), getCurrCarPosition());
            goCar();
        }
    }

}
