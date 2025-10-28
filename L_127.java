class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)){
            return 0;
        }
        Queue<String> queue=new LinkedList<>();
        Set<String> wordset=new HashSet<>(wordList);
        queue.offer(beginWord);
        int steps=1;
        while(!queue.isEmpty()){
            int qsize=queue.size();
            for(int i=0;i<qsize;i++){
                String word=queue.poll();
                if(word.equals(endWord)){
                    return steps;
                }
                char[] arr=word.toCharArray();
                for(int j=0;j<word.length();j++){
                    char orgch=arr[j];
                    for(char ch='a'; ch<='z';ch++){
                        arr[j]=ch;
                        String newWord=new String(arr);
                        if(wordset.contains(newWord)){
                            queue.offer(newWord);
                            wordset.remove(newWord);
                        }
                    }
                    arr[j]=orgch;

                }  
            }
            steps++;
        }
        return 0;
    }
}
