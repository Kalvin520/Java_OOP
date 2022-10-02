package exercise_6;
import Inheritance.ArrayList;

import java.util.Arrays;
public class Array_list6_1 {
    private Object[] elems; //使用Object陣列搜集
    private int next; //下一個可儲存物件的index

    public Array_list6_1(int capacity){
        elems = new Object[capacity];
    }
    public Array_list6_1(){
        this(16);//初始容量預設為16
    }
    public void add(Object o){ //收集物件方法
        if (next == elems.length){ //自動增長Object陣列長度
            elems = Arrays.copyOf(elems,elems.length*2);
        }
        elems[next++] = o;
    }
    public Object get(int index){
        return elems[index];
    }

    public int size() { //以收集的物件個數
        return next;
    }

    @Override
    public String toString(){
        var desc = new StringBuilder();
        desc.append("ArrayList{");
        var last = next - 1;
        for (var i = 0; i < last; i++){
            desc.append(elems[i]).append(", ");
        }
        desc.append(elems[last]).append("}");
        return desc.toString();
    }
}
