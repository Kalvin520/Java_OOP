package Thread_;

public class ThreadExample implements Runnable {
    private String message;
    public ThreadExample(String message){
        this.message = message;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(5000l);
            System.out.println("Thread message is:" +this.message);
        }
        catch (Exception e){
                throw new RuntimeException(e);
        }
    }
}
