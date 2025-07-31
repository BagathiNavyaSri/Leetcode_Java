import java.util.*;
class L_594 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        int res = 0;
        for(int num : nums){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        List<Integer> arr_lst = new ArrayList<>(dict.keySet());
        Collections.sort(arr_lst);
        for(int i = 1; i<arr_lst.size();i++){
            if(arr_lst.get(i) - arr_lst.get(i-1) == 1){
                res = Math.max(res,(dict.get(arr_lst.get(i)) + dict.get(arr_lst.get(i-1))));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findLHS(nums));
        sc.close();
    }
}


// class Solution {
//     public int findLHS(int[] nums) {
//         Map<Integer, Integer> dict = new HashMap<>();
//         int res = 0;
//         for(int num : nums){
//             dict.put(num, dict.getOrDefault(num, 0)+1);
//         }
//         Set<Integer> kS = dict.keySet();
//         Integer[] arr = kS.toArray(new Integer[0]);
//         Arrays.sort(arr);
//         for(int i = 1; i<arr.length;i++){
//             if(arr[i] - arr[i-1] == 1){
//                 res = Math.max(res,(dict.get(arr[i]) + dict.get(arr[i-1])));
//             }
//         }
//         return res;
//     }
// }