import java.util.*;
class L_1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        for(int i = 0; i<nums.length;i++){
            arr[i] = nums[i];
        }
        for(int i = nums.length; i< arr.length;i++){
            arr[i] = nums[i-nums.length];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(nums)));
        sc.close();
    }
}