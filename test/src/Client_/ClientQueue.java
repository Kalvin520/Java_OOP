package Client_;
import java.util.ArrayList;
public class ClientQueue {
    private ArrayList clients = new ArrayList();//收集連線的Client
    private ArrayList listeners = new ArrayList();//收集對ClientQueue有興趣的ClientListener
    public void addClientListener(ClientListener listener){//註冊ClientListener
        listeners.add(listener);
    }

    public void add(Client client){
        clients.add(client);//新增Client
        ClientEvent event = new ClientEvent(client);//通知資訊包裝為ClientEvent
        for (int i = 0; i < listeners.size() ; i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientAdded(event);//逐一取出ClientListener通知
        }
    }

    public void remove(Client client){
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for (int i = 0; i < listeners.size(); i++) {
            ClientListener listener = (ClientListener) listeners.get(i);
            listener.clientRemoved(event);
        }
    }
}
