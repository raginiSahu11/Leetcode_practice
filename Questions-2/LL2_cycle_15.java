// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LL2_cycle_15 {

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) break;
        }

        // No cycle
        if (fast == null || fast.next == null) return null;

        // Step 2: Find start of cycle
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        return head;
    }

    // Helper to create cycle
    public static ListNode createCycle() {
        // 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create cycle: last node points to node with value 3
        fifth.next = third;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = createCycle();

        ListNode cycleStart = detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}