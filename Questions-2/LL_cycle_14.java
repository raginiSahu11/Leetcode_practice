// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LL_cycle_14 {

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    // Helper function to create a cycle
    public static ListNode createCycle() {
        // 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle: last node points to second node
        fourth.next = second;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = createCycle();

        boolean result = hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + result);
    }
}