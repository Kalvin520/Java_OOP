package Service_;

interface Some2 extends Action2 { ;
    void doSome();
}
interface Other2 extends Action2 {
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
