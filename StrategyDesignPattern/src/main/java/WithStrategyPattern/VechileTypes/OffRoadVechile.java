package WithStrategyPattern.VechileTypes;

import WithStrategyPattern.SpecialDriveStrategy;
import WithStrategyPattern.Vechile;

public class OffRoadVechile extends Vechile {
    public OffRoadVechile() {
        super(new SpecialDriveStrategy());
    }

    public static void main(String[] args) {
        OffRoadVechile offRoadVechile = new OffRoadVechile();
        offRoadVechile.drive();
    }
}
