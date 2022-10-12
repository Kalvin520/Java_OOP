package 多型練習;

public abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Animal() {
    }

    public abstract void talk();

    public abstract void eat();

    public abstract void mating(Animal animal);

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
