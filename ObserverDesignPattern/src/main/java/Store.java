import Observable.ProductsIphoneObservableImpl;
import Observer.UserEmailAlertObserverImpl;
import Observer.UserMobileAlertObserverImpl;

public class Store {
    public static void main(String[] args) {
//        ProductsIphoneObservableImpl iphoneObservable = new ProductsIphoneObservableImpl();
//        UserEmailAlertObserverImpl observer1 = new UserEmailAlertObserverImpl("ansh@gmail.com",iphoneObservable);
//        UserMobileAlertObserverImpl observer2 = new UserMobileAlertObserverImpl("shubhanshu@gmail.com",iphoneObservable);
//
//
//        iphoneObservable.add(observer1);
//        iphoneObservable.add(observer2);
//
//        iphoneObservable.setStockCount(10);
//        iphoneObservable.setStockCount(100);
//        iphoneObservable.setStockCount(0);
//        iphoneObservable.setStockCount(10);


        String word = "abcdefd";
        String ch = "d";

        int idx = word.indexOf(ch);
        System.out.println(idx);
        String subString = word.substring(0,idx+1);
        String restString = word.substring(idx+1);
        System.out.println(subString+":"+restString);

        StringBuilder sb = new StringBuilder(subString);
        String revStr = sb.reverse().toString();
        sb.delete(0,sb.length());
        sb.append(revStr);
        sb.append(restString);
        System.out.println(sb.toString());


    }
}
