package org.lokesh.educative;
public class LinkedListCycleStart {
    public static ListNode findCycleStart(ListNode head) {
        // TODO: Write your code here
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        int length = checkCycleAndGetLength(head);
        System.out.println("length of cycle:"+ length);
        while(length > 0) {
            pointer2 = pointer2.next;
            length--;
        }
        System.out.println(pointer2);

        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
    public static int checkCycleAndGetLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return getCycleLength(slow);
        }
        return 0;
    }
    public static int getCycleLength(ListNode slow){
         ListNode current = slow;
         int length = 0;
         do {
             current = current.next;
             length++;
         } while(current != slow);
         return length;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);

        head.next.next.next.next.next.next = head;
        System.out.println("LinkedList cycle start: " + LinkedListCycleStart.findCycleStart(head).value);
    }
}
