class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s1.toCharArray()){
            freq1[ch-'a']++;
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            freq2[s2.charAt(right)-'a']++;
            if(right-left+1 > s1.length()){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1 == s1.length()){
                boolean isMatch = true;
                for(int i = 0; i < 26; i++){
                    if(freq1[i] != freq2[i]){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch){
                    return true;
                }
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s2.length() < s1.length()) return false;

//         Map<Character, Integer> s1map = new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             s1map.put(ch, s1map.getOrDefault(ch, 0)+1);
//         }

//         Map<Character, Integer> s2map = new HashMap<>();
//         int left = 0;
//         for(int right = 0; right < s2.length(); right++){
//             char rch = s2.charAt(right);
//             s2map.put(rch, s2map.getOrDefault(rch, 0)+1);
//             if(right-left+1 > s1.length()){
//                 char lch = s2.charAt(left);
//                 s2map.put(lch, s2map.get(lch)-1);
//                 if(s2map.get(lch) == 0) s2map.remove(lch);
//                 left++;
//             }
//             if(right-left+1 == s1.length() && s1map.equals(s2map)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }



// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         if(s2.length() < s1.length()) return false;

//         Map<Character, Integer> map = new HashMap<>();
//         for(char ch : s1.toCharArray()){
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }
//         int count = s1.length();
//         int left = 0;
//         for(int right = 0; right < s2.length(); right++){
//             char ch = s2.charAt(right);
//             int val = map.getOrDefault(ch, 0);
//             if(val > 0) count--;
//             map.put(ch, val-1);

//             if(count == 0) return true;
            
//             if(right-left+1 == s1.length()){
//                 char leftChar = s2.charAt(left);
//                 int leftVal = map.get(leftChar);
//                 if(leftVal >= 0) count++;
//                 map.put(leftChar, leftVal + 1);

//                 left++;
//             }
//         }
//         return false;
//     }
// }
