package org.example;

public class VechileFactory {
    static Vechile getVechileObject(String typeOfVechile){
        if(typeOfVechile.equalsIgnoreCase("car")){
            return new Car();
        }
        else if(typeOfVechile.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return new NullObject();
    }
}
