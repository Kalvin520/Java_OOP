package example_5;
import java.lang.System.*;
/**
 * @author kalvin
 */
public class MathTool {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}
