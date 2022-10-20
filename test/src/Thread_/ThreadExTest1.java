package Thread_;

public class ThreadExTest1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadExample("message1"));
        Thread thread2 = new Thread(new ThreadExample("message2"));
        Thread thread3 = new Thread(new ThreadExample("message3"));
        Thread thread4 = new Thread(new ThreadExample("message4"));
        Thread thread5 = new Thread(new ThreadExample("message5"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
