import java.util.*;
class L_2206 {
    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int num : nums){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        for(int val : dict.values()){
            if(val%2 != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(divideArray(nums));
        sc.close();
    }
}