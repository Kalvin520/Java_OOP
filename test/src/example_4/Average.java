package example_4;

/**
 * @author kalvin
 */
public class Average {
    public static void main(String[] args) {
        var sum = 0;
        for (var arg : args){
            sum += Long.parseLong(arg);
        }
        System.out.println("平均:"+ (float) sum / args.length);
    }
}
