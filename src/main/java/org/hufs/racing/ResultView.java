package org.hufs.racing;

public class ResultView {
    static int carCount;
    static int[] carPoint;
    public ResultView(){
        carPoint = new int[this.carCount];
    }
    public static void ResultCarPoint() {
        System.out.println("실행 결과");
        for (int i = 0; i < carCount; i++) {
            for (int j = 0; j < carPoint[i]+1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}


