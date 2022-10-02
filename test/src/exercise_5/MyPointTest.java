package exercise_5;

import java.security.UnresolvedPermission;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint();
        MyPoint mp2 = new MyPoint(10,20);
        MyPoint mp3 = new MyPoint(15);
        mp1.display();
        mp2.display();
        mp3.display();
        //update
        mp2.updatePoint(20,30);
        mp2.display();
        mp2.updatePoint(-20,10);
        mp2.display();
    }

}
