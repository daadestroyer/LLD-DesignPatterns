package youtube;

import youtube.Service.Subject;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    List<SubscriberObserverImpl> subs = new ArrayList<SubscriberObserverImpl>();
    private String title;
    private String channelName;


    public String getChannelName() {
        return this.channelName;
    }

    public Channel(String name) {
        this.channelName = name;
    }


    @Override
    public void doSubscribe(SubscriberObserverImpl sub) {
        subs.add(sub);
    }


    @Override
    public void unSubscribe(SubscriberObserverImpl sub) {
        subs.remove(sub);
    }

    @Override
    public void notifyAllSubs(String channelName) {
        for (SubscriberObserverImpl sub : subs) {
            sub.update(channelName);
        }
    }

    @Override
    public void upload(String title, String channelName) {
        this.title = title;
        notifyAllSubs(channelName);
    }
}
