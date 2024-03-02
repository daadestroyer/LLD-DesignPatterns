package Socket.Adapter;

import Socket.Adaptee.Socket;

public class SocketAdapterImpl implements  SocketAdapter{
     Socket socket;

    public SocketAdapterImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public String getSocket() {
        return socket.pinType();
    }
}


