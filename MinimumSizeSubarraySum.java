class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int lp = 0;
        int rp = 0;

        int l = nums.length;

        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        if(nums.length==0) return 0;

        while(lp<l){
            
            if(sum<target && rp < l){
                sum = sum + nums[rp];
                rp++;
            }
            else if(sum>target){
                minLength = Math.min(minLength, (rp - lp)); 
                sum = sum - nums[lp];
                lp++;
            }
            else if(sum == target){
                minLength = Math.min(minLength, (rp - lp));
                sum = sum - nums[lp];
                lp++;
            }
            else if (sum < target && rp == l) {
                break;
            }

        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
        
    }
}
