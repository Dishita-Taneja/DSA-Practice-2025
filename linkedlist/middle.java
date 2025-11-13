package linkedlist;

public class middle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node middleNode(Node head) {
       Node p=head;
        Node q=head;
        while(q!=null && q.next!=null){
            p=p.next;
            q=q.next.next;
        }
        return p;
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

        Node mid = middleNode(head);
        System.out.println("Middle Node: " + mid.data);
}

}
