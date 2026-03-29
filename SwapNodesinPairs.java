class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

    
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode temp = head.next; 
        ListNode dum = new ListNode(); 

        
        while (p2 != null && p1 != null) {
            ListNode pair = p2.next;

            p1.next = pair;
            p2.next = p1;

            dum.next = p2;
            dum = p1;

            p1 = pair;
            if (p1 != null) {
               p2 = p1.next;
            } else {
               p2 = null;
            }
        }

        return temp;
    }
}
