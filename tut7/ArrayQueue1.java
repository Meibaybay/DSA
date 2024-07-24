package Exercise;

class ArrayQueue {
    private int[] array;
    private int front;
    private int rear;
    private int maxSize = 100;

    public ArrayQueue(int i) {
        array = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            array[rear] = item;
            rear = (rear+1) % maxSize;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int pos = front;
            front = (front + 1) % maxSize;
            return array[pos];
        }
        return 0;
    }


    public boolean isEmpty() {
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (rear == front - 1) {
            return true;
        } else {
            return false;
        }
    }
}

public class ArrayQueue1 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
