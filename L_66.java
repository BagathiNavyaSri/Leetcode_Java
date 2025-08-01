import java.util.*;
class L_66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i>= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] fin_arr = new int[n+1];
        fin_arr[0] = 1;
        return fin_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i = 0; i<n; i++){
            digits[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(plusOne(digits)));
        sc.close();
    }

    
}