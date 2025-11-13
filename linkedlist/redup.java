package linkedlist;
public class redup {
     static  class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
   public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode p=head;
        while(p.next!=null){
   if (p.val==p.next.val){
    p.next=p.next.next;
}
else {
p=p.next;
}
        }
        return head;
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
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
 l1.next.next.next = new ListNode(2);
printList(l1);
        System.out.print("removed duplicated from List: ");
        printList(deleteDuplicates(l1));
    }
}
