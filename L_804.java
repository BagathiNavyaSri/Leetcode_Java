class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> hs = new HashSet<>();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb;
        for(String word : words){
            sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                char ch = word.charAt(i);
                sb.append(arr[ch-97]);
            }
            hs.add(sb.toString());
        }
        return hs.size();
    }
}
