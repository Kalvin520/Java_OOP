package Client_;

import InterFace_.Piranha;

import java.time.format.SignStyle;

public class ClientEvent {
    private Client client;
    public ClientEvent(Client client){
        this.client = client;
    }
    public String getName() {
        return client.name;
    }
    public String getIp(){
        return client.ip;
    }

}
