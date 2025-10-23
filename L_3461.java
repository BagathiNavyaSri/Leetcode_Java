class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder();
        while(s.length() != 2){
            for(int left = 0; left < s.length()-1; left++){
                int f = (int)(s.charAt(left));
                int l = (int)(s.charAt(left + 1));
                sb.append((f + l) % 10);
            }
            s = sb.toString();
            sb.setLength(0);
        }
        return s.charAt(0) == s.charAt(1);
    }
}
