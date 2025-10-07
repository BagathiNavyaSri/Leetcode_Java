class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        //u can use list as well for vowels but for searching set is preferred.
        //List<Character> vowels=new ArrayList<>(List.of('a','e','i','o','u'));
        int left = 0;
        int currCnt = 0;

        for(int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i))){
                currCnt++;
            }
        }
        int mx = currCnt;

        for(int right = k;right<s.length(); right++){
            if(vowels.contains(s.charAt(left))){
                currCnt--;
            }
            if(vowels.contains(s.charAt(right))){
                currCnt++;
            }
            left++;
            mx = Math.max(mx, currCnt);
        }
        return mx;
    }
}
