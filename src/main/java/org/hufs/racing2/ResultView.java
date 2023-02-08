package org.hufs.racing2;

public class ResultView {
    private static String winName;
    private static int winCarPosition = 0;

    public void showCurrCarRacing(String name, int position) {
        System.out.print(name+": ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public void findWinCarName(String carName, int carPosition) {
        if (carPosition > winCarPosition) {
            winName = carName;
            winCarPosition = carPosition;
        } else if (carPosition == winCarPosition) {
            winName += ", "+carName;
        }
    }
    public void printWinner() {
        System.out.println(winName+"가 최종 우승했습니다.");
    }

}
