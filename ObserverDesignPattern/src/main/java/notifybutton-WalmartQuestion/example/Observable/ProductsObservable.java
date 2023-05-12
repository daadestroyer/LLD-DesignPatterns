package Observable;

import Observer.UserNotificationAlertObserver;

public interface ProductsObservable {


    public void add(UserNotificationAlertObserver observer);
    public void remove(UserNotificationAlertObserver observer);
    public void notifyAllObserver();
    public void setStockCount(int newStock);
    public int getStockCount();
}
