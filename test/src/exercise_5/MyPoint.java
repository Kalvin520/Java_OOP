package exercise_5;

public class MyPoint {
    //instance variables
    private int x;
    private int y;


    MyPoint(){//default constructor
        this(0,0);
    }
    MyPoint(int x, int y){
        if (checkPoint(x, y)){
            this.x = x;
            this.y = y;
        }else{
            System.out.println("x,y必須在第一象限,改設定在原點上.");
            this.x = this.y = 0;
        }


    }
    MyPoint(int n){
        this(n,n);
    }


    //instance methods
    public void display(){
        System.out.println("x="+x+" ,y="+y);
    }
    public boolean checkPoint(int x, int y) {
        if (x < 0 || y < 0) {
            return false;
        } else {
            return true;
        }
    }
    public void updatePoint(int x, int y){
        if (checkPoint(x, y)){
            this.x = x;
            this.y = y;
        }else{
            System.out.println("x,y必須在第一象限");
        }
    }

}
