package Inheritance;
import java.util.Arrays;
public class ArrayList {
    private Object[] elems; //使用Object陣列搜集
    private int next; //下一個可儲存物件的index

    public ArrayList(int capacity){
        elems = new Object[capacity];
    }
    public ArrayList(){
        this(16);//初始容量預設為16
    }
    public void add(Object o){ //收集物件方法
        if (next == elems.length){ //自東增長Object陣列長度
            elems = Arrays.copyOf(elems,elems.length*2);
        }
        elems[next++] = o;
    }
    public Object get(int index){
        return elems[index];
    }

    public int size() {
        return next;
    }
}
