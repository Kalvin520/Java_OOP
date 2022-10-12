package TryCatch;

public class FinalyDemo {
    public static void main(String[] args) {
        System.out.println(test(true));
    }

    static int test(boolean flag) {
        try {
            if (flag) {
                return 1;
            }
        } finally {
            System.out.println("Finally....");
        }
        return 0;
    }
}
