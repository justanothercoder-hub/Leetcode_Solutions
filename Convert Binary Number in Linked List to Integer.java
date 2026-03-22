/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            list.add(curr.val);
            curr=curr.next;
        }

         
         int l = list.size();
         int num=0;
         for(int a = 0; a<l ; a++){
             int s = list.get(a);
             num +=(int) (s*Math.pow(2,l-a-1));
         }
        return num;
    }
}
