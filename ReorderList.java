class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode p1 = new ListNode();
        ListNode p2 = new ListNode();

        p1=head;
        p2=head;

        while(p2.next != null && p2.next.next !=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }      

        ListNode head1 = new ListNode();
        head1=p1.next;
        p1.next = null;
        
        ListNode prev = head1;
        ListNode curr = head1.next;

        while(curr != null){
            ListNode dummy = curr.next;
            curr.next=prev;
            prev=curr;
            curr=dummy;
        }
        head1.next=null;
        head1=prev;
  
        ListNode ptr1 = head;
        ListNode ptr2 = head1;

        while(ptr2!=null){
            ListNode next1 = ptr1.next;
            ListNode next2 = ptr2.next;
            
            ptr1.next=ptr2;
            ptr2.next=next1;

            ptr1=next1;
            ptr2=next2;
        }
    }
}
