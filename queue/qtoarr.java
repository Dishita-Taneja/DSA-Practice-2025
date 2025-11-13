package queue;
 import java.util.*;
public class qtoarr {
    int n;
    int[] arr;
    int f, r;
    int size;

    // Constructor
    public qtoarr(int n) {
        this.n = n;
        arr = new int[n];
        f = 0;
        r = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == n;
    }

    public void enqueue(int x) {
        if (isFull()) return;
        r = (r + 1) % n;
        arr[r] = x;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) return;
        f = (f + 1) % n;
        size--;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[f];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[r];
    }

    public static void main(String[] args) {
        int n = 2;  // queue size
        int[][] queries = {
            {1, 1},
            {2},
            {4},
            {5},
            {3},
            {4},
            {1, 7},
            {6}
        };

        qtoarr queue = new qtoarr(n);
        ArrayList<Object> result = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0];

            switch (type) {
                case 1: // enqueue
                    queue.enqueue(q[1]);
                    break;
                case 2: // dequeue
                    queue.dequeue();
                    break;
                case 3: // getFront
                    result.add(queue.getFront());
                    break;
                case 4: // getRear
                    result.add(queue.getRear());
                    break;
                case 5: // isEmpty
                    result.add(queue.isEmpty());
                    break;
                case 6: // isFull
                    result.add(queue.isFull());
                    break;
            }
        }

        System.out.println(result);
    }

}
