class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            count += expand(s, i, i);
            count += expand(s, i, i+1);
        }
        return count;
    }

    private int expand(String s, int left, int right){
        int ecount = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            ecount++;
            left--;
            right++;
        }
        return ecount;
    }
}


// class Solution {
//     public int countSubstrings(String s) {
//         int count = 0;
//         for(int i = 0; i < s.length(); i++){
//             for(int j = i; j < s.length(); j++){
//                 if(isPalindrome(s.substring(i, j+1))){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private boolean isPalindrome(String s1){
//         int left = 0, right = s1.length()-1;
//         while(left < right){
//             if(s1.charAt(left) != s1.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }
