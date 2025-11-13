package linkedlist;

public class add {
    static  class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
     public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode p = n;
        int c= 0;

        // iterate while l1 or l2 or carry is not finished
        while (l1 != null || l2 != null || c != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + c;
            c = sum / 10;

            p.next = new ListNode(sum % 10); // create node with last digit
            p = p.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return n.next;
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
        
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
printList(l1);


        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
printList(l2);
        

        printList(addTwoNumbers(l1, l2));
    }

}
