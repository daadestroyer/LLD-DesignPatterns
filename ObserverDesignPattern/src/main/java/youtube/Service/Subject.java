package youtube.Service;

import youtube.SubscriberObserverImpl;

public interface Subject {
    public void doSubscribe(SubscriberObserverImpl sub);

    public void unSubscribe(SubscriberObserverImpl sub);

    public void notifyAllSubs(String channelName);

    public void upload(String title, String channelName);


}
