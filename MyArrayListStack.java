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
     * @param value the value to be pushed onto the stack
     */

    public void push(int value) {
        list.add(value);
    }

    /**
     * removes and returns the top element from the stack;
     * throws an EmptyStackException if the stack is empty;
     * @return the top element of the stack;
     * @throws EmptyStackException if the stack is empty
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
