public class test2 {
        public static void main(String[] args) {

            Animal a=new Animal();
            Dog d =new Dog();
            Bird b = new Bird();
            Fish f =new Fish();

            moveAnimal(a);
            moveAnimal(d);
            moveAnimal(b);
            moveAnimal(f);

        }
        static void  moveAnimal(Animal ani){
            ani.move();
        }
    }
class Animal {
    void move() {
        System.out.println("move...move...");
    }
}
class Dog extends Animal {
    void move() {
        System.out.println("跑...跑...");
    }
}
class Bird extends Animal {
    void move() {
        System.out.println("飛...飛...");
    }
}
class Fish extends Animal {
    void move() {
        System.out.println("游...游...");
    }
}