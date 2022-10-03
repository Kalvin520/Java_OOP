package InterFace_;

public class Ocean {
    public static void main(String[] args) {
        doswim(new Anemonefish("尼莫"));
        doswim(new Shark("藍尼"));
        doswim(new Human("賈斯丁"));
        doswim(new Submarine("黃色一號"));
    }
    static void doswim(Swimmer swimmer){
        swimmer.swim();
    }
}
