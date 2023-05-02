import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * the MyArrayListQueue class represents a queue data structure implemented using an ArrayList.
 * it provides methods to enqueue elements at the end of the queue, dequeue elements from the front of the queue, and retrieve the element at the front without removing it.
 *
 * @param <T> the type of elements stored in the queue
 */

public class MyArrayListQueue<T> {
    /**
     *constructs an empty queue
     */
    private ArrayList<T> list;
    public MyArrayListQueue(){
        list = new ArrayList<T>();
        /**
         *adds an element to the end of the queue.
         * @param value the value to be added to the queue
         * */

    }
    public void enqueue(T value){
        list.add(value);
    }

    /**
     *
     * @return
     */
    public T dequeue(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.remove(0);

    }

    /**
     *
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty
     */

    public T peek(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     *
     * @return the element at the front of the queue
     * @throws NoSuchElementException if the queue is empty

    public int size(){
        return list.size();
    }


}
