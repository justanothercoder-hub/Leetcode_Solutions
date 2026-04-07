class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++){
            
            while(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            sum += nums[right]; 
            set.add(nums[right]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
