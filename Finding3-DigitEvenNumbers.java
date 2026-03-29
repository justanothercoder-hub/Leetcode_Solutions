class Solution {
    List<Integer> list = new ArrayList<>();
    int[] freq = new int[10];
    public int[] findEvenNumbers(int[] digits) {

        for(int i : digits){
            freq[i]++;
        }

        recursion(list, 0, 0, -1);

        int size = list.size();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i]=list.get(i);
        }

        return arr;
        
    }

    public void recursion(List<Integer> list, int sum, int length, int currdigit){
        if(currdigit == 0 && length == 1){
            return;
        }
        if(currdigit % 2 != 0 && length == 3){
            return;
        }
        if(currdigit % 2 == 0 && length == 3){
            list.add(sum);
            return;
        }

        for(int i = 0; i<10 ; i++){
            if(freq[i]>0){
                currdigit = i;

                freq[i]--;
                recursion(list, sum * 10 + i, length + 1, currdigit);
                freq[i]++;
            }
        }

    }
}
