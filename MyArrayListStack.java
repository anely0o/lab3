import java.util.EmptyStackException;
public class MyArrayListStack {
    private MyArrayList<Integer> list;
    public MyArrayListStack() {
        list = new MyArrayList<>();
    }

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
            public int peek () {
                if (isEmpty()) {
                    throw new EmptyStackException();
                    public boolean isEmpty () {
                        return list.size() == 0;
                    }
                    public int size () {
                        return list.size();
                    }

                }
            }
        }
    }
}