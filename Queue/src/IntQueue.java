/***************************************************************
 Unlike stacks, a queue is open at both its ends.
 One end is always used to insert data (enqueue)
 and the other is used to remove data (dequeue).
 Queue follows First-In-First-Out methodology, i.e.,
 the data item stored first will be accessed .

 What we need:

 Queue - structure to hold data
 Enqueue - to insert data
 Dequeue - to remove data
 Front - will be used to enqueue
 Rear - will be used to dequeue
 ****************************************************************/

public class IntQueue {

    private int[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    //  Default constructor
    public IntQueue() {

        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[size];

    }

    //  Constructor for user to change size
    public IntQueue(int size) {

        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];

    }

    // Add item to queue (points to rear or top).
    public boolean enqueue(int item) {

        // Check if space exists in queue
        if (isFull()) {
            return false;
        } else {
            total++;    // Total items
            queue[rear] = item; // Add item to rear of queue
            rear = (rear + 1) % size; // Rear index
            return true;
        }
    }

    // Remove item from queue (points to front or bottom).
    public int dequeue() {
        int item = queue[front];
        total--;    // Subtract one from total
        front = (front + 1) % size;    // Move next item to front
        return item;
    }

    public boolean isFull() {
        if (size == total) {
            return true;
        } else {
            return false;
        }
    }

    public void showAll() {
        int f = front;
        if (total != 0) {
            for (int i = 0; i < total; i++) {
                System.out.println(" " + queue[f]);
                f = (f + 1) % size;
            }
        }
    }

}