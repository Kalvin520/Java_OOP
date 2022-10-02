package exercise_6;

import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        var date1 = new Date();
        var date2 = new Date();
        var date3 = new Date();
        var list1 = new Array_list6_2();
        list1.add(date1);
        list1.add(date2);
        list1.add(date3);

        var list2 = new Array_list6_2();
        list2.add(date1);
        list2.add(date2);
        list2.add(date3);
        System.out.println(list1.equals(list2));

        list2.add(new Date());
        System.out.println(list1.equals(list2));
    }
}
