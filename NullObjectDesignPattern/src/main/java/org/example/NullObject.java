package org.example;

public class NullObject implements  Vechile{
    // null object do nothing or default behaviour
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
