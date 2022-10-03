package InterFace_;
interface Inter1 {
    int value = 10;
}
interface Inter2 {
    int value = 20;
}
class Father{
    int value = 30;
}
class A1 extends Father implements Inter1,Inter2{
    int value = 40;
}
//////////
interface A{
    void method();
}
interface B{
    void method();
    int method(int a);
}
class MyClass implements A,B{
    @Override
    public int method(int a) {
        System.out.println("hello");
        return a;
    }
    @Override
    public void method() {
        System.out.println("world");
    }
}
class A2 extends MyClass{

}
class t1 {
    public static void main(String[] args) {

        A1 a = new A1();
        A2 b = new A2();
        System.out.println( Inter1.value );  // 以介面名稱存取，因為是static修飾
        System.out.println( Inter2.value );  // 同上
        System.out.println( ((Father)a).value ); // 先把物件a轉型成該父類別，再存取
        System.out.println( a.value );  // 直接以物件存取


        System.out.println(b.method(1));
        b.method();


    }// end of main(String[])
}// end of class Test