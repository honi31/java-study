package org.hufs.racing;

import java.util.Scanner;
public class InputView {
    public int carCount;
    public int tryCount;
    public void setInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        carCount = scanner.nextInt();

        System.out.println("시도할 횟수는 몇 회 인가요?");
        tryCount = scanner.nextInt();

    }
}
