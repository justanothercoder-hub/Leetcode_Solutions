class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,0,temp,finalList);
        return finalList;
    }

    public void helper(int [] candidates, int target, int curr, List<Integer> temp,List<List<Integer>> finalList){
        if(target == 0){
            finalList.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }

        for(int i = curr; i<candidates.length; i++){
            if(i>curr && candidates[i] == candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], i+1, temp, finalList);
            temp.remove(temp.size()-1);
        }
    }
}
