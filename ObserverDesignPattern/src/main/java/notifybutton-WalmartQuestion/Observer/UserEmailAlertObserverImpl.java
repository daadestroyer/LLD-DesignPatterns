package Observer;

import Observable.ProductsStocksObservable;

public class UserEmailAlertObserverImpl implements Observer.UserNotificationAlertObserver {

    String emailId;
    ProductsStocksObservable productsStocksObservable;

    public UserEmailAlertObserverImpl(String emailId, ProductsStocksObservable productsStocksObservable) {
        this.emailId = emailId;
        this.productsStocksObservable = productsStocksObservable;
    }

    @Override
    public void update() {
        sendMail(emailId,"product is on stock hurry up");
    }

    private void sendMail(String emailId,String msg){
        System.out.println("mail send to: "+emailId);
    }
}
