package youtube;

public class youtube {

    public static void main(String[] args) {
        Channel thecoderstv = new Channel("TheCoders TV");
        SubscriberObserverImpl s1 = new SubscriberObserverImpl("ram");
        SubscriberObserverImpl s2 = new SubscriberObserverImpl("laxman");
        SubscriberObserverImpl s3 = new SubscriberObserverImpl("bharath");
        SubscriberObserverImpl s4 = new SubscriberObserverImpl("shatrugan");

        thecoderstv.doSubscribe(s1);
        thecoderstv.doSubscribe(s2);
        thecoderstv.doSubscribe(s3);
        thecoderstv.doSubscribe(s4);

        // bharath unsubscribe the channel
        thecoderstv.unSubscribe(s3);

        s1.subscribeChannel(thecoderstv);
        s2.subscribeChannel(thecoderstv);
        s3.subscribeChannel(thecoderstv);
        s4.subscribeChannel(thecoderstv);

        thecoderstv.upload("how to learn programming",thecoderstv.getChannelName());


    }

}
