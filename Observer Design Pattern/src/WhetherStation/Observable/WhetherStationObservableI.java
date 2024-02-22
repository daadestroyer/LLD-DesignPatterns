package WhetherStation.Observable;

import WhetherStation.Observer.DisplayObserverI;

import java.util.ArrayList;
import java.util.List;

public interface WhetherStationObservableI {
    public void add(DisplayObserverI displayObserverI);
    public void remove(DisplayObserverI displayObserverI);
    public void notifySubscribers();
    public void setTemp(int temp);
    public int getTemp();

}
