// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Handle single node list
        if (head.next == null) return null;
        
        ListNode ptr = head;
        ListNode temp = head;
        
        // Move ptr forward n times
        int i = 1;
        while (i <= n) {
            ptr = ptr.next;
            i++;
        }
        
        // If ptr becomes null → remove head
        if (ptr == null) return head.next;
        
        // Move both pointers
        while (ptr.next != null) {
            ptr = ptr.next;
            temp = temp.next;
        }
        
        // Delete nth node from end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        
        return head;
    }

    // Helper function to print list
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

        int n = 2; // Remove 2nd node from end

        System.out.print("Original List: ");
        printList(head);

        Solution obj = new Solution();
        head = obj.removeNthFromEnd(head, n);

        System.out.print("After Removal: ");
        printList(head);
    }
}