package NotifyButton.Observer;

import NotifyButton.Observable.StockObservableI;

public class EmailAlertObserver implements NotificationAlertObserver {

    String emailId;
    StockObservableI stockObservableI;

    public EmailAlertObserver(String emailId, StockObservableI stockObservableI) {
        this.emailId = emailId;
        this.stockObservableI = stockObservableI;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");
    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail sent at : " + emailId + " : " + msg);
    }
}


