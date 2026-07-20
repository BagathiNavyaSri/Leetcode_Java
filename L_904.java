class Solution {
    public int totalFruit(int[] fruits) {
        int maxcount = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0)+1);

            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left])-1);
                
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxcount = Math.max(maxcount, right-left+1);
        }
        return maxcount;
    }
}

// //THIS IS VALID IF THERE IS NO TIME COMPLEXITY CONSTRAINT. HERE TIMECOMPLEXITY IS O(n);
// 
// class Solution {
//     public int totalFruit(int[] fruits) {
//         int n = fruits.length;
//         int maxcount = 0;
//         for(int l = 0; l < n; l++){
//             HashMap<Integer, Integer> map = new HashMap<>();
//             int count = 0;
//             for(int r = l; r < n; r++){
//                 map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);

//                 if(map.size() > 2){
//                     break;
//                 }
//                 count++;
//             }
//             maxcount = Math.max(maxcount,count);
//         }
//         return maxcount;
//     }
// }
