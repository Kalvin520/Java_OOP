/**
 * @author kalvin
 */


import example_5.MathTool;

/**
 * @author kalvin
 */
class Some{
    private int a=10;
    private String text="n.a.";
    Some(int a){
        if (a>0){
            this.a=a;
            System.out.printf("%d\n",a);
        }
    }

    Some(int a, String text){
        this(a);
        if (text!=null){
            this.text=text;
            System.out.printf("%s",text);
        }
    }
}

class Other{
    {
        System.out.println("物件初始化區塊");
    }
    Other(){
        System.out.println("Other()建構式");
    }
    Other(int o){
        this();
        System.out.println("Other(int o)建構式");
    }
}

class Ball{
    static {
        System.out.println("位元碼載入後就會執行");
    }
}


/**
 * @author kalvin
 */
public class tset {
    public static void main(String[] args) {

//        new Other(1);
//        new Some(11);
//        new Some(87,"gg");
//        System.out.println(MathTool.sum(1,2)); 3
//        System.out.println(MathTool.sum(1,2,3)); 6
//        System.out.println(MathTool.sum(1,2,3,4)); 10

    }

}