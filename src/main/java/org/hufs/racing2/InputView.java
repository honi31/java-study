package org.hufs.racing2;

import java.util.Scanner;
public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int getTryCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return scanner.nextInt();
    }

    public String getNameofCar() {
        System.out.println("경주할 자동차 이름을 입력하세요");
        return scanner.next();
    }
}
