import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {
    private ArrayList<T> list;
    public MyArrayListQueue(){
        list = new ArrayList<T>();
    }
    public void enqueue(T value){
        list.add(value);
    }
    public T dequeue(){
        if(list.isEmpty()){
            throw new NoSuchElementException();


}
