class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return checkpali(s, left + 1, right) || checkpali(s, left, right - 1);
            }
        }
        return true;   //not going to else block - means it is palindrome
    }

    private boolean checkpali(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;  //even after removing one character we are not getting palindrome
            }
        }
        return true;
    }

}
