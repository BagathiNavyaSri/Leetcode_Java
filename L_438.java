class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //optimized sliding window approach with 1 hashmap
        List<Integer> res = new ArrayList<>();

        Map<Character, Integer> p_map = new HashMap<>();
        for(char ch: p.toCharArray()){
            p_map.put(ch, p_map.getOrDefault(ch, 0)+1);
        }

        int left = 0, count = p.length();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            int val = p_map.getOrDefault(ch, 0);
            if(val > 0) count--;
            p_map.put(ch, val-1);

            //shrinking
            if(right-left+1 > p.length()){
                char leftChar = s.charAt(left);

                int leftVal = p_map.getOrDefault(leftChar, 0);
                if(leftVal >= 0) count++;
                p_map.put(leftChar, leftVal+1);

                left++;
            }

            if(count == 0){
                res.add(left);
            }

        }
        return res;
    }
}


// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         //optimized sliding window approach with 2 hashmaps
//         List<Integer> res = new ArrayList<>();
//         if(s.length() < p.length()) return res;
//         Map<Character, Integer> p_map = new HashMap<>();
//         for(char ch : p.toCharArray()){
//             p_map.put(ch, p_map.getOrDefault(ch, 0)+1);
//         }

//         int left = 0,  count = p.length();
//         Map<Character, Integer> s_map = new HashMap<>();

//         for(int right = 0; right < s.length(); right++){
//             char ch = s.charAt(right);
//             s_map.put(ch, s_map.getOrDefault(ch, 0)+1);
            
//             if(p_map.containsKey(ch) && s_map.get(ch) <= p_map.get(ch)){
//                 count--;
//             } 

//             if(right-left+1 > p.length()){
//                 char leftChar = s.charAt(left);
//                 if(p_map.containsKey(leftChar) && s_map.get(leftChar) <= p_map.get(leftChar)){
//                     count++;
//                 }
//                 s_map.put(leftChar, s_map.get(leftChar)-1);
//                 left++;
//             }
//             if(count == 0){
//                 res.add(left);  
//             }
//         }
//         return res;
//     }
// }


// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         //Instead of sorting the retrieved substrings of size k(string p size) from string s   and then checking its equality with string p , which also adds unnecessary time complexity, the approach uses frequency arrays of size 26 to store character counts for both the target string P and each substring of S
//         List<Integer> res = new ArrayList<>();
//         int n = s.length();
//         int k = p.length();

//         //builidng p array
//         int[] p_arr = new int[26];
//         for(char ch: p.toCharArray()){
//             p_arr[ch-'a']++;
//         }

//         for(int i = 0; i <= n-k; i++){
//             int[] s_arr = new int[26];
//             for(int j = i; j <= i+k-1; j++){
//                 s_arr[s.charAt(j) - 'a']++;
//             }

//             if(Arrays.equals(s_arr, p_arr)){
//                 res.add(i);
//             }
//         }
//         return res;
//     }
// }
