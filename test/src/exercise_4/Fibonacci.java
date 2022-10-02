package exercise_4;

import java.util.Scanner;

/**
 * @author kalvin
 */
public class Fibonacci {
    public static void main(String[] args) {


        System.out.print("求幾個費式數:");

        var fibonacci = new int[new Scanner(System.in).nextInt()];
        //definition: fn = fn-1 + fn-2, fn = n, if n > 1, if n = 0,1  ex:1,1,2,3,5,8,...........
        //java特性 Array初始值皆為0
        fibonacci[1]=1;

        for (var n = 2; n < fibonacci.length; n++){
            fibonacci[n]=fibonacci[n-1]+fibonacci[n-2];

        }

        for(var fi:fibonacci){
            System.out.printf("%d ",fi);
        }

        System.out.println();
    }
}
