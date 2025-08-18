import java.util.Scanner;

class L_11 {
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length-1;
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(max, area);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;      //even if both are equal we are changing right.. We can change anyone
            }
        }
        return max;
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
        System.out.println(maxArea(arr));
        sc.close();
    }
}