import java.util.*;
class L_1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] t_A = new int[nums.length];
        int size = 0;

        for(int i = 0; i<nums.length;i++){
            int pos = index[i];
            int value = nums[i];
            for(int j = size-1; j >= pos; j--){
                t_A[j+1] = t_A[j];
            }
            t_A[pos] = value;
            size++;
        }
        return t_A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        for(int i = 0; i<size;i++){
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i<size;i++){
            index[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        sc.close();
    }
}