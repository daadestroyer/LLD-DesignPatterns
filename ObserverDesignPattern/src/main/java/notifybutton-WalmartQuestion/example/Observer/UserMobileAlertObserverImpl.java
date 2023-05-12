package Observer;

public class UserMobileAlertObserverImpl implements Observer.UserNotificationAlertObserver {

    String emailId;
    Observable.ProductsObservable productsStocksObservable;

    public UserMobileAlertObserverImpl(String emailId, Observable.ProductsObservable productsStocksObservable) {
        this.emailId = emailId;
        this.productsStocksObservable = productsStocksObservable;
    }


    public void update() {
        sendMail(emailId, "product is on stock hurry up");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail send to: " + emailId);
    }
}
