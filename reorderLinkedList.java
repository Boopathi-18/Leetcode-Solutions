import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class reorderLinkedList {

    public static void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (second != null) {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        // Merge two halves
        ListNode first = head;
        second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        reorderList(head);

        temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        sc.close();
    }
}