package linkedlist;

public class rotate {
     static  class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
     public static ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null || k == 0) return head;
    ListNode p=head;
    int c=1;
    while (p.next!=null){
        c++;
        p=p.next;
        
    }
    p.next=head;
    k=k%c;
    int t= c-k-1;
    ListNode q=head;
for (int i=0;i<t;i++){
    q=q.next;
}
ListNode r= q.next;
q.next=null;
return r;
    }
      public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
        // create first sorted list: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

printList(l1);
        System.out.print("Rotated List: ");
        printList(rotateRight(l1, 2));
    }
}
