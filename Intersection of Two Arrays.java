import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = nums1.length;
        int k = 1;

        
        for(int i=0; i<l; i++){
            if(map.containsKey(nums1[i]) == false){
                map.put(nums1[i], k);
                k++;
            }
        }

        ArrayList<Integer> toDelete = new ArrayList<>();

        for(int s : map.keySet()){
            boolean f = false; 
            
            for(int j=0; j < nums2.length; j++){ 
                if(s == nums2[j]){
                    f = true; 
                    break;
                }
            }
            
            if(f == false){
                toDelete.add(s);
            }
        }

        for(int s : toDelete){
            map.remove(s);
        }

        int[] array = map.keySet().stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
