class Solution{
    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        backtrack(s, res, new ArrayList<>(), 0);
        return res;
    }
    public void backtrack(String s, List<List<String>> res, List<String> curr, int idx){
        if(idx == s.length()){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = idx; i < s.length(); i++){
            if(valid(idx, i, s)){ // idx is starting index and i is end index
                curr.add(s.substring(idx, i + 1));
                backtrack(s, res, curr, i + 1);
                curr.remove(curr.size() - 1);

            }
        }
    }

    public boolean valid(int start, int end, String s){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


// import java.util.*;
// class Solution {
//     public List<List<String>> partition(String s) {
//         List<List<String>> result = new ArrayList<>();
//         List<String> currentPartition = new ArrayList<>();
//         backtrack(s, 0, currentPartition, result);
//         return result;
//     } 
//     public void backtrack(String s, int start, List<String> currentPartition, List<List<String>> result) {
//         if (start == s.length()) {
//             result.add(new ArrayList<>(currentPartition));
//             return;
//         }
//         for (int end = start + 1; end <= s.length(); end++) {
//             String substring = s.substring(start, end);
//             if (isPalindrome(substring)) {
//                 currentPartition.add(substring);
//                 backtrack(s, end, currentPartition, result);
//                 currentPartition.remove(currentPartition.size() - 1);  // backtrack
//             }
//         }
//     }
//     public boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String s1 = "aab";
//         String s2 = "a";
//         List<List<String>> result1 = solution.partition(s1);
//         System.out.println("Result 1: " + result1); 
//         List<List<String>> result2 = solution.partition(s2);
//         System.out.println("Result 2: " + result2); 
//     }
// }
