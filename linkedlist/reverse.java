package linkedlist;

public class reverse {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //  public static Node reveseList(Node head) {
    //     // Base case: If the list is empty or has only one node, it's already reversed.
    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     // Recursive call: Reverse the rest of the list starting from the second node.
    //   Node newHead = reveseList(head.next);

    //     // Rewire pointers:
    //     // Make the next node (which is now the last node of the reversed sublist)
    //     // point back to the current node.
    //     head.next.next = head;

    //     // Set the current node's next pointer to null to avoid a cycle,
    //     // as it will be the last node in the reversed list from this point down.
    //     head.next = null;

    //     // Return the new head of the full reversed list.
    //     return newHead;
    // }
     public static Node reverseList(Node head) {
       Node q = null;
      Node p=head;
        while(p!=null){
            Node n =p.next;
    p.next=q;
    q=p;
      p=n;
        }
        return q;
    }
     public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Linked List: ");
        printList(head);
System.out.println();
Node curr = head;
        Node r=reverseList(curr);
        // Node z=reveseList(head);
        printList(r);
        //  printList(z);
}

}
