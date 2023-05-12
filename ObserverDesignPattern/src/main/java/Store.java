import Observer.UserEmailAlertObserverImpl;
import Observer.UserMobileAlertObserverImpl;

public class Store {
    public static void main(String[] args) {
        Observable.IphoneObservableImpl iphoneObservable = new Observable.IphoneObservableImpl();
        UserEmailAlertObserverImpl observer1 = new UserEmailAlertObserverImpl("ansh@gmail.com",iphoneObservable);
        UserMobileAlertObserverImpl observer2 = new UserMobileAlertObserverImpl("shubhanshu@gmail.com",iphoneObservable);


        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCount(10);
        iphoneObservable.setStockCount(100);
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(10);



    }
}
