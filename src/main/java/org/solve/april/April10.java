package org.solve.april;

public class April10 {

    public static void main(String[] args) {
        ListNode t1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode t2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode t3 = new ListNode(1, new ListNode(1, new ListNode(1)));
        ListNode t4 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode t5 = new ListNode(1, new ListNode(1));

        System.out.println("deleteDuplicates(t1) = " + deleteDuplicates(t1));
        System.out.println("deleteDuplicates(t2) = " + deleteDuplicates(t2));
    }


    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode start = head;

        while (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }

        return start;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}

        @Override
        public String toString() {
            return "Node={ val = %s, next = %s}".formatted(val, next);
        }
    }

}
