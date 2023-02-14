package example1.WithStrategyPattern.VechileTypes;

import example1.WithStrategyPattern.NormalDriveStrategy;
import example1.WithStrategyPattern.Vechile;

public class PassengerVechile extends Vechile {

    public  PassengerVechile(){
        super(new NormalDriveStrategy());
    }

    public static void main(String[] args) {
        PassengerVechile passengerVechile = new PassengerVechile();
        passengerVechile.drive();
    }
}
