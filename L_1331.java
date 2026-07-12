class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted_Arr = arr.clone();
        // int[] sorted_Arr = Arrays.copyOf(arr, arr.length); 
        Arrays.sort(sorted_Arr);
        Map<Integer, Integer> dict = new HashMap<>();
        int rank = 1;
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && sorted_Arr[i] > sorted_Arr[i-1]){
                rank = rank + 1;
            }
            dict.put(sorted_Arr[i], rank);
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = dict.get(arr[i]);
        }
        return arr;
    }
}
