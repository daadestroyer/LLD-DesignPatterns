package NotifyButton.Observable;

import NotifyButton.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhone implements StockObservableI{
    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        else{
            stockCount += newStockCount;
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
