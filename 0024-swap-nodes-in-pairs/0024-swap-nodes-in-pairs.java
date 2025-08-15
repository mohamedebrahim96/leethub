class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    // For local testing with the driver
    public static ListNode deserialize(String data) {
        if (data == null || data.length() <= 2) return null; // "[]"
        data = data.substring(1, data.length() - 1); // remove brackets
        if (data.isEmpty()) return null;

        String[] parts = data.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) {
            current.next = new ListNode(Integer.parseInt(part.trim()));
            current = current.next;
        }
        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) sb.append(",");
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // swap
            prev.next = second;
            first.next = second.next;
            second.next = first;

            // move pointers
            prev = first;
            head = first.next;
        }

        return dummy.next;
    }
}