package example_5;
import java.util.Scanner;
import static java.lang.System.*;
/**
 * @author kalvin
 */
public class ImportStatic {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        out.print("請輸入姓名：");
        out.printf("%s 妳好！%n",console.nextLine());
    }
}
