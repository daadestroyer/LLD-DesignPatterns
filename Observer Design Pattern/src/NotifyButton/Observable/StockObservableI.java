package NotifyButton.Observable;

import NotifyButton.Observer.NotificationAlertObserver;

public interface StockObservableI{
    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();

}
