package WhetherStation.Observer;

import WhetherStation.Observable.WhetherStationObservableI;

public class MobileDisplayObserver implements DisplayObserverI{

    WhetherStationObservableI whetherStationObservableI;

    public MobileDisplayObserver(WhetherStationObservableI whetherStationObservableI) {
        this.whetherStationObservableI = whetherStationObservableI;
    }

    @Override
    public void update() {
        sendTempToMobile();
    }

    private void sendTempToMobile(){
        System.out.println("Mobile Display Temprature : "+whetherStationObservableI.getTemp()+" Degree Celcius");
    }
}
