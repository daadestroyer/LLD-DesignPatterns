package NotifyButton.Observer;

import NotifyButton.Observable.StockObservableI;

public class MessageAlertObserver implements NotificationAlertObserver {
    String phone;
    StockObservableI stockObservableI;

    public MessageAlertObserver(String phone, StockObservableI stockObservableI) {
        this.phone = phone;
        this.stockObservableI = stockObservableI;
    }

    @Override
    public void update() {
        sendMessage(phone, "product is in stock hurry up !");
    }

    private void sendMessage(String phone, String msg) {
        System.out.println("message sent to " + phone + " : " + msg);
    }
}


