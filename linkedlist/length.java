package linkedlist;

public class length {

    // Node class (represents one element of the linked list)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to count the number of nodes in the linked list
    public static int getCount(Node head) {
        int c = 0;        // counter to count nodes
        Node p = head;    // pointer to traverse the list

        while (p != null) { // traverse till end
            c++;            // count each node
            p = p.next;     // move to next node
        }

        return c; // return total count
    }

    // Driver code to test the function
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Count the nodes
        int count = getCount(head);
        System.out.println("Number of nodes: " + count);
    }
}
