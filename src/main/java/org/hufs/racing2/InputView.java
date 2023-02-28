package org.hufs.racing2;

import java.util.Scanner;

public class InputView {
    public String nameOfCar;
    public int tryCount;

    public void getNameOfCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요");
        nameOfCar = scanner.nextLine();
    }

    public void getTryCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 횟수는 몇회인가요?");
        tryCount = scanner.nextInt();
    }

    public void inputCarCheck(int tryCount) {
        System.out.println(tryCount);
        if (tryCount <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1이상 이어야 합니다.");
        }
    }

}

