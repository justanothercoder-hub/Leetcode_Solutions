class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int flag=0;
        int k;
        int l=nums.length;

        if(nums[l-1] != l){return l;}
        if(nums[0] != 0){return 0;}

        for(int i=0; i<l-1; i++){
              if(nums[i+1]-nums[i]==1){continue;}
              else if(nums[i+1]-nums[i]>1){ 
                return nums[i]+1;
            }
        }
       return -1; 
    }
}
