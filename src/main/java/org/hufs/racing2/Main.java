package org.hufs.racing2;

public class Main {
    public static void main(String args[]) {
        InputView inputView = new InputView();
        String nameofCar = inputView.getNameofCar();
        int tryCount = inputView.getTryCount();
        CarRacing carracing = new CarRacing(nameofCar, tryCount);
        ResultView resultView = new ResultView();

        for (int i = 0; i < tryCount; i++) {
            carracing.printResult();
            System.out.println();
        }
        resultView.printWinner();
    }
}
