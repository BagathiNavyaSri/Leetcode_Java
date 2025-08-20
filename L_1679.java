import java.util.*;
class L_1679 {
    public static int maxOperations(int[] nums, int k) {
        int count = 0, left = 0, right = nums.length-1;
        Arrays.sort(nums);
        while(left < right){
            if(nums[left] + nums[right] == k){
                count++;
                left++;
                right--;
            }else if(nums[left] + nums[right] > k){
                right--;
            }else{
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace("[","").replace("]","");
        String[] parts = input.split(",");
        int[] arr = new int[parts.length];
        for(int i = 0; i<parts.length;i++){
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        int k = sc.nextInt();
        System.out.println(maxOperations(arr, k));
        sc.close();
    }
}