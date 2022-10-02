package exercise_5;
import java.util.Scanner;

public class hanoi     {
    static int count=0;

    public static void main(String[] args) {
        int n;//多少層
        System.out.printf("請輸入河內塔環數：");
        move(new Scanner(System.in).nextInt(),'A','B','C');
        System.out.printf("%d",count);

    }

    static void move(int n,char a,char b,char c){

        if (n==1){
            count++;
            System.out.printf("盤由%c移至%c%n", a , c);
        }
        else {
            move(n-1,'a','c','b');
            move(1  ,'a','b','c');
            move(n-1,'b','a','c');
        }
    }
}
