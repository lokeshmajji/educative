package org.lokesh.educative;

public class HappyNumber {
    public static boolean find(int num) {
        // // TODO: Write your code here
        boolean cycleOf1Found = false;
        ListNode head = null;
        int sumOfSquares = num;
        int count = 0;
        while(count < 14){
            sumOfSquares =  getSumOfSquares(sumOfSquares);
           if(head == null) {
               System.out.println("adding head:" + sumOfSquares);
               head = new ListNode(sumOfSquares);
           } else {
                System.out.println("\nadding new node:" + sumOfSquares);
                if(sumOfSquares == 1) return true;
                addToList(head,sumOfSquares);
           }
            if(checkCycle(head)) return false;
            printList(head);

            count++;
        }
        return false;
    }

    public static void addToList(ListNode head, int value) {
        ListNode current = head;
        ListNode checkNode = checkIfNodeExists(head,value);
        while(current != null && current.next != null) {
            current = current.next;
        }
        System.out.println("current node:" + current);
        if( checkNode!= null) {
            System.out.println("found duplicate node:" + checkNode);
            System.out.println("Set a cycle here");
            current.next = checkNode;
        } else {
            System.out.print(":Value not found\n");
            current.next = new ListNode(value);
        }


    }
    public static ListNode checkIfNodeExists(ListNode head,int value){
        ListNode current = head;
        System.out.print("Check if value exists already:" + value);
        while(current != null) {
//            System.out.print(current + "::");
            if(current.value == value) return current;
            current = current.next;
        }
        return null;
    }
    public static void printList(ListNode head){
        System.out.print("Current List:");
        ListNode current = head;
        while(current != null) {
            System.out.print( current + "->" );
            current = current.next;
        }
        System.out.println();
    }
    public static int getSumOfSquares(int num) {
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem;
            num = num / 10;
        }
        //System.out.println("sum of squares:"+sum);
        return sum;
    }

    public static boolean checkCycle(ListNode head){
        System.out.print ("checking cycle:");
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                System.out.print("found *****");
                return true;
            }
        }
        System.out.print("not found \n");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.find(23));
        System.out.println("\nhappy number:" + HappyNumber.find(12));
    }
}
