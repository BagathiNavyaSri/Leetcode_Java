import java.util.*;

class L_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length-1;
        while(low < high){
            if(numbers[low]+numbers[high] == target){
                return new int[]{low+1, high+1};
            }else if(numbers[low] + numbers[high] < target){
                low++;
            }else if(numbers[low] + numbers[high] > target){
                high--;
            }
        }
        return new int[]{};
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
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));

        sc.close();
    }
}