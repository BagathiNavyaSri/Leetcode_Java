import java.util.Scanner;

class L_392 {
    public static boolean isSubsequence(String s, String t) {
        int l_p = 0, r_p = 0;
        while(l_p < s.length() && r_p < t.length()){
            if(s.charAt(l_p) == t.charAt(r_p)){
                l_p++;
                r_p++;
            }else{
                r_p++;
            }
        }
        return l_p == s.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(isSubsequence(s, t));
        sc.close();
    }
}