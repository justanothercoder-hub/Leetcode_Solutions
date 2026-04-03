class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> all = new ArrayList<>();
        HashMap<Integer,Integer> valid = new HashMap<>();

        for(int i : nums){
            valid.put(i,0);
        }

        permutation(nums, list, all, valid);
        return all;
    }

    public void permutation(int[] nums, List<Integer> list, List<List<Integer>> all, HashMap<Integer,Integer> valid){

        if(list.size() == nums.length){
            all.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i< nums.length; i++){

            if(valid.get(nums[i])==0){
            list.add(nums[i]);
            valid.put(nums[i], 1);
            

            permutation(nums, list, all, valid);


            valid.put(nums[i], 0);
            list.remove(list.size() - 1);
            }
        }
    }
}
