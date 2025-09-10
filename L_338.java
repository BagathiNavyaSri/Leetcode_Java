class Solution {
    public static int[] countBits(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i = 1; i < n+1; i++){
            dp[i] = dp[i & (i-1)] + 1;
        }
        return dp;
    }
}

// class Solution {
//     public static int[] countBits(int n) {
//         int[] ans = new int[n+1];
//         for(int i = 0; i< n+1; i++){
//             int count = 0;
//             String binary = Integer.toBinaryString(i);
//             for(int j = 0; j<binary.length(); j++){
//                 if(binary.charAt(j) == '1'){
//                     count++;
//                 }
//             }
//             ans[i] = count; 
//         }
//         return ans;
//     }
//     public static void main(String[] args){
//         int n1 = 2;
//         int n2 = 5;
//         System.out.println(countBits(n1));
//         System.out.println(countBits(n2));
//     }

// }
