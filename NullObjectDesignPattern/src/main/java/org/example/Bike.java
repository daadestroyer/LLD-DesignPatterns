package org.example;

public class Bike implements Vechile{
    @Override
    public int getTankCapacity() {
        return 5;
    }

    @Override
    public int getSeatingCapacity() {
        return 2;
    }
}
