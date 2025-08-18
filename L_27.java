import java.util.Scanner;

class L_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0 ;
        for(int num : nums){
            if(num != val){
                nums[count] = num;
                count++;
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
        int val = sc.nextInt();
        System.out.println(removeElement(arr, val));
        sc.close();
    }
}