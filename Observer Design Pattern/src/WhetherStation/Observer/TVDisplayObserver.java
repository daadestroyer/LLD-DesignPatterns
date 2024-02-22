package WhetherStation.Observer;

import WhetherStation.Observable.WhetherStationObservableI;

public class TVDisplayObserver implements DisplayObserverI {
    WhetherStationObservableI whetherStationObservableI;

    public TVDisplayObserver(WhetherStationObservableI whetherStationObservableI) {
        this.whetherStationObservableI = whetherStationObservableI;
    }

    @Override
    public void update() {
        sendTempToTV();
    }

    public void sendTempToTV() {
        System.out.println("TV Display Temprature : " + whetherStationObservableI.getTemp() + " Degree Celcius");
    }
}
