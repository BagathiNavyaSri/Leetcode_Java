import java.util.Scanner;

class L_125 {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left<s.length() && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(right >= 0 && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(left<right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        sc.close();
    }
}