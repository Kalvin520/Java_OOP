package Thread_;

public class ThrTest1 {
    public static void main(String[] args) {
        ThreadTest1 thread1 = new ThreadTest1("message1");
        ThreadTest1 thread2 = new ThreadTest1("message2");
        ThreadTest1 thread3 = new ThreadTest1("message3");
        ThreadTest1 thread4 = new ThreadTest1("message4");
        ThreadTest1 thread5 = new ThreadTest1("message5");
        ThreadTest1 thread6 = new ThreadTest1("message6");
        ThreadTest1 thread7 = new ThreadTest1("message7");
        ThreadTest1 thread8 = new ThreadTest1("message8");
        ThreadTest1 thread9 = new ThreadTest1("message9");
        ThreadTest1 thread10 = new ThreadTest1("message10");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
