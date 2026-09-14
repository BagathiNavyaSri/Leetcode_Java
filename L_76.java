// With one HashMap

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int count = t.length();
        String ans = "";
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char rch = s.charAt(right);
            if(map.containsKey(rch)){
                if(map.get(rch) > 0) count--;
                map.put(rch, map.get(rch)-1);
            }

            while(count == 0){
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    ans = s.substring(left, right+1);
                }
                char lch = s.charAt(left);
                if(map.containsKey(lch)){
                    map.put(lch, map.get(lch)+1);
                    if(map.get(lch) > 0) count++;
                }
                left++;
            }
        }
        return ans;
    }
}


// // With two Hashmaps

// class Solution {
//     public String minWindow(String s, String t) {
//         String ans = "";
//         int minLen = Integer.MAX_VALUE;
//         Map<Character, Integer> tMap = new HashMap<>();
//         Map<Character, Integer> sMap = new HashMap<>();
//         for(char ch : t.toCharArray()){
//             tMap.put(ch, tMap.getOrDefault(ch, 0)+1);
//         }

//         int count = t.length();
//         int left = 0;

//         for(int right = 0; right < s.length(); right++){
//             char r_ch = s.charAt(right);
//             sMap.put(r_ch, sMap.getOrDefault(r_ch, 0)+1);

//             if(tMap.containsKey(r_ch) && sMap.get(r_ch) <= tMap.get(r_ch)){
//                 count--;
//             }

//             while(count == 0){
//                 if(right-left+1 < minLen){
//                     minLen = right-left+1;
//                     ans = s.substring(left, right+1);
//                 }
//                 char l_ch = s.charAt(left);
//                 sMap.put(l_ch, sMap.get(l_ch)-1);
//                 if(tMap.containsKey(l_ch) && sMap.get(l_ch) < tMap.get(l_ch)){
//                     count++;
//                 }
//                 left++;
//             }
//         }
//         return ans;
//     }
// }
