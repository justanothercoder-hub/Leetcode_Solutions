class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> all = new ArrayList<>();
        HashMap<Integer,Integer> valid = new HashMap<>();

        for(int i : nums){
            valid.put(i, valid.getOrDefault(i, 0) + 1);
        }

        permutation(nums.length, list, all, valid);
        return all;
    }

    public void permutation(int n, List<Integer> list, List<List<Integer>> all, HashMap<Integer,Integer> valid){

        if(list.size() == n){
            all.add(new ArrayList<>(list));
            return;
        }

        for(int key : valid.keySet()){

            if(valid.get(key) > 0){
                list.add(key);
                valid.put(key, valid.get(key) - 1);

                permutation(n, list, all, valid);

                valid.put(key, valid.get(key) + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
