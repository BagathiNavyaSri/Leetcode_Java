import java.util.*;
class L_169 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int num : nums){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }
        int max_ele = 0;
        int max_freq = 0;
        for(Map.Entry<Integer, Integer> entry:dict.entrySet()){
            if(entry.getValue() > max_freq){
                max_freq = entry.getValue();
                max_ele = entry.getKey();
            }
        }
        return max_ele;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
        sc.close();
    }
}