package org.lokesh.educative;

class ListNode {
    int value ;
    ListNode next;
    public ListNode(int value){
        this.value = value;
    }
}
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
        System.out.println("LinkedList cycle length: " + LinkedListCycle.findCycleLength(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList has cycle: " + LinkedListCycle.hasCycle(head));
        System.out.println("LinkedList cycle length: " + LinkedListCycle.findCycleLength(head));


    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static int findCycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return calculateLength(slow);
        }
        return 0;
    }

    public static int calculateLength(ListNode slow) {
        ListNode current = slow;
        int length = 0;
        do {
            current = current.next;
            length++;
        } while(current != slow);

        return  length;
    }
}
