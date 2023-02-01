package org.hufs.racing;

public class Main {
    public static void main(String args[]){
        InputView inputview = new InputView();
        inputview.setInput();
        CarRacing carracing = new CarRacing(inputview.carCount, inputview.tryCount);
        carracing.run();
        ResultView resultview = new ResultView();
        resultview.ResultCarPoint(inputview.carCount, inputview.tryCount, carracing.carPoint);
    }
}
