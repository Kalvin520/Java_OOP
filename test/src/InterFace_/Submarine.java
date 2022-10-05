package InterFace_;

public class Submarine extends Boat implements Diver{
    private String name;
    public Submarine(String name){
        super(name);
    }
    @Override
    public void Dive(){
        System.out.printf("潛水艇 %s 潛行%n",name);
    }
}
