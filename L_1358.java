class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int left = 0;
        int count = 0;

        for(int right = 0;right < s.length(); right++){
            char ch = s.charAt(right);       
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);

            while(dict.size() == 3){          
                count += s.length() - right;
                
                //diminishing the window size
                char del_ch = s.charAt(left);    //removing the character pointed by left pointer
                dict.put(del_ch, dict.get(del_ch) - 1);

                // if the occurance of any character is 0 then remove the total key value pair
                if(dict.get(del_ch) == 0){
                    dict.remove(del_ch);
                }
                left++;
            }
        }
        return count;
    }
}
