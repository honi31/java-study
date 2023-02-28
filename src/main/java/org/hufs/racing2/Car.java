package org.hufs.racing2;

public class Car {
    public int position;
    public String name;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name) {
        if(name.length() > 5 ) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 넘지 않아야 합니다.");
        }
    }
    public String getName() {
        return name;
    }

    public int getPosition() { return position; }

    public void goStraight() {
        this.position++;
    }
}

