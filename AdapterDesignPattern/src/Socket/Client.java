package Socket;

import Socket.Adaptee.ThreePinCharger;
import Socket.Adaptee.TwoPinCharger;
import Socket.Adapter.SocketAdapterImpl;

public class Client {
    public static void main(String[] args) {
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl(new ThreePinCharger());
        System.out.println(socketAdapter.getSocket());

        SocketAdapterImpl socketAdapter1 = new SocketAdapterImpl(new TwoPinCharger());
        System.out.println(socketAdapter1.getSocket());
    }
}
