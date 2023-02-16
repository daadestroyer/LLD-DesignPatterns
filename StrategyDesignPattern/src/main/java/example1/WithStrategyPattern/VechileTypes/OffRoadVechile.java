package example1.WithStrategyPattern.VechileTypes;

import example1.WithStrategyPattern.SpecialDriveStrategy;
import example1.WithStrategyPattern.Vechile;

public class OffRoadVechile extends Vechile {
    public OffRoadVechile() {
        super(new SpecialDriveStrategy());
    }


}
