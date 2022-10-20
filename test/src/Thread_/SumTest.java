package Thread_;

import java.security.spec.ECField;

public class SumTest {
    public static void main(String[] args) throws Exception {
        SumThread sum = new SumThread();
        Thread thread1 = new Thread(sum);
        thread1.start();
        synchronized (thread1){
            thread1.wait();
        }
        int result = sum.sum;
        System.out.println("Count result is:" + result);
    }
}
