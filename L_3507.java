class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count = 0;
        List<Integer> al = new ArrayList<Integer>();
        for(int num : nums) al.add(num);

        while(!isSorted(al)){
            int minSum = Integer.MAX_VALUE;
            int index = -1;

            for(int i = 0; i < al.size()-1; i++){
                int sum = al.get(i) + al.get(i+1);
                if(sum < minSum){
                    minSum = sum;
                    index = i;
                }
            }

            int merged = al.get(index) + al.get(index + 1);
            al.remove(index+1);
            al.set(index, merged);

            count++;
        }
        return count;
    }

    private static boolean isSorted(List<Integer> al){
        for(int i = 0; i < al.size()-1; i++){
            if(al.get(i) > al.get(i+1)) return false;
        }
        return true;
    }
}
