import java.util.*;
class L_3541 {
    public static int maxFreqSum(String s) {
        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels.put(ch, vowels.getOrDefault(ch, 0)+1);
            }else{
                consonants.put(ch, consonants.getOrDefault(ch, 0)+1);
            }
        }
        int v_max = 0;
        int c_max = 0;
        for(int val : vowels.values()){
            v_max = Math.max(v_max, val);
        }
        for(int val : consonants.values()){
            c_max = Math.max(c_max, val);
        }
        return v_max+c_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxFreqSum(s));
        sc.close();
    }
}
