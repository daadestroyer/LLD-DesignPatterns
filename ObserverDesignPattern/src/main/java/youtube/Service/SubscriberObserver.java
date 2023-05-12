package youtube.Service;

import youtube.Channel;

public interface SubscriberObserver {

    public void update(String channelName);
    public void subscribeChannel(Channel channelName);

}
