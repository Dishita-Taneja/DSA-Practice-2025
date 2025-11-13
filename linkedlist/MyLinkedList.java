package linkedlist;
//method 1 
// public class MyLinkedList {

//     // Step 1: Define a Node class to represent each element in the linked list
//     class Node {
//         int val;      // the data/value stored in this node
//         Node next;    // pointer to the next node

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     // Step 2: Define the head (start of the list) and size (number of elements)
//     Node head;
//     int size;

//     // Step 3: Constructor — initialize an empty linked list
//     public MyLinkedList() {
//         head = null;
//         size = 0;
//     }

//     // Step 4: Get the value at a particular index
//     public int get(int index) {
//         if (index < 0 || index >= size) return -1;  // invalid index
//         Node curr = head;
//         for (int i = 0; i < index; i++) {
//             curr = curr.next;  // move to next node
//         }
//         return curr.val;
//     }

//     // Step 5: Add a node at the head (beginning)
//     public void addAtHead(int val) {
//         Node newNode = new Node(val); // create a new node
//         newNode.next = head;          // point new node to current head
//         head = newNode;               // update head to new node
//         size++;
//     }

//     // Step 6: Add a node at the tail (end)
//     public void addAtTail(int val) {
//         Node newNode = new Node(val);
//         if (head == null) {  // if list is empty
//             head = newNode;
//         } else {
//             Node curr = head;
//             while (curr.next != null) {
//                 curr = curr.next; // move to last node
//             }
//             curr.next = newNode;  // link the last node to the new node
//         }
//         size++;
//     }

//     // Step 7: Add a node at a specific index
//     public void addAtIndex(int index, int val) {
//         if (index > size) return;  // invalid index
//         if (index <= 0) {          // if index <= 0, add at head
//             addAtHead(val);
//             return;
//         }
//         if (index == size) {       // if index == size, add at tail
//             addAtTail(val);
//             return;
//         }

//         Node curr = head;
//         for (int i = 0; i < index - 1; i++) {
//             curr = curr.next;  // move to node before insertion point
//         }

//         // Visual: insert between curr and curr.next
//         Node newNode = new Node(val);
//         newNode.next = curr.next;  // link new node to next node
//         curr.next = newNode;       // link previous node to new node
//         size++;
//     }

//     // Step 8: Delete node at a specific index
//     public void deleteAtIndex(int index) {
//         if (index < 0 || index >= size) return;  // invalid index

//         if (index == 0) { // delete first element
//             head = head.next;
//         } else {
//             Node curr = head;
//             for (int i = 0; i < index - 1; i++) {
//                 curr = curr.next;
//             }
//             curr.next = curr.next.next; // skip the deleted node
//         }
//         size--;
//     }

//     // (Optional) Print list for your understanding
//     public void printList() {
//         Node curr = head;
//         System.out.print("LinkedList: ");
//         while (curr != null) {
//             System.out.print(curr.val + " -> ");
//             curr = curr.next;
//         }
//         System.out.println("null");
//     }

//     // Test the implementation
//     public static void main(String[] args) {
//         MyLinkedList list = new MyLinkedList();

//         list.addAtHead(1);
//         list.addAtTail(3);
//         list.addAtIndex(1, 2);  // linked list becomes 1 -> 2 -> 3
//         list.printList();

//         System.out.println("Value at index 1: " + list.get(1));  // 2
//         list.deleteAtIndex(1);   // delete node with value 2
//         list.printList();

//         System.out.println("Value at index 1: " + list.get(1));  // 3
//     }
// }

// method 2 

import java.util.*;

class MyLinkedList {

    ArrayList<Integer> arr;

    MyLinkedList() {
        arr = new ArrayList<>();
    }

    int get(int index) {
        if (index < 0 || index >= arr.size()) return -1;
        return arr.get(index);
    }

    void addAtHead(int val) {
        arr.add(0, val);
    }

    void addAtTail(int val) {
        arr.add(val);
    }

    void addAtIndex(int index, int val) {
        if (index >= 0 && index <= arr.size()) {
            arr.add(index, val);
        }
    }

    void deleteAtIndex(int index) {
        if (index >= 0 && index < arr.size()) {
            arr.remove(index);
        }
    }

    // Optional: print the list to visualize
    void printList() {
        System.out.println(arr.toString());
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2); // [1, 2, 3]
        list.printList();

        System.out.println(list.get(1)); // prints 2
        list.deleteAtIndex(1); // [1, 3]
        list.printList();

        System.out.println(list.get(1)); // prints 3
    }
}