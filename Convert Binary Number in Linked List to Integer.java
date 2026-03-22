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

Optimized solution:
    class Solution {
    public int getDecimalValue(ListNode head) {
        int res = 0;
        ListNode curr = head;

        while (curr != null) {
            res = (res * 2) + curr.val;  //important concept
            curr = curr.next;
        }
        return res;
    }
}
//we can also do this question with this method as well, here i observed the concept of binary number formation 
