class Solution {
    public int lengthOfLongestSubstring(String s) {
        //The final, most efficient solution improves the previous method by storing the index of each character in the map. This allows the Left pointer to jump directly past the last occurrence of a duplicate character, resulting in an optimal O(N) time complexity.
        
        int left = 0, maxlen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch)+1);
            }

            map.put(ch, right);
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxlen = 0;
//         int left = 0;
//         Map<Character, Integer> map = new HashMap<>();
//         for(int right = 0; right < s.length(); right++){
//             while(map.containsKey(s.charAt(right))){
//                 map.put(s.charAt(left), map.get(s.charAt(left))-1);
//                 if(map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
//                 left++;
//             }

//             map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
//             maxlen = Math.max(maxlen, right-left+1);
//         }
//         return maxlen;
//     }
// }

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0, maxlen = 0;
//         Map<Character, Integer> map = new HashMap<>();

//         for(int right = 0; right < s.length(); right++){
//             char ch = s.charAt(right);
//             map.put(ch, map.getOrDefault(ch, 0)+1);
            
//             while(map.get(ch) > 1){
//                 char leftChar = s.charAt(left);
//                 map.put(leftChar, map.get(leftChar)-1);
//                 left++;
//             }
//             maxlen = Math.max(maxlen, right-left+1);
//         }
//         return maxlen;
//     }
// }

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0; //left pointer
//         int mxLen = 0; 
//         Set<Character> set = new HashSet<>();
//         int currLen = 0;

//         for(int right = 0;right < s.length(); right++){
//             while(set.contains(s.charAt(right))){
//                 set.remove(s.charAt(left)); //remove the character pointed by left pointer in s
//                 left++;
//                 currLen--;
//             }
//             set.add(s.charAt(right));
//             currLen++;
//             mxLen = Math.max(mxLen,currLen);
//         }
//         return mxLen;
//     }
// }
