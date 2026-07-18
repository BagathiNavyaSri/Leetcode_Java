class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int leftMax = height[left], rightMax = height[right];
        int maxwater = 0;

        while(left < right){
            if(leftMax < rightMax){
                left += 1;
                leftMax = Math.max(leftMax, height[left]);
                maxwater += leftMax - height[left];
            }else{
                right -= 1;
                rightMax = Math.max(rightMax, height[right]);
                maxwater += rightMax - height[right];
            }
        }
        return maxwater;
    }
}

// //THIS IS BRUTE FORCE APPROACH. BUT HERE TIME EXCEEDS DUE TO CONSTRAINTS.

// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         int maxwater = 0;
//         for(int i = 0; i < n; i++){
//             int leftMax = 0, rightMax = 0;
//             for(int j = 0; j <= i; j++){
//                 leftMax = Math.max(leftMax, height[j]);
//             }
//             for(int j = i; j < n; j++){
//                 rightMax = Math.max(rightMax, height[j]);
//             }

//             maxwater += Math.min(leftMax, rightMax) - height[i];
//         }
//         return maxwater;
//     }
// }
