class Solution {
    public String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase(); // ignore case
            char firstChar = lower.charAt(0);

            //Identify which row the first letter belongs to
            Set<Character> currentRow;
            if (row1.contains(firstChar)) currentRow = row1;
            else if (row2.contains(firstChar)) currentRow = row2;
            else currentRow = row3;

            //Check if all letters of the word are in the same row
            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (!currentRow.contains(c)) {
                    valid = false;
                    break;
                }
            }
            if (valid){
                result.add(word);
            }   
        }
        return result.toArray(new String[0]);
    }
}
