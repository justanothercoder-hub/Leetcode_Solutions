class Solution {
    public int firstUniqueEven(int[] nums) {
        
        int[] arr = new int[101];

        for(int i : nums) arr[i]++;

        for(int i=0; i<nums.length; i++) {
            
            if( nums[i] % 2 == 0 && arr[nums[i]] == 1) return nums[i];
        }

        return -1;
    }
}
