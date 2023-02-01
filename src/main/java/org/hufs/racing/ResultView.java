package org.hufs.racing;

public class ResultView {

    int carCount;
    int tryCount;
    int[] carPoint;

    public ResultView(){
        carPoint = new int[this.carCount];
    }
    public void ResultCarPoint(int carCount, int tryCount, int[] carPoint) {
        System.out.println("실행 결과");
        for(int k = 0; k < tryCount; k++){
            for (int i = 0; i < carCount; i++) {
                for (int j = 0; j < carPoint[i]; j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println(" ");
        }
    }
}


