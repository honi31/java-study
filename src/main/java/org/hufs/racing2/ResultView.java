package org.hufs.racing2;

public class ResultView {
    public String winName;
    public int winCarPosition = 0;

    public void showCurrCarRacing(String name, int position) {
        System.out.print(name+": ");
        for (int i = 0; i < position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public void findWinCarName(String name, int position) {
        if (position > winCarPosition) {
            winName = name;
            winCarPosition = position;
        } else if (position == winCarPosition) {
            winName += ", "+name;
        }
    }
    public void printWinner() {
        System.out.println(winName+"가 최종 우승했습니다.");
    }

}
