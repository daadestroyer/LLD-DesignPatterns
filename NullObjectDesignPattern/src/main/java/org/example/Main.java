package org.example;

public class Main {
    public static void main(String[] args) {
        Vechile car = VechileFactory.getVechileObject("car");
        printVechileDetails(car);
    }

    private static void printVechileDetails(Vechile car){
        // previously we are doing this
        /*
        if(car != null){
            System.out.println("TANK CAP : "+car.getTankCapacity());
            System.out.println("SEATING CAP : "+car.getSeatingCapacity());
        }
        */

        // but using not null design pattern we don't need to check for object nullablity anymore
        System.out.println("TANK CAP : "+car.getTankCapacity());
        System.out.println("SEATING CAP : "+car.getSeatingCapacity());
    }
}