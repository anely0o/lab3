import java.util.EmptyStackException;

/**
 *the MyArrayListStack class represents a stack data structure implemented using an ArrayList;
 * provides methods to push elements onto the stack, pop elements from the stack, and retrieve the top element without removing it.
 */
public class MyArrayListStack {
    private MyArrayList<Integer> list;

    /**
     * constructs an empty stack
     */
    public MyArrayListStack() {
        list = new MyArrayList<>();
    }

    /**
     *
     * @param value
     */

    public void push(int value) {
        list.add(value);
    }

    /**
     *
     * @return
     */

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    /**
     *
     * @return
     */

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
