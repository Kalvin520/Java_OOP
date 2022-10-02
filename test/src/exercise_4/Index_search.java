package exercise_4;

import java.util.Scanner;
/**
 * @author kalvin
 */
public class Index_search{
    public static void main(String[] args) {
        int[] numbers = {1,10,31,33,37,48,60,70,80};
        var temp = new int[numbers.length + 1];
        for (var i = 1; i < temp.length; i++){
            temp[i] = numbers[i - 1];
        }
        System.out.print("想搜尋：");
        temp[0] = new Scanner(System.in).nextInt();

        var i = numbers.length;
        while (temp[i] != temp[0]){
            i--;
        }
        System.out.println(i - 1);
    }
}