package Thread_;

public class ThreadTest1 extends Thread {
    private String message;
    public ThreadTest1(String message){
        this.message = message;
    }
    public void run(){
        System.out.println("Thread message is:"+ this.message);
    }
}
