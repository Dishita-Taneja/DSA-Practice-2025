package linkedlist;

class ListNode {
    int val;
    ListNode next;

    // Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteNodeInLinkedList {

    // Function to delete a given node (you are NOT given the head)
    public static void deleteNode(ListNode node) {
        // Copy the data of the next node to this node
        node.val = node.next.val;

        // Skip the next node
        node.next = node.next.next;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main function to test the logic
    public static void main(String[] args) {
        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Original Linked List:");
        printList(head);

        // Suppose we are given the node with value 5 to delete
        ListNode nodeToDelete = head.next; // node with value 5

        // Delete the node
        deleteNode(nodeToDelete);

        System.out.println("\nAfter deleting node 5:");
        printList(head);
    }
}
