package youtube;

import youtube.Service.SubscriberObserver;

public class SubscriberObserverImpl implements SubscriberObserver {
    private String name;

    public SubscriberObserverImpl(String name) {
        this.name = name;
    }

    private Channel channel;


    @Override
    public void update(String channelName) {
        System.out.println("Hey " + name + " new video uploaded from " + channelName);
    }

    @Override
    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
