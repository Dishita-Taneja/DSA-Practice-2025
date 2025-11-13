package linkedlist;

public class merge {
   static  class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(-1);
        ListNode p = n;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                p.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            p = p.next;
        }
        while (l1 != null) {
            p.next = new ListNode(l1.val);
            l1 = l1.next;
            p = p.next;
        }
        while (l2 != null) {
            p.next = new ListNode(l2.val);
            l2 = l2.next;
            p = p.next;
        }
        return n.next;
    }

    // Helper function to print a linked list
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
        // create second sorted list: 2 -> 4 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
printList(l2);
        ListNode merged = mergeTwoLists(l1, l2);

        System.out.print("Merged List: ");
        printList(merged);
    }
}
