package org.hufs.racing2;

public class Main {
    public static void main(String args[]) {
        InputView inputView = new InputView();
        inputView.getNameOfCar();
        inputView.getTryCount();
        CarRacing carracing = new CarRacing(inputView.nameOfCar, inputView.tryCount);
        ResultView resultView = new ResultView();

        resultView.startRacing(carracing.getCarSet());

        for(int i=0; i < inputView.tryCount; i++){
            carracing.goCar();
            resultView.startRacing(carracing.getCarSet());
        }
        System.out.println();
        resultView.findWinnerCarName(carracing.getCarSet());
        resultView.printWinner();
    }
}
