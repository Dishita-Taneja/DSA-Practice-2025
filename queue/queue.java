package queue;
    import java.util.*;
public class queue {

    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public queue(int k) {
        capacity = k;
        arr = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element into queue
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        return true;
    }

    // Delete element from queue
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    // Get front item
    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    // Get rear item
    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        // Create a circular queue of size 3
        queue q = new queue(3);

        // Run operations (no user input)
        System.out.println(q.enQueue(1)); // true
        System.out.println(q.enQueue(2)); // true
        System.out.println(q.enQueue(3)); // true
        System.out.println(q.enQueue(4)); // false (queue full)
        System.out.println(q.Rear());     // 3
        System.out.println(q.isFull());   // true
        System.out.println(q.deQueue());  // true
        System.out.println(q.enQueue(4)); // true
        System.out.println(q.Rear());     // 4

        // Optional: print front element and empty/full states
        System.out.println("Front element: " + q.Front());
        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());
    }
}


// easy way of writing 
// class MyCircularQueue {
//     int queue[];
//     int rear;
//     int front;
//     int size;
//     int capacity;

//     public MyCircularQueue(int k) {
//         queue = new int[k];
//         rear = -1;
//         front = -1;
//         size = 0;
//         capacity = k;
//     }
    
//     public boolean enQueue(int value) {
//         if (isFull()) return false;
//         if (isEmpty()) {
//             front = 0;
//             rear = 0;
//         } else {
//             rear = (rear + 1) % capacity;
//         }
//         queue[rear] = value;
//         size++;
//         return true;

//     }
    
//     public boolean deQueue() {
//         if (isEmpty()) return false;
//         if (front == rear) {
//             front = -1;
//             rear = -1;
//         } else {
//             front = (front + 1) % capacity;
//         }
//         size--;
//         return true;

//     }
    
//     public int Front() {
//         return isEmpty() ? -1:queue[front];
//     }
    
//     public int Rear() {
//         return isEmpty() ? -1:queue[rear];
//     }
    
//     public boolean isEmpty() {
//         return size == 0;
//     }
    
//     public boolean isFull() {
//         return size == capacity;
//     }
// }