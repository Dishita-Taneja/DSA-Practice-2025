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

        Node r=reverseList(head);
        printList(r);
}

}
