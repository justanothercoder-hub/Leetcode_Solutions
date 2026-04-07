class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right = 0; right<fruits.length; right++){
            int curr = fruits[right];
            map.put(curr,map.getOrDefault(curr,0)+1);
            while (map.size()>2){
                int leftFruit = fruits[left];
                map.put(leftFruit,map.get(leftFruit)-1);

                if(map.get(leftFruit)==0){
                    map.remove(leftFruit);
                }
                left++;
            }
             max = Math.max(max,right - left + 1);
        }
        return max;
    }
}
