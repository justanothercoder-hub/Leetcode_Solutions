class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ansList = new ArrayList<>();
      helper(candidates,target,0, ansList, ans);
      return ans;
    }

    public void helper(int[] candidates, int target ,int index, List<Integer> ansList, List<List<Integer>> ans){
       if(target==0){
         ans.add(new ArrayList<Integer>(ansList));
         return;
       }
       else if(target < 0 ){
         return;
       }

       for(int i = index ; i< candidates.length; i++){
          ansList.add(candidates[i]);
          helper(candidates, target-candidates[i], i, ansList,ans);
          ansList.remove(ansList.size()-1);
       }
    }
}
