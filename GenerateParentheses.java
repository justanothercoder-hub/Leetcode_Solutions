class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> masterList = new ArrayList<>();
        
      
        helper(masterList, "", n, n);
        
        return masterList;
    }

    private void helper(List<String> masterList, String currentString, int leftRemaining, int rightRemaining) {
        
       
        if (leftRemaining == 0 && rightRemaining == 0) {
            masterList.add(currentString);
            return;
        }

     
        if (leftRemaining > 0) {
            
            helper(masterList, currentString + "(", leftRemaining - 1, rightRemaining);
        }

        if (rightRemaining > leftRemaining) {
            helper(masterList, currentString + ")", leftRemaining, rightRemaining - 1);
        }
    }
}
