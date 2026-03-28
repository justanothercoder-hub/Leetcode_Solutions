class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        
        int[] arr = new int[101];
        for(int i: nums) arr[i]++;

        Arrays.sort(nums);
        int[] ans = new int[2];
        ans[0] = nums[0];
        ans[1] = -1;

        for(int i: nums) {
            if(i != nums[0] && arr[i] != arr[nums[0]]) {
                ans[1] = i;
                return ans;
            }
        }

        if(ans[1] == -1) ans[0] = -1;
        return ans;

    }
}
