interface Some2{
    void execute();
    void doSome();
}
interface Other2{
    void execute();
    void doOther();
}

public class Service implements Some2,Other2{
    @Override
    public void execute(){
        System.out.println("execute()");
    }
    @Override
    public void doSome(){
        System.out.println("doSome()");
    }
    @Override
    public void doOther(){
        System.out.println("doOther()");
    }
}
