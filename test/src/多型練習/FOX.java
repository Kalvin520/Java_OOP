package 多型練習;

public class FOX extends Animal{
    public FOX(String name){
        super(name);
    }

    @Override
    public void talk() {
        System.out.println("狐狸");
    }
    @Override
    public void eat(){
        System.out.println("狐狸");
    }
    @Override
    public void mating(Animal animal){
        System.out.println("狐狸");
    }
}
