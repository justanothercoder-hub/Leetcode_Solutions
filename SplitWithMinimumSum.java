class Solution {
    public int splitNum(int num) {
        
        ArrayList<Integer> al = new ArrayList<>();
        
        while(num != 0) {
            int digit = num % 10;
            al.add(digit);
            num /= 10;
        }

        Collections.sort(al);

        int num1 = 0;
        int num2 = 0;

        for(int i=0; i<al.size(); i++) {
            if( i % 2 == 0) num1 = num1*10 + al.get(i);
            else num2 = num2*10 + al.get(i);
        }

        return num1+num2;
    }
}
