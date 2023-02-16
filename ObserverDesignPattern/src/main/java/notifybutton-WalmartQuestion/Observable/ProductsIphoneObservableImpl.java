package Observable;

import Observer.UserNotificationAlertObserver;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ProductsIphoneObservableImpl implements Observable.ProductsStocksObservable {

    private List<UserNotificationAlertObserver> listOfNotificationAlertObserver = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(UserNotificationAlertObserver observer) {
        this.listOfNotificationAlertObserver.add(observer);
    }

    @Override
    public void remove(UserNotificationAlertObserver observer) {
        this.listOfNotificationAlertObserver.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println(LocalTime.now());
        for (UserNotificationAlertObserver observer : listOfNotificationAlertObserver) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStock) {
        if (stockCount == 0) {
            // if it out of stock notify all subscribers
            // then increase the stock count
            notifyAllObserver();
        }

        stockCount += newStock;

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
