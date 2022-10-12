package 多型練習;
public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("喵喵");
    }
    public void talk(){
        System.out.println("喵喵");
    }
    public void mating(Animal animal){
        System.out.println("喵喵");
    }
}
