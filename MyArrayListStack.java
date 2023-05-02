import java.util.EmptyStackException;
public class MyArrayListStack {
    private myArrayList<Integer> list;
    public myArrayListStack(){
        list = new myArrayList<>();
    }
    public void push(int value){
        list.add(value);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();


}
