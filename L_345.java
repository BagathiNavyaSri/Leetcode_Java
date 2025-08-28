import java.util.Scanner;

class Solution {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = s.length()-1;
        while(left < right){
            while( left<right && !isVowel(sb.charAt(left))){
                left++;
            }
            while(left<right && !isVowel(sb.charAt(right))){
                right--;
            }
            if(isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))){
                char temp = sb.charAt(right);
                sb.setCharAt(right, sb.charAt(left));
                sb.setCharAt(left, temp);
                left++;
                right--;
            }
        }
        return sb.toString();
    }
    private static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' ||ch == 'i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseVowels(s));
        sc.close();
    }
}

