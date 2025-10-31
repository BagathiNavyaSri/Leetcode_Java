class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        Set<Integer> s = new HashSet<>();
        int i = 0;
        for(int num : nums){
            if(i == 2){
                return arr;
            }
            if(s.contains(num)){
                arr[i] = num;
                i++;
            }
            s.add(num);
        }
        return arr;
    }
}

// class Solution {
//     public int[] getSneakyNumbers(int[] nums) {
//         Map<Integer, Integer> dict = new HashMap<>();
//         int[] arr = new int[2];

//         for(int num  : nums){
//             dict.put(num, dict.getOrDefault(num, 0)+1);
//         }
//         int i = 0;
//         for(Map.Entry<Integer, Integer> entry : dict.entrySet()){
//             if(entry.getValue() ==  2){
//                 arr[i] = entry.getKey();
//                 i++;
//             }
//         }
//         return arr;
//     }
// }
