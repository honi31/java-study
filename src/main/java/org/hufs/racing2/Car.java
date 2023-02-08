package org.hufs.racing2;

public class Car {
    public int position;

    public Car(int position) {
        this.position = position;
    }
    

    public int getPosition(){
    return position;
    }
    public void goStraight() {
        this.position++;
    }

}

