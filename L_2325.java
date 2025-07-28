import java.util.*;
class L_2325 {
    public static String decodeMessage(String key, String message) {
        Map<Character, Character> dict = new HashMap<>();
        char cur_ch = 'a';
        for(char ch : key.toCharArray()){
            if(Character.isLetter(ch)){
                if(!dict.containsKey(ch)){
                    dict.put(ch,cur_ch);
                    cur_ch ++;
                }
            }
        }
        dict.put(' ',' ');
        String result = "";
        for(char ch : message.toCharArray()){
            result += dict.get(ch);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k1 = sc.nextLine();
        String m1 = sc.nextLine();
        System.out.println(decodeMessage(k1, m1));
        sc.close();
    }
}