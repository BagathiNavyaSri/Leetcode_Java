import java.util.Arrays;
import java.util.Scanner;

class L_283 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int num : nums){
            if(num != 0){
                nums[index++] = num; 
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
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
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr).replace(" ",""));

        sc.close();
    }
}