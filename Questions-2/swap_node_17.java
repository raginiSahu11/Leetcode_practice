// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    // Constructor with one parameter
    ListNode(int x) {
        val = x;
        next = null;
    }

    // Constructor with two parameters (needed for dummy node)
    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
}

public class swap_node_17 {

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;

        while (cur != null && cur.next != null) {
            ListNode npn = cur.next.next;
            ListNode second = cur.next;

            // Swapping
            second.next = cur;
            cur.next = npn;
            prev.next = second;

            // Move pointers forward
            prev = cur;
            cur = npn;
        }

        return dummy.next;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Sample Input: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        head = swapPairs(head);

        System.out.print("After Swapping Pairs: ");
        printList(head);
    }
}