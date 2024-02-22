package org.example;

public class Car implements Vechile {
    @Override
    public int getTankCapacity() {
        return 10;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
