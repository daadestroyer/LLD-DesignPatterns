package WhetherStation.Observable;

import WhetherStation.Observer.DisplayObserverI;

import java.util.ArrayList;
import java.util.List;

public class WhetherStationObservableImpl implements WhetherStationObservableI {
    public int currTemp;
    List<DisplayObserverI> displayObserverIList = new ArrayList<>();

    @Override
    public void add(DisplayObserverI displayObserverI) {
        this.displayObserverIList.add(displayObserverI);
    }

    @Override
    public void remove(DisplayObserverI displayObserverI) {
        this.displayObserverIList.remove(displayObserverI);
    }

    @Override
    public void notifySubscribers() {
        for(DisplayObserverI displayObserverI : displayObserverIList){
            displayObserverI.update();
        }
    }

    @Override
    public void setTemp(int temp) {
        if(temp != currTemp ){
            currTemp = temp;
        }
        notifySubscribers();
    }

    @Override
    public int getTemp() {
        return currTemp;
    }
}
