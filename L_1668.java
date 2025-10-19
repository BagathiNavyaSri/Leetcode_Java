class Solution {
    public int maxRepeating(String sequence, String word) {
        int cnt = 0;
        String temp = word;
        while(sequence.contains(temp)){
            cnt++;
            temp += word;
        }
        return cnt;
    }
}
