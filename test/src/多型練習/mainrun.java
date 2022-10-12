package 多型練習;

public class mainrun {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat("貓"),new Dog("狗")};

        for(Animal animal : animals){
            System.out.print(animal.getName() + ":");
            animal.talk();
        }
    }
}
