package 多型練習;

public class mainrun {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Animal("鳥",Animal.BIRD),new Animal("狗",Animal.DOG),new Animal("貓",Animal.CAT),new Animal("狐狸",Animal.FOX),new Animal("樹懶",Animal.SLOTH)};

        for(Animal animal : animals){
            System.out.print(animal.getName() + ":");
            animal.talk();
        }
    }
}
