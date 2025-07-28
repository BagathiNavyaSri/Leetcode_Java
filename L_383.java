import java.util.*;
class L_383{
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            dict.put(ch,dict.getOrDefault(ch, 0)+1);
        }
        for(char ch: ransomNote.toCharArray()){
            if(!dict.containsKey(ch) || dict.get(ch) == 0){
                return false;
            }else{                
                dict.put(ch, dict.get(ch)-1);                
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        String m = sc.next();
        System.out.println(canConstruct(r, m));
        sc.close();
    }
}


// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> dict = new HashMap<>();
//         for(char ch : magazine.toCharArray()){
//             if(!dict.containsKey(ch)){
//                 dict.put(ch, 1);
//             }else{
//                 dict.put(ch, dict.get(ch)+1);
//             }
//         }
//         for(char ch: ransomNote.toCharArray()){
//             if(!dict.containsKey(ch) || dict.get(ch) == 0){
//                 return false;
//             }else{                
//                 dict.put(ch, dict.get(ch)-1);                
//             }
//         }
//         return true;
//     }
// }






// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> dict = new HashMap<>();
//         for(char ch : magazine.toCharArray()){
//             if(!dict.containsKey(ch)){
//                 dict.put(ch, 1);
//             }else{
//                 dict.put(ch, dict.get(ch)+1);
//             }
//         }
//         for(char ch: ransomNote.toCharArray()){
//             if(!dict.containsKey(ch)){
//                 return false;
//             }else if(dict.get(ch) == 0){
//                 return false;
//             }else{
//                 dict.put(ch, dict.get(ch)-1);
//             }
//         }
//         return true;
//     }
// }