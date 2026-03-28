class Solution {
    public int passThePillow(int n, int time) {
        
        int start = 1;
        boolean pass = true;

        while( time > 0) {
            if(pass == true) {
                start ++;
                time--;
            }
            else {
                start--;
                time--;
            }

            if(start == n) {
                pass = false;
            }
            else if (start == 1) {
                pass = true;
            }
        }

        return start;
    }
}
