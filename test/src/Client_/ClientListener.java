package Client_;

public interface ClientListener {
    void clientAdded(ClientEvent event);//新增Client會呼叫這個方法
    void clientRemoved(ClientEvent event);//減少Client會呼叫這個方法
}
