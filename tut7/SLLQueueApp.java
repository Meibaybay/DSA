package Example;

class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SLLQueue {
    private QueueNode front;
    private QueueNode rear;

    public SLLQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int item) {
        QueueNode newNode = new QueueNode(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }


    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }


    public boolean isEmpty() {
        return front == null;
    }

}

public class SLLQueueApp {
    public static void main(String[] args) {
        SLLQueue q = new SLLQueue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(3);
        printQueue(q);
        System.out.println("Max number in the queue: " + findMax(q));
        System.out.println("Min number in the queue: " + findMin(q));
    }

    public static void printQueue(SLLQueue q) {
        System.out.println("Queue elements:");
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }

    public static int findMax(SLLQueue q) {
        int max = Integer.MIN_VALUE;
        SLLQueue tempQ = new SLLQueue();
        while (!q.isEmpty()) {
            int num = q.dequeue();
            max = Math.max(max, num);
            tempQ.enqueue(num);
        }
        while (!tempQ.isEmpty()) {
            q.enqueue(tempQ.dequeue());
        }
        return max;
    }

    public static int findMin(SLLQueue q) {
        int min = Integer.MAX_VALUE;
        SLLQueue tempQ = new SLLQueue();
        while (!q.isEmpty()) {
            int num = q.dequeue();
            min = Math.min(min, num);
            tempQ.enqueue(num);
        }
        while (!tempQ.isEmpty()) {
            q.enqueue(tempQ.dequeue());
        }
        return min;
    }
}
