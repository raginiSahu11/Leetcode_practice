// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class rotate_LL_18 {

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        // Step 1: Find length and last node
        ListNode temp = head;
        int n = 1;

        while (temp.next != null) {
            temp = temp.next;
            n++;
        }

        // Step 2: Make circular linked list
        temp.next = head;

        // Step 3: Optimize k
        k = k % n;

        // Step 4: Find new tail
        int steps = n - k;
        ListNode ptr = head;

        for (int i = 1; i < steps; i++) {
            ptr = ptr.next;
        }

        // Step 5: Set new head and break circle
        head = ptr.next;
        ptr.next = null;

        return head;
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
        // Sample Input: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        System.out.print("Original List: ");
        printList(head);

        head = rotateRight(head, k);

        System.out.print("After Rotation: ");
        printList(head);
    }
}