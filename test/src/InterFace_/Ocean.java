package InterFace_;
public class Ocean {
    public static void main(String[] args) {
//        doswim(new Anemonefish("尼莫"));//介面的多型建立
//        doswim(new Shark("藍尼"));
//        doswim(new Human("賈斯丁"));
//        doswim(new Submarine("黃色一號"));
//        doswim2(new Shark("ss"));//繼承的多型建立並使用
          doswim(new Seaplane("Air Force 1"));
          doswim(new FlyingFish("flank"));
        }
    static void doswim(Swimmer swimmer){
        swimmer.swim();
    }
//    static void doswim2(Fish fish){
//        fish.swim();
//    }
}
