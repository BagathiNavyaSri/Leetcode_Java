import java.util.*;
class L_1464 {
    public static int maxProduct(int[] nums) {
        int first_max = 0;
        int second_max = 0;
        for(int num : nums){
            if(num > first_max ){
                second_max = first_max;
                first_max = num;
            }else if(num>second_max){
                second_max = num;
            }
        }
        return (first_max-1)*(second_max-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =0 ;i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
        sc.close();
    }
}