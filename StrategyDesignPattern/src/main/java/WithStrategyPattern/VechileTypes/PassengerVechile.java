package WithStrategyPattern.VechileTypes;

import WithStrategyPattern.NormalDriveStrategy;
import WithStrategyPattern.Vechile;

public class PassengerVechile extends Vechile {

    public  PassengerVechile(){
        super(new NormalDriveStrategy());
    }

    public static void main(String[] args) {
        PassengerVechile passengerVechile = new PassengerVechile();
        passengerVechile.drive();
    }
}
