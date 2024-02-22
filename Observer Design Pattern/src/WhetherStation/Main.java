package WhetherStation;

import WhetherStation.Observable.WhetherStationObservableImpl;
import WhetherStation.Observer.MobileDisplayObserver;
import WhetherStation.Observer.TVDisplayObserver;

public class Main {
    public static void main(String[] args) {
        WhetherStationObservableImpl whetherStationObservable = new WhetherStationObservableImpl();
        MobileDisplayObserver mobileDisplayObserver1 = new MobileDisplayObserver(whetherStationObservable);
        MobileDisplayObserver mobileDisplayObserver2 = new MobileDisplayObserver(whetherStationObservable);
        TVDisplayObserver tvDisplayObserver3 = new TVDisplayObserver(whetherStationObservable);

        whetherStationObservable.add(mobileDisplayObserver1);
        whetherStationObservable.add(mobileDisplayObserver2);
        whetherStationObservable.add(tvDisplayObserver3);

        whetherStationObservable.setTemp(10);

    }
}
