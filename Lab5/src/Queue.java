/**
 * Queue.java
 * Your Name: Tunahan Akyol
 * Your Student Id: 240446002
 * Your Date: 16.11.2026
 */
public class Queue<T> {
    private int front, rear, size, capacity;
    private T array[];

    Queue(int cap){
        capacity = cap;
        front = size = 0;
        rear = capacity - 1;
        array = (T[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public boolean isFull(){
        return (size == capacity);
    }

    public void enqueue(T data){
        if (isFull()){
            System.out.println("The Queue is Full!");
            return;}

        rear = (rear + 1) % capacity;
        array[rear] = data;
        size++;
    }

    public T dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty!");
            return null;
        }
        T data = array[front];
        front= (front + 1) % capacity;
        size--;

        return data;
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        return array[front];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;

            result.append(array[index]);

            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}




























