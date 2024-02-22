package NotifyButton;

import NotifyButton.Observable.IPhone;
import NotifyButton.Observable.Laptop;
import NotifyButton.Observer.EmailAlertObserver;
import NotifyButton.Observer.MessageAlertObserver;

public class Store {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        EmailAlertObserver emailAlertObserver1 = new EmailAlertObserver("shubham@gmail.com", iPhone);
        EmailAlertObserver emailAlertObserver2 = new EmailAlertObserver("ram@gmail.com", iPhone);
        iPhone.add(emailAlertObserver1);
        iPhone.add(emailAlertObserver2);


        Laptop laptop = new Laptop();
        MessageAlertObserver messageAlertObserver3 = new MessageAlertObserver("9019265004", laptop);
        laptop.add(messageAlertObserver3);

        // as of now iphone and laptop stock is empty

        // now whenever we will set the stock the users will get update
        iPhone.setStockCount(10);
        laptop.setStockCount(5);



    }
}