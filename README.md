# lab3
# MyArrayListStack
MyArrayListStack: This is the constructor of the class. It initializes an empty stack by creating a new instance of MyArrayList to hold the stack elements.

push(int value): This method adds an element to the top of the stack. The value parameter represents the element to be added.

pop(): This method removes and returns the top element from the stack. If the stack is empty, it throws an EmptyStackException.

peek(): This method returns the top element of the stack without removing it. If the stack is empty, it throws an EmptyStackException.

isEmpty(): This method checks if the stack is empty. It returns true if the stack is empty (i.e., it has no elements), and false otherwise.

size(): This method returns the number of elements currently in the stack.

# MyArrayListQueue
MyArrayListQueue<T>: This is a generic class where T represents the type of elements stored in the queue. It implements a queue using an ArrayList to hold the elements.

MyArrayListQueue(): This is the constructor of the class. It initializes an empty queue by creating a new instance of ArrayList.

enqueue(T value): This method adds an element to the end of the queue. The value parameter represents the element to be added.

dequeue(): This method removes and returns the element at the front of the queue. If the queue is empty, it throws a NoSuchElementException.

peek(): This method returns the element at the front of the queue without removing it. If the queue is empty, it throws a NoSuchElementException.

isEmpty(): This method checks if the queue is empty. It returns true if the queue is empty (i.e., it has no elements), and false otherwise.
size(): This method is commented out in the provided code. It is likely intended to return the number of elements in the queue, but it needs to be uncommented and updated to return int instead of T.